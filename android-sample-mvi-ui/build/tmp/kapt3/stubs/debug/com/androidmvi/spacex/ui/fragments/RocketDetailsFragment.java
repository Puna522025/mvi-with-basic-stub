package com.androidmvi.spacex.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d0\u001cH\u0002J\u001e\u0010 \u001a\u00020\u00112\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001dH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/androidmvi/spacex/ui/fragments/RocketDetailsFragment;", "Lcom/androidmvi/spacex/ui/base/BaseFragment;", "Lcom/com/androidmvi/spacex/ui/databinding/RocketDetailsFragmentBinding;", "()V", "customViewModelFactory", "Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;", "getCustomViewModelFactory", "()Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;", "setCustomViewModelFactory", "(Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;)V", "getRocketsDomainModel", "Lcom/androidmvi/spacex/network/domain/GetRocketsDomainModel;", "rocketDetailsViewModel", "Lcom/androidmvi/spacex/ui/viewmodel/RocketDetailsViewModel;", "rocketLaunchDetailsAdapter", "Lcom/androidmvi/spacex/ui/adapter/RocketLaunchDetailsAdapter;", "onCreateViewBinding", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "processRocketDetails", "Landroidx/lifecycle/Observer;", "Lcom/androidmvi/spacex/ui/viewmodel/StateData;", "", "Lcom/androidmvi/spacex/network/domain/GetRocketDetailsDomainModel;", "setAdapter", "stateData", "Companion", "android-sample-mvi-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RocketDetailsFragment extends com.androidmvi.spacex.ui.base.BaseFragment<com.com.androidmvi.spacex.ui.databinding.RocketDetailsFragmentBinding> {
    @javax.inject.Inject()
    public com.androidmvi.spacex.ui.injection.CustomViewModelFactory customViewModelFactory;
    private com.androidmvi.spacex.ui.viewmodel.RocketDetailsViewModel rocketDetailsViewModel;
    private com.androidmvi.spacex.network.domain.GetRocketsDomainModel getRocketsDomainModel;
    private final com.androidmvi.spacex.ui.adapter.RocketLaunchDetailsAdapter rocketLaunchDetailsAdapter = null;
    private static final java.lang.String BUNDLE_DETAILS = "BUNDLE_DETAILS";
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.spacex.ui.fragments.RocketDetailsFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.ui.injection.CustomViewModelFactory getCustomViewModelFactory() {
        return null;
    }
    
    public final void setCustomViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.ui.injection.CustomViewModelFactory p0) {
    }
    
    @java.lang.Override()
    public void onCreateViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.lifecycle.Observer<com.androidmvi.spacex.ui.viewmodel.StateData<java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel>>> processRocketDetails() {
        return null;
    }
    
    private final void setAdapter(com.androidmvi.spacex.ui.viewmodel.StateData<java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel>> stateData) {
    }
    
    public RocketDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/androidmvi/spacex/ui/fragments/RocketDetailsFragment$Companion;", "", "()V", "BUNDLE_DETAILS", "", "getInstance", "Lcom/androidmvi/spacex/ui/fragments/RocketDetailsFragment;", "model", "Lcom/androidmvi/spacex/network/domain/GetRocketsDomainModel;", "android-sample-mvi-ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.androidmvi.spacex.ui.fragments.RocketDetailsFragment getInstance(@org.jetbrains.annotations.NotNull()
        com.androidmvi.spacex.network.domain.GetRocketsDomainModel model) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}