package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener{countUp()}


        val resetButton: Button = findViewById(R.id.reset)
        resetButton.setOnClickListener{reset()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()//"Dice Rolled!"
     //   Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val currentText: String =resultText.text.toString()
        if(currentText == "Hello World!"){
            resultText.text = 1.toString()
        }else if(currentText.toInt() != 6){
            resultText.text = (resultText.text.toString().toInt() +1).toString()
        }
    }
    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = 0.toString()
    }
}
