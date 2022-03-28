package com.androidmvi.spacex.network.dto

import com.fasterxml.jackson.databind.ObjectMapper
import retrofit2.HttpException
import java.io.IOException

class RocketsException(val error: ErrorResponse) {

    companion object{

        private val UNKNOWN_ERROR = ErrorResponse("UNKNOWN_ERROR", "100")

        fun fromThrowable(throwable: Throwable): RocketsException {
            val error: ErrorResponse = when {
                throwable is HttpException ->
                    swErrorFromHttpException(throwable)

                else -> UNKNOWN_ERROR
            }
            return RocketsException(error)
        }

        private fun swErrorFromHttpException(exception: HttpException): ErrorResponse {
            val jsonBody = exception.response()?.errorBody()?.string() ?: return UNKNOWN_ERROR

            val error: ErrorResponse = try {
                ObjectMapper().readValue(jsonBody, ErrorResponse::class.java)
            } catch (e: IOException) {
                return UNKNOWN_ERROR
            }
            return error
        }
    }

}