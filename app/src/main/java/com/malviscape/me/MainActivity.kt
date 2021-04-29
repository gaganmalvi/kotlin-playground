package com.malviscape.me

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ImageViewCompat
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview = findViewById<ImageView>(R.id.imageview)
        val image = "https://github.com/gaganmalvi/gaganmalvi/raw/master/nyan.gif"
        Glide.with(this)
             .load(image)
             .into(imageview)
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val url = "http://github.com/gaganmalvi"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}