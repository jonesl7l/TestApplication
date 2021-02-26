package com.jonesl7l.testapplication.presenters

import androidx.fragment.app.Fragment
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.contracts.MainContract
import com.jonesl7l.testapplication.coroutines.CoroutinesFragment
import com.jonesl7l.testapplication.notImplemented
import com.jonesl7l.testapplication.viewmodels.GenericItem

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter, AdapterItemInterface {

    private val fragmentList: Map<String, Fragment> by lazy { setFragmentList() }

    //region Contract

    override fun setData(data: List<GenericItem>) {
        dataList.clear()
        dataList.addAll(data)
        dataAdapter = GenericAdapter(dataList, this)
    }

    //endregion

    //region AdapterItemInterface

    override fun onItemClick(tag: String, value: Any?) {
        when(tag) {
            COROUTINES_TAG -> {
                fragmentList[tag]?.let { view?.showFragment(it) }
            }
        }
    }

    //endregion

    private fun setFragmentList(): Map<String, Fragment> {
        return mapOf(Pair(COROUTINES_TAG, CoroutinesFragment.instance()))
    }

    companion object {
        const val COROUTINES_TAG = "coroutines"
    }
}