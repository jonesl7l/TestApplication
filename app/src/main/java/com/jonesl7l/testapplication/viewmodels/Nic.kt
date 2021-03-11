package com.jonesl7l.testapplication.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jonesl7l.testapplication.livedata.NicRepository

data class Nic(
    val name: String,
    val nicLevel: Int,
    val image: String
)

data class Nics(var nics: MutableList<Nic>)