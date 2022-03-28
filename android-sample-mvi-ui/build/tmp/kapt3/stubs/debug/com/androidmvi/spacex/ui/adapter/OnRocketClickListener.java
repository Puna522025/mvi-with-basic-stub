package com.androidmvi.spacex.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/androidmvi/spacex/ui/adapter/OnRocketClickListener;", "", "onRocketClick", "", "model", "Lcom/androidmvi/spacex/network/domain/GetRocketsDomainModel;", "android-sample-mvi-ui_debug"})
public abstract interface OnRocketClickListener {
    
    public abstract void onRocketClick(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.domain.GetRocketsDomainModel model);
}