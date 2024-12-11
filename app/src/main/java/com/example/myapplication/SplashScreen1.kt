package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class SplashScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen1)

        val lottie = findViewById<LottieAnimationView>(R.id.lottie)

        lottie.animate().translationX(1400f).setDuration(2000).setStartDelay(4000)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashScreen1, SplashActivity::class.java)
            startActivity(intent)
        }, 6000)

    }
}