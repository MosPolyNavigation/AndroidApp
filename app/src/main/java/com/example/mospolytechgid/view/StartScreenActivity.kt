package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class StartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, CampusActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}