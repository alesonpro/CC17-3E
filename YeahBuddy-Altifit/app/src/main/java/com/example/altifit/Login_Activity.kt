package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_button = findViewById<Button>(R.id.buttonLogin)
        login_button.setOnClickListener{
            val Intent = Intent(this,Home_Activity::class.java)
            startActivity(Intent);
        }

        val register_button = findViewById<Button>(R.id.buttonRegister)
        register_button.setOnClickListener{
            val Intent = Intent(this,Register_Activity::class.java)
            startActivity(Intent);
        }
    }
}