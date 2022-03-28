package com.androidmvi.spacex.ui.viewmodel;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import com.androidmvi.spacex.utils.Utilities;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import com.mobile.sw.environmentselection.EnvironmentsDomainModel;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;

public class EnvironnmentViewModel extends BaseViewModel {
    private final StateLiveData<EnvironmentsDomainModel> mEnvironmentData;

    @Inject
    public EnvironnmentViewModel() {
        super();
        mEnvironmentData = new StateLiveData<>();
    }

    /**
     * Get Registration Data Model
     * @param context
     */
    public void getEnvironments(Context context) {
        addDisposable(getEnvironmentGroups("url_test_config.json", context)
                .subscribe(new Consumer<EnvironmentsDomainModel>() {
                    @Override
                    public void accept(EnvironmentsDomainModel environmentsDomainModel) {
                        mEnvironmentData.postSuccess(environmentsDomainModel);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        // Error Handling not required.
                        Log.d("", throwable.getLocalizedMessage());
                    }
                }));
    }

    /**
     * @return Observable that returns a list of environment group objects (only for dev/qa)
     */
    private Observable<EnvironmentsDomainModel> getEnvironmentGroups(final String urlConfig, Context context) {
        return Observable.defer(new Callable<ObservableSource<EnvironmentsDomainModel>>() {
            @Override
            public ObservableSource<EnvironmentsDomainModel> call() throws Exception {
                final List<EnvironmentGroup> environmentList =
                        new ObjectMapper().readValue(Utilities.Companion.readAssetAsString(urlConfig, context),
                                new TypeReference<ArrayList<EnvironmentGroup>>() {
                                });

                if (environmentList != null) {
                    return Observable.just(new EnvironmentsDomainModel(environmentList));
                } else {
                    return Observable.error(new Exception("Empty Environment List"));
                }
            }
        });
    }

    /**
     * Return EnvironnmentViewModel data object
     *
     * @return EnvironnmentViewModel
     */
    @NonNull
    public StateLiveData<EnvironmentsDomainModel> getEnvironmentObservable() {
        return mEnvironmentData;
    }
}
