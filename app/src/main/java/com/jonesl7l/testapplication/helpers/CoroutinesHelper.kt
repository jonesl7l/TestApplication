package com.jonesl7l.testapplication.helpers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

object CoroutinesHelper {

    val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default
    val mainDispatcher: CoroutineDispatcher = Dispatchers.Main
    val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

}