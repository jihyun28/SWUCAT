package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class resultVote : AppCompatActivity() {

    lateinit var resImg: ImageView
    lateinit var resText: TextView
    lateinit var resText2: TextView
    lateinit var rbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_vote)

        title = "투표 결과"
        resImg = findViewById(R.id.resImg)
        resText = findViewById(R.id.tv1)
        resText2 = findViewById(R.id.tv2)
        rbtn = findViewById(R.id.rbtn)

        var top = 0
        var intent: Intent = getIntent()
        var rVote: IntArray = intent.getIntArrayExtra("vCount")
        var rName: Array<String> = intent.getStringArrayExtra("Name")
        var rImg = intArrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6)
        for (i in rVote.indices) {
            if (rVote[top] < rVote[i]) top = i
        }
        rVote.toString()
        resImg.setImageResource(rImg[top])
        resText.text = "서울여자대학교 명예 총장은 " + rName[top] + "입니다."
        resText2.text = "(총 " + rVote[top] + "표)"
        rbtn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}