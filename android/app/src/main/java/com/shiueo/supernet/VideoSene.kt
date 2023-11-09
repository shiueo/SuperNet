package com.shiueo.supernet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class VideoSene : AppCompatActivity() {
    private lateinit var exit_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_sene)

        val URL = intent.getStringExtra("url")
        val EMAIL = intent.getStringExtra("email")

        val webView: WebView = findViewById(R.id.webview)

        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        webView.loadUrl(URL!!)

        exit_btn = findViewById(R.id.button7)
        exit_btn.setOnClickListener {
            val intent = Intent(this, supernet_scene::class.java)
            intent.putExtra("email", EMAIL)
            startActivity(intent)
        }
    }
}