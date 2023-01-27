package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat6Album : AppCompatActivity() {
    lateinit var vp: ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat6_album)

        title = "보리의 앨범"
        vp = findViewById(R.id.vp6) as ViewPager
        backBtn = findViewById(R.id.backBtn6) as Button

        vp.adapter = cat6Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat6::class.java)
            startActivity(intent)
        }
    }
}