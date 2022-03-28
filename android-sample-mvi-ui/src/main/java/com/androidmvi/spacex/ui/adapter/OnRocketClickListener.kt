package com.androidmvi.spacex.ui.adapter

import com.androidmvi.spacex.network.domain.GetRocketsDomainModel

interface OnRocketClickListener {
    fun onRocketClick(model: GetRocketsDomainModel)
}