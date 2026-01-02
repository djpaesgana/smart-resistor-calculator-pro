package com.example.resistorcalcpro

import android.os.Bundle
import android.webkit.WebView
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Habilitar modo pantalla completa inmersiva
        enableEdgeToEdge()
        
        val myWebView = WebView(this)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.domStorageEnabled = true
        
        // Hacer que el contenido ignore las barras del sistema para usar TODA la pantalla
        myWebView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)

        setContentView(myWebView)
        myWebView.loadUrl("file:///android_asset/index.html")
    }
}