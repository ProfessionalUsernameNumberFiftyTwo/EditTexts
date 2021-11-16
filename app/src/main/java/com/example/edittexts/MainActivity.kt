package com.example.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var addButton: Button
lateinit var firstNumberText: EditText
lateinit var secondNumberText: EditText
lateinit var resultTextView: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wireWidgets()

        addButton.setOnClickListener {
            val firstNumber = firstNumberText.text.toString().toInt()
            val secondNumber = secondNumberText.text.toString().toInt()
            val result = firstNumber + secondNumber
            resultTextView.text = result.toString()
        }
    }

    private fun wireWidgets() {
        addButton = findViewById(R.id.btnAdd)
        firstNumberText = findViewById(R.id.etFirstNumber)
        secondNumberText = findViewById(R.id.etSecondNumber)
        resultTextView = findViewById(R.id.tvResult)
    }
}