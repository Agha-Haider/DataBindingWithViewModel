package com.anushka.viewmodeldemo1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.ActivityMainBinding
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.myViewModel=viewModel
        binding.lifecycleOwner=this


//        viewModel.count.observe(this, Observer {
//            binding.countText.text = it.toString()
//        })

//        binding.button.setOnClickListener {
//          //  viewModel.updateCount()
//        }
    }
}