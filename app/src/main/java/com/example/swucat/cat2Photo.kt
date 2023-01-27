package com.example.swucat

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class cat2Photo(private val c: Context) : PagerAdapter() {
    private lateinit var li: LayoutInflater

    val i = arrayOf(R.drawable.pic2,R.drawable.pic2_1,R.drawable.pic2_2)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return i.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        li = c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = li!!.inflate(R.layout.activity_cat2_photo, null)
        val iv = v.findViewById<View>(R.id.cat2_1) as ImageView
        iv.setImageResource(i[position])
        container.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.invalidate()
    }
}