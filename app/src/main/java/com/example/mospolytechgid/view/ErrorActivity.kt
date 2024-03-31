package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class ErrorActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        // скрытие заголовка приложения
        supportActionBar?.hide()

        //Аналитика
        analytics = Firebase.analytics
        analytics.logEvent("ERROR404",null)

        // обработка события "назад"
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                back()
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    fun back() {
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
        finish()
    }
}