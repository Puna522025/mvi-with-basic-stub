package com.androidmvi.spacex.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010#\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\u0004\u0012\u00020\u00160$H\u0002J\u0016\u0010\'\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/androidmvi/spacex/ui/fragments/RocketListFragment;", "Lcom/androidmvi/spacex/ui/base/BaseFragment;", "Lcom/com/androidmvi/spacex/ui/databinding/RocketsListFragmentBinding;", "Lcom/androidmvi/spacex/ui/adapter/OnRocketClickListener;", "()V", "customViewModelFactory", "Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;", "getCustomViewModelFactory", "()Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;", "setCustomViewModelFactory", "(Lcom/androidmvi/spacex/ui/injection/CustomViewModelFactory;)V", "rocketListViewModel", "Lcom/androidmvi/spacex/ui/viewmodel/RocketListViewModel;", "rocketsListAdapter", "Lcom/androidmvi/spacex/ui/adapter/RocketsListAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "onCreateViewBinding", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRocketClick", "model", "Lcom/androidmvi/spacex/network/domain/GetRocketsDomainModel;", "onViewCreated", "view", "Landroid/view/View;", "processData", "Lkotlin/Function1;", "Lcom/androidmvi/spacex/ui/viewmodel/StateData;", "Lcom/androidmvi/spacex/ui/viewmodel/MainViewState;", "setAdapterData", "stateData", "setSpinnerDetails", "Companion", "android-sample-mvi-ui_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RocketListFragment extends com.androidmvi.spacex.ui.base.BaseFragment<com.com.androidmvi.spacex.ui.databinding.RocketsListFragmentBinding> implements com.androidmvi.spacex.ui.adapter.OnRocketClickListener {
    @javax.inject.Inject()
    public com.androidmvi.spacex.ui.injection.CustomViewModelFactory customViewModelFactory;
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPreferences;
    private com.androidmvi.spacex.ui.viewmodel.RocketListViewModel rocketListViewModel;
    private final com.androidmvi.spacex.ui.adapter.RocketsListAdapter rocketsListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.spacex.ui.fragments.RocketListFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.ui.injection.CustomViewModelFactory getCustomViewModelFactory() {
        return null;
    }
    
    public final void setCustomViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.ui.injection.CustomViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
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
    
    private final void setSpinnerDetails() {
    }
    
    private final kotlin.jvm.functions.Function1<com.androidmvi.spacex.ui.viewmodel.StateData<com.androidmvi.spacex.ui.viewmodel.MainViewState>, kotlin.Unit> processData() {
        return null;
    }
    
    private final void setAdapterData(com.androidmvi.spacex.ui.viewmodel.StateData<com.androidmvi.spacex.ui.viewmodel.MainViewState> stateData) {
    }
    
    @java.lang.Override()
    public void onRocketClick(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.domain.GetRocketsDomainModel model) {
    }
    
    public RocketListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/androidmvi/spacex/ui/fragments/RocketListFragment$Companion;", "", "()V", "getInstance", "Lcom/androidmvi/spacex/ui/fragments/RocketListFragment;", "android-sample-mvi-ui_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.androidmvi.spacex.ui.fragments.RocketListFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}