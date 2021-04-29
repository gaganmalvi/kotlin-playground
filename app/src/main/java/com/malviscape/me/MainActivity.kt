package com.malviscape.me

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview = findViewById<ImageView>(R.id.imageview)
        val image = "https://avatars.githubusercontent.com/u/26477157"
        val requestOptions = RequestOptions().error(R.drawable.ic_launcher_foreground)
        Glide.with(this)
                .load(image)
                .apply(requestOptions)
                .into(imageview)
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val url = "http://github.com/gaganmalvi"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}