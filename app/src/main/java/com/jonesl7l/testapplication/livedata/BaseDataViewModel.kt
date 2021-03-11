package com.jonesl7l.testapplication.livedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.activities.MVVMMainActivity
import com.jonesl7l.testapplication.activities.mvp.presenters.MainPresenter
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.viewmodels.GenericItem

class BaseDataViewModel(application: Application) : AndroidViewModel(application) {

    val dataListObserver: LiveData<MutableList<GenericItem>> = MutableLiveData<MutableList<GenericItem>>().apply {
        value = mutableListOf(GenericItem(application.getString(R.string.live_data_and_view_models), tag = MVVMMainActivity.LIVE_DATA_TAG, type = GenericAdapter.GenericItemType.BUTTON))
    }
}