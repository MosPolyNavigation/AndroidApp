package com.example.mospolytechgid.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mospolytechgid.R

class WebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        val search: EditText = findViewById(R.id.searchView)
        search.setText("https://github.com/MosPolyNavigation");
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            webView.loadUrl(search.text.toString());
        }



    }
}