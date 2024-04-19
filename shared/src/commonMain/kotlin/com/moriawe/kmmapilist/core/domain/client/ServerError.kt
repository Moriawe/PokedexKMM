package com.moriawe.kmmapilist.core.domain.client

enum class ServerError {
    SERVER_UNAVAILABLE,
    CLIENT_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

class ServerException(
    private val error: ServerError
): Exception(
    //message = "An error occurred: $error"
)