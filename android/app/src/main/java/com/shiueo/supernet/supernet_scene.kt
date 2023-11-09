package com.shiueo.supernet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class supernet_scene : AppCompatActivity() {
    private lateinit var acc_text: TextView
    private lateinit var pikachu_btn: Button
    private lateinit var goku_btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supernet_scene)

        val EMAIL = intent.getStringExtra("email")
        acc_text = findViewById(R.id.acctext)

        acc_text.text = "You're logged in as " + EMAIL

        pikachu_btn = findViewById(R.id.button)
        goku_btn = findViewById(R.id.button2)

        pikachu_btn.setOnClickListener {
            val intent = Intent(this, VideoSene::class.java)
            intent.putExtra("url", "https://youtube.com")
            intent.putExtra("email", EMAIL)
            startActivity(intent)
        }

        goku_btn.setOnClickListener {
            val intent = Intent(this, VideoSene::class.java)
            intent.putExtra("url", "https://longdogechallenge.com/")
            intent.putExtra("email", EMAIL)
            startActivity(intent)
        }

    }


}