package com.androidmvi.spacex.network.domain

import com.androidmvi.spacex.network.dto.GetDetailsResponse
import java.util.*

data class GetRocketDetailsDomainModel(
    val name: String,
    val success: Boolean,
    val date_utc: Date,
    val patch: String?,
    val isSection : Boolean = false
) {
    companion object {
        fun toDomainModel(
            getDetailsResponse: GetDetailsResponse
        ): List<GetRocketDetailsDomainModel> {

            val rocketDetails = arrayListOf<GetRocketDetailsDomainModel>()

            getDetailsResponse.docs.forEach {
                rocketDetails.add(
                    GetRocketDetailsDomainModel(
                        it.name,
                        it.success,
                        it.date_utc,
                        it.links.patch.small
                    )
                )
            }
            return rocketDetails
        }
    }
}