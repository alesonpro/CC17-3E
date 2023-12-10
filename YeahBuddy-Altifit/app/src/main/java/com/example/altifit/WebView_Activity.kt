package com.example.altifit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class WebView_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView: WebView = findViewById(R.id.webView)
        val videoUrl = intent.getStringExtra("videoUrl")

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        videoUrl?.let { webView.loadUrl(it) }
    }
}