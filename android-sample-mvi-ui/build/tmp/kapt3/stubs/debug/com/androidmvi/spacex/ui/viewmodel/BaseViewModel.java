package com.androidmvi.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0006H\u0014J\"\u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "onCleared", "stateDataErrorHandler", "T", "stateData", "Lcom/androidmvi/spacex/ui/viewmodel/StateLiveData;", "Lcom/androidmvi/spacex/ui/viewmodel/MainViewState;", "throwable", "", "android-sample-mvi-ui_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final <T extends java.lang.Object>void stateDataErrorHandler(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.ui.viewmodel.StateLiveData<com.androidmvi.spacex.ui.viewmodel.MainViewState> stateData, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    public BaseViewModel() {
        super();
    }
}