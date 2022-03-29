package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton: Button = findViewById(R.id.reset)
        clearButton.setOnClickListener { reset() }
    }


    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()
    when (randomInt) {
            1 -> return R.drawable.dice_1
            2 -> return R.drawable.dice_2
            3 -> return R.drawable.dice_3
            4 -> return R.drawable.dice_4
            5 -> return R.drawable.dice_5
            else -> return R.drawable.dice_6
        }
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()//"Dice Rolled!"
        //   Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        val currentText: String =resultText.text.toString()
//        if(currentText == "Hello World!"){
//            resultText.text = 1.toString()
//        }else if(currentText.toInt() != 6){
//            resultText.text = (resultText.text.toString().toInt() +1).toString()
//        }
//    }
    private fun reset(){
    diceImage.setImageResource(R.drawable.empty_dice)
    diceImage2.setImageResource(R.drawable.empty_dice)
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = 0.toString()
    }
}
