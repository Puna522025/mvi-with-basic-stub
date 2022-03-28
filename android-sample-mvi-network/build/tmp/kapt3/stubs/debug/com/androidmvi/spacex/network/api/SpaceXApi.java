package com.androidmvi.spacex.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/androidmvi/spacex/network/api/SpaceXApi;", "", "getRocketDetails", "Lio/reactivex/Single;", "Lcom/androidmvi/spacex/network/dto/GetDetailsResponse;", "request", "Lcom/androidmvi/spacex/network/dto/RocketDetailsRequest;", "getSpaceXRockets", "", "Lcom/androidmvi/spacex/network/dto/GetRocketsResponse;", "android-sample-mvi-network_debug"})
public abstract interface SpaceXApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "rockets")
    public abstract io.reactivex.Single<java.util.List<com.androidmvi.spacex.network.dto.GetRocketsResponse>> getSpaceXRockets();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "launches/query")
    public abstract io.reactivex.Single<com.androidmvi.spacex.network.dto.GetDetailsResponse> getRocketDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.androidmvi.spacex.network.dto.RocketDetailsRequest request);
}