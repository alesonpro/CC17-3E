package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Home_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    fun openStretchingActivity(view: View) {
        val intent = Intent(this,Stretching_Activity::class.java)
        startActivity(intent)
    }
}



