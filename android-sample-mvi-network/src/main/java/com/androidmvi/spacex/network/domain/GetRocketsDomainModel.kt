package com.androidmvi.spacex.network.domain

import android.os.Parcelable
import com.androidmvi.spacex.network.dto.GetRocketsResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class GetRocketsDomainModel(
    val id: String,
    val name: String,
    val country: String,
    val engineCount: Int,
    val active: Boolean,
    val description: String,
    val flickr_images: List<String>
) : Parcelable {
    companion object {
        fun toDomainModel(
            rocketsResponse: List<GetRocketsResponse>
        ): List<GetRocketsDomainModel> {

            val listOfRockets = arrayListOf<GetRocketsDomainModel>()

            rocketsResponse.forEach {
                listOfRockets.add(
                    GetRocketsDomainModel(
                        it.id,
                        it.name,
                        it.country,
                        it.engines.number,
                        it.active,
                        it.description,
                        it.flickr_images
                    )
                )
            }
            return listOfRockets
        }
    }
}