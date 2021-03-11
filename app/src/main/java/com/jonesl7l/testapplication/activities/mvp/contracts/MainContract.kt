package com.jonesl7l.testapplication.activities.mvp.contracts

import androidx.fragment.app.Fragment

interface MainContract {
    interface View : BaseContract.View {
        fun showFragment(fragment: Fragment)
    }

    interface Presenter {}
}