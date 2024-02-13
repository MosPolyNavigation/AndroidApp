package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class StartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}