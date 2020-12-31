package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
//            Toast.makeText(this, "The buttons working", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice: TextView = findViewById(R.id.dice_number)
        val possiblenumbers = listOf(1, 2, 3, 4, 5, 6)
        var randomNumber = possiblenumbers.shuffled().first()
//        or
//        val randomNumber = Random().nextInt(6) + 1
        dice.text = randomNumber.toString()
    }




}