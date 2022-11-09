package com.example.actionbar

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.arrow_action){
            val nextPage = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(nextPage)
        }else{
            val intent = Intent(Settings.ACTION_SETTINGS);
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}