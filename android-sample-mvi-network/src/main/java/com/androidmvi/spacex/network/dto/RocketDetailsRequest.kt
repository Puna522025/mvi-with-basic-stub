package com.androidmvi.spacex.network.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class RocketDetailsRequest(@get:JsonProperty("query") val query: Query)

data class Query(@get:JsonProperty("rocket") val rocket: String)
