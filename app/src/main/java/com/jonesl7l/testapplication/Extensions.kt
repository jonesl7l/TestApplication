package com.jonesl7l.testapplication

import android.content.Context
import android.widget.Toast

fun appContext(): Context = TestApplication.appContext

fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    if (message.isBlank()) return
    Toast.makeText(appContext(), message, length).show()
}

fun notImplemented() = toast("Not implemented")