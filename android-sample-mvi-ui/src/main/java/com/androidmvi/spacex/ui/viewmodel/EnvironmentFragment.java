package com.androidmvi.spacex.ui.viewmodel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.androidmvi.network.injection.NetworkModule;
import com.androidmvi.spacex.network.injection.QaApiUrlConfig;
import com.androidmvi.spacex.network.injection.Server;
import com.androidmvi.spacex.ui.MainActivity;
import com.androidmvi.spacex.ui.base.BaseFragment;
import com.androidmvi.spacex.ui.fragments.RocketListFragment;
import com.androidmvi.spacex.ui.fragments.SplashFragment;
import com.androidmvi.spacex.ui.injection.CustomViewModelFactory;

import com.androidmvi.spacex.network.Constants;
import com.com.androidmvi.spacex.ui.databinding.FragmentEnvironmentSelectorBinding;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mobile.sw.environmentselection.EnvironmentsDomainModel;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import pl.openrnd.multilevellistview.ItemInfo;
import pl.openrnd.multilevellistview.MultiLevelListView;
import pl.openrnd.multilevellistview.OnItemClickListener;

@AndroidEntryPoint
public class EnvironmentFragment extends BaseFragment<FragmentEnvironmentSelectorBinding> implements OnItemClickListener {

    private static final String HTTP = "http";

    @Inject
    SharedPreferences mPreference;
    @Inject
    CustomViewModelFactory mCustomViewModelFactory;

    private Handler mMainThreadHandler;
    private EnvironmentSelectorAdapter mEnvironmentSelectorAdapter;
    private EnvironnmentViewModel mEnvironmentViewModel;
    private EnvironmentsDomainModel mEnvironmentsDomainModel;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mMainThreadHandler = new Handler(context.getMainLooper());
        } catch (ClassCastException e) {
            //Logger.e(e);
            throw new ClassCastException(context + " must implement NavigationalHandler");
        }
    }

    /**
     * Observe ViewModel for the Welcome Data
     */
    private void observeViewModel() {
        mEnvironmentViewModel = ViewModelProviders
                .of(this, mCustomViewModelFactory).get(EnvironnmentViewModel.class);
        mEnvironmentViewModel.getEnvironmentObservable().observe(getViewLifecycleOwner(),
                this::performActionOnObserverState);
    }

    @Override
    public void onCreateViewBinding(@NonNull LayoutInflater inflater,
                                    @Nullable ViewGroup container,
                                    @Nullable Bundle savedInstanceState) {
        binding = FragmentEnvironmentSelectorBinding.inflate(inflater, container, false);
        bindListeners();
    }

    private void bindListeners() {
        binding.environmentSelectorList.setOnItemClickListener(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        observeViewModel();
        getEnvironments();
    }

    private void getEnvironments() {
        mEnvironmentViewModel.getEnvironments(getContext());
    }

    private void displayEnvironments(final EnvironmentsDomainModel environmentsDomainModel) {
        mMainThreadHandler.post(() -> {
            mEnvironmentSelectorAdapter = new EnvironmentSelectorAdapter(requireContext());
            binding.environmentSelectorList.setAdapter(mEnvironmentSelectorAdapter);
            List<EnvironmentGroup> dataItems = environmentsDomainModel.getEnvironmentGroups();

            mEnvironmentSelectorAdapter.setDataItems(dataItems);
        });
    }

    @Override
    public void onItemClicked(MultiLevelListView multiLevelListView,
                              View view,
                              Object o,
                              ItemInfo itemInfo) {
        if (o instanceof Server) {
            selectServer((Server) o);
        }
    }

    private void selectServer(@NonNull final Server server) {
        final SharedPreferences.Editor editor = mPreference.edit();
        try {
            final String json = new ObjectMapper().writeValueAsString(server);
            editor.putString(Constants.SELECTED_ENVIRONMENT_SERVER, json);
            editor.putString(Constants.SELECTED_ENVIRONMENT_URL, server.getAuthUrl());
            editor.apply();

            refreshDependencyGraphWithNewNetworkConfig(server);
            launchSplash();
        } catch (JsonProcessingException e) {
        }
    }

    private void refreshDependencyGraphWithNewNetworkConfig(@NonNull Server server) {
//        final SplashActivity splashActivity = (SplashActivity) mBaseActivity;
//        ((SwApplication) splashActivity.getApplication()).injectDependencies(new QaApiUrlConfig(server));
//        splashActivity.injectDependencies();
        NetworkModule.setQAConfig(new QaApiUrlConfig(server));
    }

    private void launchSplash() {
        ((MainActivity) requireActivity()).loadFragment(SplashFragment.Companion.getInstance(), false);
    }

    @Override
    public void onGroupItemClicked(MultiLevelListView parent,
                                   View view,
                                   Object item,
                                   ItemInfo itemInfo) {
        // Not required.
    }

    private void getEnvironments(@NonNull final String pathEntered) {
        for (EnvironmentGroup group : mEnvironmentsDomainModel.getEnvironmentGroups()) {
            for (Environment environment : group.getEnvironments()) {
                getServers(pathEntered, environment);
            }
        }
    }

    private void getServers(@NonNull final String pathEntered,
                            @NonNull final Environment environment) {
        for (Server server : environment.getServers()) {
            if (pathEntered
                    .replaceAll(" ",
                            "")
                    .equalsIgnoreCase(server.getName().replaceAll(" ",
                            ""))) {
                selectServer(server);
            }
        }
    }

    private void performActionOnObserverState(@Nullable final
                                              StateData<EnvironmentsDomainModel> stateData) {
        if (stateData != null && stateData.getStatus() == StateData.DataStatus.SUCCESS
                && null != stateData.getData()) {
            mEnvironmentsDomainModel = stateData.getData();
            displayEnvironments(mEnvironmentsDomainModel);
        }
    }

    @Override
    public void onDestroyView() {
        mEnvironmentViewModel.getEnvironmentObservable().removeObservers(getViewLifecycleOwner());
        mEnvironmentViewModel.getEnvironmentObservable().postValue(null);
        super.onDestroyView();
    }
}
