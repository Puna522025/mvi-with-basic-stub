package com.androidmvi.spacex.network.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetDetailsResponse(
    @param:JsonProperty("docs") val docs: List<GetRocketDetailsResponse>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetRocketDetailsResponse(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("success") val success: Boolean,
    @param:JsonProperty("date_utc") val date_utc: Date,
    @param:JsonProperty("links") val links: Links
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Links(@param:JsonProperty("patch") val patch: Patch)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Patch(@param:JsonProperty("small") val small: String?)