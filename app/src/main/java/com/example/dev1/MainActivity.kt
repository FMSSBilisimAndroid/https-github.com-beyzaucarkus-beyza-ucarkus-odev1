package com.example.dev1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photo : ImageView = findViewById(R.id.diceImageView)
        photo.setImageResource(R.drawable.dice_svgrepo_com__1_)
        val buttonRoll : Button = findViewById(R.id.rollButton)
        buttonRoll.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice(){
        var randomNumber = (1..6).random()

        val numberTextView : TextView  = findViewById(R.id.numberTextView)
     //   numberTextView.text = "${randomNumber} rolled."
        val photo : ImageView = findViewById(R.id.diceImageView)
        when (randomNumber) {
            1 -> photo.setImageResource(R.drawable.dice_svgrepo_com__1_)
            2 -> photo.setImageResource(R.drawable.dice_svgrepo_com)
            3 -> photo.setImageResource(R.drawable.dice_svgrepo_com__2_)
            4 -> photo.setImageResource(R.drawable.dice_svgrepo_com__4_)
            5 -> photo.setImageResource(R.drawable.dice_svgrepo_com__4_)
            6 -> photo.setImageResource(R.drawable.dice_svgrepo_com__3_)
        }

        // Change TextView's text property with the randomNumber's value.
        numberTextView.text = "${randomNumber} rolled."
    }
}