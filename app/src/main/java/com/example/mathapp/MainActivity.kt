package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionTextView : TextView
    lateinit var answerView : EditText

    var firstNumber = 0
    var secondNumber = 0
    var answerNumber = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.textView)
        answerView = findViewById(R.id.answerEditText)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            checkAnswer()
        }

        setNewQuestion()

    }


    fun setNewQuestion () {
        firstNumber = (1 .. 10).random()
        secondNumber = (1 .. 10).random()

        questionTextView.text = "$firstNumber + $secondNumber"
    }

    fun checkAnswer(){
        val answerText = answerView.text.toString()
        val answerInt = answerText.toIntOrNull()
        val correctAnswer = firstNumber + secondNumber

        if(answerInt == correctAnswer){
            Log.d("!!","rätt svar")
        } else{
            Log.d("..", "fel svar")
        }

    }
}