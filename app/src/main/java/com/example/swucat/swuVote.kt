package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class swuVote : AppCompatActivity() {

    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swu_vote)

        btn = findViewById<Button>(R.id.btn)
        var vCount = IntArray(6)
        var imgV: Array<ImageView?> = arrayOfNulls<ImageView>(6)
        var imgID = arrayOf(R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6)
        var Name = arrayOf("랑이", "슈땅이", "뉴냥이", "우치", "우동", "보리")

        title = "슈냥이 투표"

        for (i in imgID.indices) {
            val index: Int
            index = i
            imgV[index] = findViewById(imgID[index])
            imgV[index]!!.setOnClickListener {
                vCount[index]++
                Toast.makeText(getApplicationContext(), Name[index] + "에게 투표하였습니다.",
                    Toast.LENGTH_SHORT).show()
            }
        }

        btn.setOnClickListener {
            var intent = Intent(this, resultVote::class.java)
            intent.putExtra("vCount", vCount)
            intent.putExtra("Name", Name)
            startActivity(intent)
        }
    }
}