package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat3Album : AppCompatActivity() {
    lateinit var vp: ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat3_album)

        title = "뉴냥이의 앨범"
        vp = findViewById(R.id.vp3) as ViewPager
        backBtn = findViewById(R.id.backBtn3) as Button

        vp.adapter = cat3Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat3::class.java)
            startActivity(intent)
        }
    }
}