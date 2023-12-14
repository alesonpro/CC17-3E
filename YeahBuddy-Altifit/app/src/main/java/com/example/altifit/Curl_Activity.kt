package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class Curl_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curl)

        val imageView1: CircleImageView = findViewById(R.id.imageView1)

        imageView1.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=ZrpRBgswtHs")
            startActivity(intent)
        }

        val imageView2: CircleImageView = findViewById(R.id.imageView2)

        imageView2.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=TwD-YGVP4Bk")
            startActivity(intent)
        }

        val imageView3: CircleImageView = findViewById(R.id.imageView3)

        imageView3.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=MkPz57rN2nw")
            startActivity(intent)
        }

        val imageView4: CircleImageView = findViewById(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=NFzTWp2qpiE")
            startActivity(intent)
        }

    }
}