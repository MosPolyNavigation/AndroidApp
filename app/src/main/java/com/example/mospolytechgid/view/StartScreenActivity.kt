package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase


class StartScreenActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        supportActionBar?.hide()

        // Получение экземпляра FirebaseAnalytic
        analytics = Firebase.analytics

        // Отслеживание события "StartScreenActivity открыта"
        analytics.logEvent("Start_Screen",null)

        Handler().postDelayed({
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
            finish()

            // Отслеживание события "StartScreenActivity закрыта"
        }, 2000)
    }
}



