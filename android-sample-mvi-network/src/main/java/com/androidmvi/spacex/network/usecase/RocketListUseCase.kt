package com.androidmvi.spacex.network.usecase

import com.androidmvi.spacex.network.api.SpaceXApi
import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RocketListUseCase @Inject constructor(private val spaceXApi: SpaceXApi) {

    fun getRocketList(): Single<List<GetRocketsDomainModel>> {
        return spaceXApi.getSpaceXRockets()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { GetRocketsDomainModel.toDomainModel(it) }
    }
}