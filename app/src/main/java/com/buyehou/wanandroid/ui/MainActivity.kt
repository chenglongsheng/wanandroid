package com.buyehou.wanandroid.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.buyehou.wanandroid.R
import com.buyehou.wanandroid.network.NetWorkApi
import dagger.hilt.EntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private const val TAG = "MainActivity"

/**
 * @author buyehou
 */
@EntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var netWorkApi: NetWorkApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                netWorkApi.getHotkey()
                    .onSuccess {
                        Log.d(TAG, "onCreate: $it")
                    }
                    .onFailure {
                        it.printStackTrace()
                    }
            }
        }
    }
}