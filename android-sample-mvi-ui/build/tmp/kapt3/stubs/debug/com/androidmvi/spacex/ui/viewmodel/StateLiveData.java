package com.androidmvi.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/StateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/androidmvi/spacex/ui/viewmodel/StateData;", "()V", "postError", "", "error", "Lcom/androidmvi/spacex/network/dto/ErrorResponse;", "postLoading", "postSuccess", "data", "(Ljava/lang/Object;)V", "android-sample-mvi-ui_debug"})
public final class StateLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<com.androidmvi.spacex.ui.viewmodel.StateData<T>> {
    
    public final void postLoading() {
    }
    
    public final void postError(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.dto.ErrorResponse error) {
    }
    
    public final void postSuccess(T data) {
    }
    
    public StateLiveData() {
        super(null);
    }
}