package com.example.matth.surveyquestionnaire

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


var output = ""

class Question : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var message = intent.getStringExtra("EXTRA_MESSAGE")

        // Capture the layout's TextView and set the question as its text
        var textView = findViewById<TextView>(R.id.question).apply {
            text = message
        }
    }
    //these two functions send the answer to the main with yes or no depending on the button clicked
    fun answerYes (view: View) {
        output = "Yes"
        var intent = Intent().apply {
            putExtra("Data", output)
        }
        setResult(RESULT_OK, intent)
        finish()
    }

    fun answerNo(view: View) {
        output = "No"
        var intent = Intent().apply {
            putExtra("Data", output)
        }
        setResult(RESULT_OK,intent)
        finish()
    }

}
