package com.androidmvi.spacex.network.dto

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.parcelize.Parcelize

@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
data class ErrorResponse(
    @JsonProperty("errorMessage") val message: String,
    @JsonProperty("errorCode") val code: String
) : Parcelable