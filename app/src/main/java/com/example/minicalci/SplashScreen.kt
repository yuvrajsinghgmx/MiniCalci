package com.example.minicalci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()
        val intent=Intent(this,MainActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        },1500)




    }
}