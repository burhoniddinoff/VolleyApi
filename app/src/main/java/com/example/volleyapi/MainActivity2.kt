package com.example.volleyapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volleyapi.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity2, MainActivity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity2, SecondActivity::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this@MainActivity2, GithubActivity::class.java))
        }

    }
}