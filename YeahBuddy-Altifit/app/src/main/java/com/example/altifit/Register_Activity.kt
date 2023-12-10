package com.example.altifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Register_Activity : AppCompatActivity() {

    private lateinit var signupName: EditText
    private lateinit var signupUsername: EditText
    private lateinit var signupEmail: EditText
    private lateinit var signupPassword: EditText
    private lateinit var loginRedirectText: TextView
    private lateinit var signupButton: Button
    private lateinit var database: FirebaseDatabase
    private lateinit var reference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        signupName = findViewById(R.id.signup_name)
        signupEmail = findViewById(R.id.signup_email)
        signupUsername = findViewById(R.id.signup_username)
        signupPassword = findViewById(R.id.signup_password)
        loginRedirectText = findViewById(R.id.loginRedirectText)
        signupButton = findViewById(R.id.signup_button)

        signupButton.setOnClickListener {
            database = FirebaseDatabase.getInstance()
            reference = database.getReference("users")

            val name = signupName.text.toString()
            val email = signupEmail.text.toString()
            val username = signupUsername.text.toString()
            val password = signupPassword.text.toString()

            val helperClass = HelperClass(name, email, username, password)
            reference.child(username).setValue(helperClass)

            Toast.makeText(this@Register_Activity, "You have signed up successfully!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@Register_Activity, Home_Activity::class.java)
            startActivity(intent)
        }

        loginRedirectText.setOnClickListener {
            val intent = Intent(this@Register_Activity, Login_Activity::class.java)
            startActivity(intent)
        }
    }
}
