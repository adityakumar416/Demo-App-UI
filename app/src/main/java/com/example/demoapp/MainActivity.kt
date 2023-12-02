package com.example.demoapp


import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        NightModeUtils.updateIconBasedOnMode(binding.appleIcon)

        binding.signInWithPassword.setOnClickListener {
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
        binding.signUp.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}



