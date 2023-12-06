package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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


        val usernameEditText: EditText = findViewById(R.id.editTextUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "admin" && password == "admin") {
                // If admin credentials match, grant access (navigate to admin screen or perform desired action)
                // For example:
                // val intent = Intent(this, AdminActivity::class.java)
                // startActivity(intent)

                // For demonstration, show a success message
                Toast.makeText(this, "Login Successful as Admin", Toast.LENGTH_SHORT).show()
            } else {
                // If the credentials are incorrect, show an error message
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}