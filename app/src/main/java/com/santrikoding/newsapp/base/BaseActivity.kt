package com.santrikoding.newsapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract fun setupViewBinding(): VB

    abstract fun initUI(savedInstanceState: Bundle?)

    abstract fun initObserver()

    abstract fun setOnClick()

    protected val binding by lazy { setupViewBinding() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initUI(savedInstanceState)
        initObserver()
        setOnClick()
    }
}