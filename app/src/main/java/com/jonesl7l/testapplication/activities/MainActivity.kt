package com.jonesl7l.testapplication.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.contracts.MainContract
import com.jonesl7l.testapplication.databinding.ActivityMainBinding
import com.jonesl7l.testapplication.presenters.MainPresenter
import com.jonesl7l.testapplication.viewmodels.GenericItem

class MainActivity : BaseActivity<MainContract.View, MainPresenter>(), MainContract.View {

    private lateinit var binding: ActivityMainBinding

    //region Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.setData(listOf(GenericItem(getString(R.string.coroutines), tag = MainPresenter.COROUTINES_TAG, type = GenericAdapter.GenericItemType.BUTTON)))
        binding.mainRecycler.adapter = presenter.dataAdapter
    }

    //endregion

    //region Contract

    override fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(binding.mainFrameLayout.id, fragment)
                .commitAllowingStateLoss()
    }

    //endregion

    override fun createPresenter(): MainPresenter = MainPresenter()
}