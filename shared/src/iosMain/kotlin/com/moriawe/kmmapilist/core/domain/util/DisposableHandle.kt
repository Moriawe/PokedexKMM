package com.moriawe.kmmapilist.core.domain.util

fun interface DisposableHandle: kotlinx.coroutines.DisposableHandle

fun DisposableHandle(block: () -> Unit): DisposableHandle {
    return DisposableHandle { block() }
}