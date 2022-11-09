package com.bilal.authentication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SecondActivity : AppCompatActivity() {
    private lateinit var userEmail: String
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        userEmail = getEmailFromPreference()

        findViewById<TextView>(R.id.tv_emai).apply {
            text = "user ${userEmail}"
        }

        val btnLogout = findViewById<Button>(R.id.btn_logout)

        btnLogout.setOnClickListener {
            logout()
        }
    }

    private fun getEmailFromPreference(): String{
        val shaderPref = this.getSharedPreferences("user", Context.MODE_PRIVATE)
        return shaderPref.getString("EMAIL", "underfined")!!
    }

    private fun logout(){
        Firebase.auth.signOut()
        startActivity(Intent(this, MainActivity::class.java))
        finish() // destroy activity sebelumnya agar gak bisa balik ke activity sebelumnya
    }
}