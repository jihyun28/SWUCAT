package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat5Album : AppCompatActivity() {
    lateinit var vp: ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat5_album)

        title = "우동의 앨범"
        vp = findViewById(R.id.vp5) as ViewPager
        backBtn = findViewById(R.id.backBtn5) as Button

        vp.adapter = cat5Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat5::class.java)
            startActivity(intent)
        }
    }
}