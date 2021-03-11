package com.jonesl7l.testapplication.activities.mvp.contracts

import com.jonesl7l.testapplication.viewmodels.GenericItem

interface BaseContract {
    interface View {}

    interface Presenter<in T : View> {
        fun onCreate(view: T)
        fun onDestroy()
        fun setData(data: List<GenericItem>)
    }
}