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

        val agilityImageView: ImageView = findViewById(R.id.agility)
        agilityImageView.setOnClickListener {
            val intent = Intent(this, Agility_Activity::class.java)
            startActivity(intent)
        }

        val curlImageView: ImageView = findViewById(R.id.curl)
        curlImageView.setOnClickListener {
            val intent = Intent(this, Curl_Activity::class.java)
            startActivity(intent)
        }

        val calImageView: ImageView = findViewById(R.id.calisthenic)
        calImageView.setOnClickListener {
            val intent = Intent(this, Calisthenics_Activity::class.java)
            startActivity(intent)
        }

        val benchImageView: ImageView = findViewById(R.id.bench)
        benchImageView.setOnClickListener {
            val intent = Intent(this, Setup_Activity::class.java)
            startActivity(intent)
        }
    }
}



