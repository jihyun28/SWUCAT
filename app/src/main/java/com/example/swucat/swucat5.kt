package com.example.swucat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class swucat5 : AppCompatActivity() {

    lateinit var homeBtn5:Button
    lateinit var albumBtn5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swucat5)

        title = "<우동을 소개합니다>"

        homeBtn5 = findViewById(R.id.homeBtn5)
        albumBtn5 = findViewById(R.id.cat5Album)

        homeBtn5.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        albumBtn5.setOnClickListener {
            var intent = Intent(this, cat5Album::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_swucat5, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.cat1 -> {
                val intent = Intent(this, swucat1::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat2 -> {
                val intent = Intent(this, swucat2::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat3 -> {
                val intent = Intent(this, swucat3::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat4 -> {
                val intent = Intent(this, swucat4::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat5 -> {
                val intent = Intent(this, swucat5::class.java)
                startActivity(intent)
                return true
            }
            R.id.cat6 -> {
                val intent = Intent(this, swucat6::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}