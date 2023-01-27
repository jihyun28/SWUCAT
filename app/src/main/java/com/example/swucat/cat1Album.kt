package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat1Album : AppCompatActivity() {

    lateinit var vp:ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat1_album)

        title = "랑이의 앨범"
        vp = findViewById(R.id.vp1) as ViewPager
        backBtn = findViewById(R.id.backBtn) as Button

        vp.adapter = cat1Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat1::class.java)
            startActivity(intent)
        }
    }
}