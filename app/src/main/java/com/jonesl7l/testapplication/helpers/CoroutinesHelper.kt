package com.jonesl7l.testapplication.helpers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

object CoroutinesHelper {

    /**
     * CPU-intensive work, such as sorting large lists, doing complex calculations and similar. A shared pool of threads on the JVM backs it.
     */
    val defaultDispatcher: CoroutineDispatcher = Dispatchers.Default

    /**
     * Mandatory dispatcher for performing UI-related events in Android's main or UI thread.
     */
    val mainDispatcher: CoroutineDispatcher = Dispatchers.Main

    /**
     * Networking or reading and writing from files. In short – any input and output, as the name states
     */
    val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

}