package com.example.watchtogether

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import android.app.AlertDialog
import android.view.View
import java.net.URLEncoder

class MainActivity : ComponentActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)
        setContentView(webView)

        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            useWideViewPort = true
            loadWithOverviewMode = true
            allowContentAccess = true
            builtInZoomControls = false
            displayZoomControls = false
            cacheMode = WebSettings.LOAD_NO_CACHE
        }

        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        webView.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            @Suppress("DEPRECATION")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                url?.let { view?.loadUrl(it) }
                return true
            }
        }

        // Get device name and encode it for URL safety
        val deviceName = URLEncoder.encode("${Build.MANUFACTURER} ${Build.MODEL}", "UTF-8")
        val url = "https://screen.1tushar.com/?usr=$deviceName&pwd=tushar&cast=1"

        webView.loadUrl(url)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (webView.canGoBack()) {
                    webView.goBack()
                } else {
                    showExitConfirmationDialog()
                }
            }
        })
    }

    private fun showExitConfirmationDialog() {
        AlertDialog.Builder(this)
            .setTitle("Exit App")
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("Yes") { _, _ ->
                finish()
            }
            .setNegativeButton("No", null)
            .show()
    }
}