package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle","calling on start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle","calling on resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle","calling on stop")
    }
    override fun onStop() {
        super.onStop()
        Log.d("lifecycle","calling on stop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle","calling on pauuse")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle","calling on destroy")
    }

}