package com.example.belajar3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 80 + 34 + 234

//        Log.d("COBA", "Halo disini coba log.")
//        Log.d("log", "onCreate: ")

//        phone
        findViewById<Button>(R.id.btn_phone).setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }

//        google
        findViewById<Button>(R.id.btn_google).setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google.com")
            startActivity(intent)
        }

//        camera
        findViewById<Button>(R.id.btn_camera).setOnClickListener{
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }

//        maps
        findViewById<Button>(R.id.btn_maps).setOnClickListener{
            val intent = Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://maps.app.goo.gl/wwwv1bvTHxRKjgD99"));
            startActivity(intent)
        }

//        whatsapp
        val phone_num = findViewById<EditText>(R.id.et_phone)
        val message = findViewById<EditText>(R.id.et_message)
        val send_btn = findViewById<Button>(R.id.btn_whatsapp)

        send_btn.setOnClickListener {
            val phone_num = phone_num.text
            val message = message.text

            val intent = Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://wa.me/$phone_num?text=$message"));
            startActivity(intent)

        }

    }
}