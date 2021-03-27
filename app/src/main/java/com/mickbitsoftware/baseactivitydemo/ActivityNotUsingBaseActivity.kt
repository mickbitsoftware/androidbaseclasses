package com.mickbitsoftware.baseactivitydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mickbitsoftware.baseactivitydemo.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ActivityNotUsingBaseActivity : AppCompatActivity() {

    private lateinit var views: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        views.helloWorldTextView.text = "Loading..."

        // lifecycleScope needs androidx.lifecycle:lifecycle-runtime-ktx
        lifecycleScope.launch {
            delay(2000)
            views.helloWorldTextView.text = "Hello ActivityNotUsingBaseActivity"
        }
    }
}