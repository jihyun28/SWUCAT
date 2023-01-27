package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat4Album : AppCompatActivity() {
    lateinit var vp: ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat4_album)

        title = "우치의 앨범"
        vp = findViewById(R.id.vp4) as ViewPager
        backBtn = findViewById(R.id.backBtn4) as Button

        vp.adapter = cat4Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat4::class.java)
            startActivity(intent)
        }
    }
}