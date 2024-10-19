package com.joaquin.toolkitapprubenruiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnSignIn: Button = findViewById(R.id.btnSignIn)

        btnSignIn.setOnClickListener {
            val username = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (username == "admin@toolkitapp.com" && password == "admin123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenciales Invalidas", Toast.LENGTH_SHORT).show()
            }
        }

        }
}
