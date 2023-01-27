package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var introButton:Button
    lateinit var voteButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        introButton = findViewById(R.id.introButton)
        voteButton = findViewById(R.id.voteButton)

        introButton.setOnClickListener {
            var intent = Intent(this, swuIntro::class.java)
            startActivity(intent)
        }

        voteButton.setOnClickListener {
            var intent = Intent(this, swuVote::class.java)
            startActivity(intent)
        }
    }
}