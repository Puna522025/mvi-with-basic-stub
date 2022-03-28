package com.androidmvi.spacex.network.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/androidmvi/spacex/network/usecase/RocketDetailsUseCase;", "", "spaceXApi", "Lcom/androidmvi/spacex/network/api/SpaceXApi;", "(Lcom/androidmvi/spacex/network/api/SpaceXApi;)V", "getRocketDetails", "Lio/reactivex/Single;", "", "Lcom/androidmvi/spacex/network/domain/GetRocketDetailsDomainModel;", "id", "", "getSortedLaunchDetails", "rocketDetailsDomainModel", "android-sample-mvi-network_debug"})
public final class RocketDetailsUseCase {
    private final com.androidmvi.spacex.network.api.SpaceXApi spaceXApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel>> getRocketDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    private final java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel> getSortedLaunchDetails(java.util.List<com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel> rocketDetailsDomainModel) {
        return null;
    }
    
    @javax.inject.Inject()
    public RocketDetailsUseCase(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.api.SpaceXApi spaceXApi) {
        super();
    }
}