package com.androidmvi.spacex.ui.viewmodel

sealed class MainStateEvent {
    object GetRockets : MainStateEvent()
    class GetRocketsById(val id: String) : MainStateEvent()
    class FilterData(val status: String) : MainStateEvent()
    object Loading : MainStateEvent() //Loading UI state
}