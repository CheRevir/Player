package com.cere.player.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.cere.player.databinding.ActivityMainBinding
import com.cere.player.ui.BaseActivity

/**
 * Created by CheRevir on 2022-02-17
 */
class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }
}