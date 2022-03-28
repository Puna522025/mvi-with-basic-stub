package com.androidmvi.spacex.network.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetRocketsResponse(
    @param:JsonProperty("id") val id: String,
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("country") val country: String,
    @param:JsonProperty("active") val active: Boolean,
    @param:JsonProperty("engines") val engines: Engines,
    @param:JsonProperty("description") val description: String,
    @param:JsonProperty("flickr_images") val flickr_images: List<String>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Engines(@param:JsonProperty("number") val number: Int)