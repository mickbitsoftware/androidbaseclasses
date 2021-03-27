package com.mickbitsoftware.baseactivitydemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import com.mickbitsoftware.baseactivitydemo.databinding.FragmentMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FragmentNotUsingBaseFragment : DialogFragment() {

    private lateinit var views: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        views = FragmentMainBinding.inflate(inflater, container, false)
        return views.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        views.helloWorldTextView.text = "Loading..."

        // lifecycleScope needs androidx.lifecycle:lifecycle-runtime-ktx
        lifecycleScope.launch {
            delay(2000)
            views.helloWorldTextView.text = "Hello FragmentNotUsingBaseFragment"
        }
    }
}