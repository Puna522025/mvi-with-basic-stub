package com.androidmvi.spacex.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.androidmvi.spacex.network.dto.RocketsException
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer

open class BaseViewModel : ViewModel() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    fun <T> stateDataErrorHandler(stateData: StateLiveData<MainViewState>, throwable: Throwable) {
        val swError = RocketsException.fromThrowable(throwable).error
        stateData.postError(swError)
    }
}