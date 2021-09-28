package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Main", "on create")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Main", "on start")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Main", "on pause")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Main", "on resume")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Main", "on stop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Main", "on destroy")
    }

}