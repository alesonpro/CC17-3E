package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class Deadlift_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deadlift)

        val imageView1: CircleImageView = findViewById(R.id.imageView1)

        imageView1.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=GxsLrTzyGUU")
            startActivity(intent)
        }

        val imageView2: CircleImageView = findViewById(R.id.imageView2)

        imageView2.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=3VXmecChYYM")
            startActivity(intent)
        }

        val imageView3: CircleImageView = findViewById(R.id.imageView3)

        imageView3.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=PQ3A_HmfQyk")
            startActivity(intent)
        }

        val imageView4: CircleImageView = findViewById(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=hinonqqzatk")
            startActivity(intent)
        }

        val imageView5: CircleImageView = findViewById(R.id.imageView5)

        imageView5.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=9DCvbA4Dwbg")
            startActivity(intent)
        }
    }
}