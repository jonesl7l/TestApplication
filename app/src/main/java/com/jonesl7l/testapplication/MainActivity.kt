package com.jonesl7l.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jonesl7l.testapplication.coroutines.CoroutinesFragment
import com.jonesl7l.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //region Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setButtons()
    }

    //endregion

    private fun setButtons() {
        with(binding) {
            coroutinesText.setOnClickListener {
                showFragment(CoroutinesFragment.instance())
            }
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(binding.mainFrameLayout.id, fragment)
                .commitAllowingStateLoss()
    }
}