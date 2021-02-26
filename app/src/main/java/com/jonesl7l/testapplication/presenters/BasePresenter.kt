package com.jonesl7l.testapplication.presenters

import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.contracts.BaseContract
import com.jonesl7l.testapplication.viewmodels.GenericItem

abstract class BasePresenter<T : BaseContract.View> : BaseContract.Presenter<T> {

    var view: T? = null

    protected val dataList: MutableList<GenericItem> = mutableListOf()
    var dataAdapter: GenericAdapter? = null

    override fun onCreate(view: T) {
        this.view = view
    }

    override fun onDestroy() {
        view = null
    }
}