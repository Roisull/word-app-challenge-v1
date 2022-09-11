package com.example.words

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PreviewActivity : AppCompatActivity() {

    lateinit var btnSearchWord: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        btnSearchWord = findViewById(R.id.btn_search_word)

        btnSearchWord.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}