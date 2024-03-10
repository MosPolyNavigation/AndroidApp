package com.example.mospolytechgid.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class WebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val thisActivity = this
        // поиск и присвоение WebView переменной
        val webView: WebView = findViewById(R.id.webView)
        // обработка события "назад"
        val callback = object : OnBackPressedCallback(true) {
            var isExit = false
            override fun handleOnBackPressed() {
                if (webView.canGoBack()) {
                    isExit = false
                    webView.goBack()
                } else {
                    if (isExit)
                        finishAffinity()
                    else {
                        Toast.makeText(
                            baseContext,
                            "Повторите действие, чтобы выйти",
                            Toast.LENGTH_LONG
                        ).show()
                        isExit = true
                    }
                }
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
        // скрытие заголовка приложения
        supportActionBar?.hide()
        // использование кэша при отсутствии интернета
        webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        // использование js
        webView.settings.javaScriptEnabled = true
        // разрешить сайтам доступ к хранилищу
        webView.settings.domStorageEnabled = true
        // зум страниц
        webView.settings.builtInZoomControls = true
        webView.settings.displayZoomControls = false
        // смена масштаба
        webView.settings.useWideViewPort = true
        webView.setInitialScale(1);
        // создание web-клиента, чтобы переопределить его работу
        webView.webViewClient = object : WebViewClient() {
            // перегрузка загрузки сайта
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                return if (request.url.host != "mospolynavigation.github.io") {
                    val intent = Intent(Intent.ACTION_VIEW, request.url)
                    startActivity(intent)
                    true
                } else false
            }

            // обработка ошибок при загрузке
            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                try {
                    webView.stopLoading()
                } catch (e: java.lang.Exception) {
                    e.printStackTrace()
                }
                if (webView.canGoBack()) {
                    webView.goBack()
                }

                val intent = Intent(thisActivity, ErrorActivity::class.java)
                startActivity(intent)

                finish()
            }
        }
        webView.loadUrl("https://lonanl.github.io/navigation/")
    }
}