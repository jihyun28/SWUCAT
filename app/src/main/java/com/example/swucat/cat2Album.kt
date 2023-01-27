package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class cat2Album : AppCompatActivity() {
    lateinit var vp: ViewPager
    lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat2_album)

        title = "슈땅이의 앨범"
        vp = findViewById(R.id.vp2) as ViewPager
        backBtn = findViewById(R.id.backBtn2) as Button

        vp.adapter = cat2Photo(this)
        backBtn.setOnClickListener {
            var intent = Intent(this, swucat2::class.java)
            startActivity(intent)
        }
    }
}