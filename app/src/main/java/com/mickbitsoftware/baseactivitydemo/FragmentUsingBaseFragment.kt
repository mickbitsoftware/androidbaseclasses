package com.mickbitsoftware.baseactivitydemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mickbitsoftware.baseactivitydemo.databinding.FragmentMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FragmentUsingBaseFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding =
        FragmentMainBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        views.helloWorldTextView.text = "Loading..."

        launch {
            delay(2000)
            views.helloWorldTextView.text = "Hello FragmentUsingBaseFragment"
        }
    }
}