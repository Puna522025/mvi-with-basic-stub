package com.androidmvi.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/RocketDetailsViewModel;", "Lcom/androidmvi/spacex/ui/viewmodel/BaseViewModel;", "rocketDetailsUseCase", "Lcom/androidmvi/spacex/network/usecase/RocketDetailsUseCase;", "(Lcom/androidmvi/spacex/network/usecase/RocketDetailsUseCase;)V", "rocketDetailsData", "Lcom/androidmvi/spacex/ui/viewmodel/StateLiveData;", "", "Lcom/androidmvi/spacex/network/domain/GetRocketDetailsDomainModel;", "getRocketDetails", "", "id", "", "getRocketDetailsViewModelObservable", "android-sample-mvi-ui_debug"})
public final class RocketDetailsViewModel extends com.androidmvi.spacex.ui.viewmodel.BaseViewModel {
    private final com.androidmvi.spacex.ui.viewmodel.StateLiveData<java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel>> rocketDetailsData = null;
    private final com.androidmvi.spacex.network.usecase.RocketDetailsUseCase rocketDetailsUseCase = null;
    
    public final void getRocketDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androidmvi.spacex.ui.viewmodel.StateLiveData<java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel>> getRocketDetailsViewModelObservable() {
        return null;
    }
    
    @javax.inject.Inject()
    public RocketDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.usecase.RocketDetailsUseCase rocketDetailsUseCase) {
        super();
    }
}