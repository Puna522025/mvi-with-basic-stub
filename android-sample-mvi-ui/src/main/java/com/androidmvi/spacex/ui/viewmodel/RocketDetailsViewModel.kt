package com.androidmvi.spacex.ui.viewmodel

import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.androidmvi.spacex.network.dto.RocketsException
import com.androidmvi.spacex.network.usecase.RocketDetailsUseCase
import javax.inject.Inject

class RocketDetailsViewModel @Inject constructor(
    private val rocketDetailsUseCase: RocketDetailsUseCase
) : BaseViewModel() {
    private val rocketDetailsData: StateLiveData<List<GetRocketDetailsDomainModel>> = StateLiveData()

    fun getRocketDetails(id: String) {
        rocketDetailsData.postLoading()
        addDisposable(
            rocketDetailsUseCase.getRocketDetails(id)
                .subscribe({
                    rocketDetailsData.postSuccess(it)
                }, {
                    val swError = RocketsException.fromThrowable(it).error
                    rocketDetailsData.postError(swError)
                    //rocketDetailsData.postError(it)
                })
        )
    }

    fun getRocketDetailsViewModelObservable(): StateLiveData<List<GetRocketDetailsDomainModel>> {
        return rocketDetailsData
    }
}