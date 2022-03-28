package com.androidmvi.spacex.network.repository

import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import com.androidmvi.spacex.network.usecase.RocketListUseCase
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RocketsListRepository @Inject constructor(private val rocketListUseCase: RocketListUseCase) {

    private var listOfRockets = listOf<GetRocketsDomainModel>()

    fun setListOfRockets(rockets: List<GetRocketsDomainModel>) {
        listOfRockets = rockets
    }

    fun fetchRocketList(): Single<List<GetRocketsDomainModel>> {
        return rocketListUseCase.getRocketList()
    }

    val getListOfRockets: List<GetRocketsDomainModel>
        get() = listOfRockets
}