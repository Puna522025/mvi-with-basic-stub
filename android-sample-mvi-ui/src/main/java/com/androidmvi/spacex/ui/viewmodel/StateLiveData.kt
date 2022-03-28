package com.androidmvi.spacex.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.androidmvi.spacex.network.dto.ErrorResponse

class StateLiveData<T> : MutableLiveData<StateData<T>?>() {

    fun postLoading() {
        postValue(StateData<T>().loading())
    }

    fun postError(error: ErrorResponse) {
        postValue(StateData<T>().error(error))
    }

    fun postSuccess(data: T) {
        postValue(StateData<T>().success(data))
    }
}