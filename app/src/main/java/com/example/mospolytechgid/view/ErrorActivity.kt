package com.example.mospolytechgid.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R


class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        // скрытие заголовка приложения
        supportActionBar?.hide()

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