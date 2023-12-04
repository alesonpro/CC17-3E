package com.example.altifit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class Home_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val stretchingImageView: ImageView = findViewById(R.id.stretching)
        stretchingImageView.setOnClickListener {
            val intent = Intent(this, Stretch_Activity::class.java)
            startActivity(intent)
        }

        val deadliftImageView: ImageView = findViewById(R.id.deadlift)
        deadliftImageView.setOnClickListener {
            val intent = Intent(this, Deadlift_Activity::class.java)
            startActivity(intent)
        }
    }
}



