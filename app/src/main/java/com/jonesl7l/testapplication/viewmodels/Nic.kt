package com.jonesl7l.testapplication.viewmodels

data class Nic(
    val name: String,
    val nicLevel: Int,
    val image: String
)

data class Nics(val nics: MutableList<Nic>)