package com.androidmvi.spacex.network.usecase

import com.androidmvi.spacex.network.api.SpaceXApi
import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.androidmvi.spacex.network.dto.Query
import com.androidmvi.spacex.network.dto.RocketDetailsRequest
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RocketDetailsUseCase @Inject constructor(private val spaceXApi: SpaceXApi) {

    fun getRocketDetails(id: String): Single<List<GetRocketDetailsDomainModel>> {

        val query = Query(id)
        val request = RocketDetailsRequest(query)

        return spaceXApi.getRocketDetails(request)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {
                GetRocketDetailsDomainModel.toDomainModel(it)
            }.map(::getSortedLaunchDetails)
    }

    private fun getSortedLaunchDetails(rocketDetailsDomainModel: List<GetRocketDetailsDomainModel>): List<GetRocketDetailsDomainModel> {

        var domainModel: GetRocketDetailsDomainModel

        val domainModelList = arrayListOf<GetRocketDetailsDomainModel>()

        var sectionName = 1
        rocketDetailsDomainModel
            .sortedWith(
                compareBy { it.date_utc })
            .forEach {
                if (sectionName != it.date_utc.year) {
                    sectionName = it.date_utc.year
                    domainModel =
                        GetRocketDetailsDomainModel(
                            it.name,
                            it.success,
                            it.date_utc,
                            it.patch,
                            true
                        )
                    domainModelList.add(domainModel)
                }
                domainModel =
                    GetRocketDetailsDomainModel(it.name, it.success, it.date_utc, it.patch, false)
                domainModelList.add(domainModel)
            }

        return domainModelList
    }
}