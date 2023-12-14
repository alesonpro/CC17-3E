package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class Calisthenics_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calisthenics)

        val imageView1: CircleImageView = findViewById(R.id.imageView1)

        imageView1.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=IODxDxX7oi4")
            startActivity(intent)
        }

        val imageView2: CircleImageView = findViewById(R.id.imageView2)

        imageView2.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=wrwwXE_x-pQ")
            startActivity(intent)
        }

        val imageView3: CircleImageView = findViewById(R.id.imageView3)

        imageView3.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=xQdyIrSSFnE")
            startActivity(intent)
        }

        val imageView4: CircleImageView = findViewById(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=3YvfRx31xDE")
            startActivity(intent)
        }

        val imageView5: CircleImageView = findViewById(R.id.imageView5)

        imageView5.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=yeKv5oX_6GY")
            startActivity(intent)
        }
    }
}