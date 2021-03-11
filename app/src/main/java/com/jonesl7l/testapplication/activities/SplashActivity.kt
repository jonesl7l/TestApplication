package com.jonesl7l.testapplication.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {

    //View binding
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.splashMvpButton.itemButtonText.apply {
            text = getString(R.string.mvp_arch)
            setOnClickListener { startActivity(Intent(this@SplashActivity, MVPMainActivity::class.java)) }
        }
        binding.splashMvvmButton.itemButtonText.apply {
            text = getString(R.string.mvvm_arch)
            setOnClickListener { startActivity(Intent(this@SplashActivity, MVVMMainActivity::class.java)) }
        }
    }
}