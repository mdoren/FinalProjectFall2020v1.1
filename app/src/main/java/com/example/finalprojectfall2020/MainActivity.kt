package com.example.finalprojectfall2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSSB1 = findViewById<Button>(R.id.idSSB1Button)
        buttonSSB1.setOnClickListener {
            val intent = Intent(this, MainActivitySSB1::class.java)
            startActivity(intent)
        }
        val buttonSSB2 = findViewById<Button>(R.id.idSSB2Button)
        buttonSSB2.setOnClickListener {
            val intent2 = Intent(this, MainActivitySSB2::class.java)
            startActivity(intent2)
        }
        val buttonSSB3 = findViewById<Button>(R.id.idSSB3Button)
        buttonSSB3.setOnClickListener {
            val intent3 = Intent(this, MainActivitySSB3::class.java)
            startActivity(intent3)
        }
        val buttonSSB4 = findViewById<Button>(R.id.idSSB4Button)
        buttonSSB4.setOnClickListener {
            val intent4 = Intent(this, MainActivitySSB4::class.java)
            startActivity(intent4)
        }
        val buttonSSB5 = findViewById<Button>(R.id.idSSB5Button)
        buttonSSB5.setOnClickListener {
            val intent5 = Intent(this, MainActivitySSB5::class.java)
            startActivity(intent5)
        }
    }
}
