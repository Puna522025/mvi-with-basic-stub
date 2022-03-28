package com.androidmvi.spacex.ui.viewmodel

import com.androidmvi.spacex.network.domain.GetRocketsDomainModel

data class MainViewState(val rockets: List<GetRocketsDomainModel>,
                         val details: String? = null)