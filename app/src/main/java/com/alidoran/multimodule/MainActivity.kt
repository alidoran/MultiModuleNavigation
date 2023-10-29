package com.alidoran.multimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alidoran.first_library.FirstActivity
import com.alidoran.multimodule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFirstActivity.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}