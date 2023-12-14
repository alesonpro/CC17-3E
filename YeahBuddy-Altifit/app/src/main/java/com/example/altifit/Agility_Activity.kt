package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class Agility_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agility)

        val imageView1: CircleImageView = findViewById(R.id.imageView1)

        imageView1.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=FJmRQ5iTXKE")
            startActivity(intent)
        }

        val imageView2: CircleImageView = findViewById(R.id.imageView2)

        imageView2.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=9pb6JX2ulDU")
            startActivity(intent)
        }

        val imageView3: CircleImageView = findViewById(R.id.imageView3)

        imageView3.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=A9zxzfxdw30")
            startActivity(intent)
        }

        val imageView4: CircleImageView = findViewById(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=1UOP7h0eH_8")
            startActivity(intent)
        }

        val imageView5: CircleImageView = findViewById(R.id.imageView5)

        imageView5.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=DwHiXO5ps_I")
            startActivity(intent)
        }
    }
}