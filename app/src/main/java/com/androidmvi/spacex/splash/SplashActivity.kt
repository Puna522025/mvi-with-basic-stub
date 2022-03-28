package com.androidmvi.spacex.splash

import android.content.Intent
import android.os.Bundle
import com.androidmvi.spacex.R
import com.androidmvi.spacex.ui.MainActivity
import com.androidmvi.spacex.ui.base.BaseActivity
import com.androidmvi.spacex.ui.viewmodel.EnvironmentFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity)
        setStatusBarColor(R.color.black)
        //loadFragment(EnvironmentFragment(), true)
        startActivity(Intent(applicationContext, MainActivity()::class.java))
        finish()
    }
}