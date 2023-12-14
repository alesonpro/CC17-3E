package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class Setup_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)

        val imageView1: CircleImageView = findViewById(R.id.imageView1)

        imageView1.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=0xRvl4Qv3ZY")
            startActivity(intent)
        }

        val imageView2: CircleImageView = findViewById(R.id.imageView2)

        imageView2.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=DzA2xZhDGeo")
            startActivity(intent)
        }

        val imageView3: CircleImageView = findViewById(R.id.imageView3)

        imageView3.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=VmB1G1K7v94")
            startActivity(intent)
        }

        val imageView4: CircleImageView = findViewById(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this, WebView_Activity::class.java)
            intent.putExtra("videoUrl", "https://www.youtube.com/watch?v=EeE3f4VWFDo")
            startActivity(intent)
        }
    }
}