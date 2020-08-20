package com.ice.rolldadice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener{
            Toast.makeText(this, "Okay, we be rollin'...", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val result: TextView = findViewById(R.id.textView)

        val randomInt = Random.nextInt(6) + 1
        result.text = randomInt.toString()
    }
}