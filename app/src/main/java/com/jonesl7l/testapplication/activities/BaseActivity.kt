package com.jonesl7l.testapplication.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jonesl7l.testapplication.contracts.BaseContract

abstract class BaseActivity<in V : BaseContract.View, out P : BaseContract.Presenter<V>> : AppCompatActivity(), BaseContract.View {

    internal val presenter: P by lazy { createPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.onCreate(this as V)
    }

    abstract fun createPresenter(): P
}