package com.androidmvi.spacex.ui.viewmodel

import com.androidmvi.spacex.network.dto.ErrorResponse

class StateData<T> {

    private var mStatus: DataStatus? = null

    private var mData: T? = null

    private var mError: ErrorResponse? = null

    fun loading(): StateData<T>? {
        mStatus = DataStatus.LOADING
        mData = null
        mError = null
        return this
    }

    fun success(data: T): StateData<T>? {
        mStatus = DataStatus.SUCCESS
        mData = data
        mError = null
        return this
    }

    fun error(error: ErrorResponse?): StateData<T>? {
        mStatus = DataStatus.ERROR
        mData = null
        mError = error
        return this
    }

    fun getStatus(): DataStatus? {
        return mStatus
    }

    fun getData(): T? {
        return mData
    }

    fun getError(): ErrorResponse? {
        return mError
    }

    enum class DataStatus {
        SUCCESS, ERROR, LOADING
    }
}