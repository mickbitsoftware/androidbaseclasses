package com.mickbitsoftware.baseactivitydemo

import android.os.Bundle
import android.view.LayoutInflater
import com.mickbitsoftware.baseactivitydemo.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ActivityUsingBaseActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
            ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {

        views.helloWorldTextView.text = "Loading..."

        launch {
            delay(2000)
            views.helloWorldTextView.text = "Hello ActivityUsingBaseActivity"
        }
    }
}