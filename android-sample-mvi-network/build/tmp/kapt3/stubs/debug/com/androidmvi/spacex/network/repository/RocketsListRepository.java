package com.androidmvi.spacex.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\fJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/androidmvi/spacex/network/repository/RocketsListRepository;", "", "rocketListUseCase", "Lcom/androidmvi/spacex/network/usecase/RocketListUseCase;", "(Lcom/androidmvi/spacex/network/usecase/RocketListUseCase;)V", "getListOfRockets", "", "Lcom/androidmvi/spacex/network/domain/GetRocketsDomainModel;", "getGetListOfRockets", "()Ljava/util/List;", "listOfRockets", "fetchRocketList", "Lio/reactivex/Single;", "setListOfRockets", "", "rockets", "android-sample-mvi-network_debug"})
@javax.inject.Singleton()
public final class RocketsListRepository {
    private java.util.List<com.androidmvi.spacex.network.domain.GetRocketsDomainModel> listOfRockets;
    private final com.androidmvi.spacex.network.usecase.RocketListUseCase rocketListUseCase = null;
    
    public final void setListOfRockets(@org.jetbrains.annotations.NotNull()
    java.util.List<com.androidmvi.spacex.network.domain.GetRocketsDomainModel> rockets) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.androidmvi.spacex.network.domain.GetRocketsDomainModel>> fetchRocketList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.androidmvi.spacex.network.domain.GetRocketsDomainModel> getGetListOfRockets() {
        return null;
    }
    
    @javax.inject.Inject()
    public RocketsListRepository(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.usecase.RocketListUseCase rocketListUseCase) {
        super();
    }
}