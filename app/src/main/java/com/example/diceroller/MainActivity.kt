package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val proceedButton : Button = findViewById(R.id.proceed_button)
        proceedButton.text = "Proceed 1"
        proceedButton.setOnClickListener {
            Toast.makeText(this , "Proceeding...Please Wait!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(6) + 1
        val drwableResourse = when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultText.text = "Dice Rolled with number " + randomInt.toString()

        diceImage.setImageResource(drwableResourse)
    }
}