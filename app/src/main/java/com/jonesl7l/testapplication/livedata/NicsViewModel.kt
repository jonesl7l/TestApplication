package com.jonesl7l.testapplication.livedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jonesl7l.testapplication.viewmodels.Nics

//Live Data
class NicsViewModel(application: Application) : AndroidViewModel(application) {
    var nicsObservable: MutableLiveData<Nics> = NicRepository().getNicsList()
}