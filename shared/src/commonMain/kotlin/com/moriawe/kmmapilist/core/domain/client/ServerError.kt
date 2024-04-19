package com.moriawe.kmmapilist.core.domain.client

enum class ServerError {
    SERVER_UNAVAILABLE,
    CLIENT_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

class ServerException(
    val error: ServerError
): Exception(
    message = "An error occured: $error"
)