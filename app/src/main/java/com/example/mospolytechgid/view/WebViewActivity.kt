package com.example.mospolytechgid.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class WebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        // скрытие заголовка приложения
        supportActionBar?.hide()

        val webView: WebView = findViewById(R.id.webView)
        // использование кэша при оттсутвии интернета
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        // использование js
        webView.settings.javaScriptEnabled = true
        // создание клиента, чтобы не исользовались приложения по умолчанию
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://mospolynavigation.github.io/WebSite/")
    }
}