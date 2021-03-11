package com.jonesl7l.testapplication.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.databinding.ActivityMainBinding
import com.jonesl7l.testapplication.livedata.BaseDataViewModel
import com.jonesl7l.testapplication.livedata.LiveDataFragment
import com.jonesl7l.testapplication.viewmodels.GenericItem

class MVVMMainActivity : MVVMBaseActivity(), AdapterItemInterface {

    //View binding
    private lateinit var binding: ActivityMainBinding

    private var dataAdapter: GenericAdapter? = null

    private val fragmentList: Map<String, Fragment> by lazy { setFragmentList() }

    //region Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = ViewModelProviders.of(this).get(BaseDataViewModel::class.java)
        observeViewModel(viewModel)
    }

    //endregion

    //region AdapterItemInterface

    override fun onItemClick(tag: String, value: Any?) {
        when(tag) {
            LIVE_DATA_TAG -> {
                fragmentList[tag]?.let { showFragment(it) }
            }
        }
    }

    //endregion

    private fun observeViewModel(viewModel: BaseDataViewModel) {
        viewModel.dataListObserver.observe(this, Observer<List<GenericItem>?> { items ->
            if (items != null) {
                dataAdapter = GenericAdapter(items, this)
                binding.mainRecycler.adapter = dataAdapter
            }
        })
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.mainFrameLayout.id, fragment)
            .commitAllowingStateLoss()
    }

    private fun setFragmentList(): Map<String, Fragment> {
        return mapOf(Pair(LIVE_DATA_TAG, LiveDataFragment.instance()))
    }

    companion object {
        const val LIVE_DATA_TAG = "live data"
    }
}