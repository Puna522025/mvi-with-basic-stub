package com.androidmvi.spacex.network.api

import com.androidmvi.spacex.network.dto.GetDetailsResponse
import com.androidmvi.spacex.network.dto.GetRocketsResponse
import com.androidmvi.spacex.network.dto.RocketDetailsRequest
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface SpaceXApi {

    @GET("rockets")
    fun getSpaceXRockets(): Single<List<GetRocketsResponse>>

    @POST("launches/query")
    fun getRocketDetails(@Body request: RocketDetailsRequest): Single<GetDetailsResponse>
}