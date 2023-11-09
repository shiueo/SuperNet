package com.shiueo.supernet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView

class supernet_scene : AppCompatActivity() {
    private lateinit var acc_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supernet_scene)

        val EMAIL = intent.getStringExtra("email")
        acc_text = findViewById(R.id.acctext)

        acc_text.text = "You're logged in as " + EMAIL


    }
}