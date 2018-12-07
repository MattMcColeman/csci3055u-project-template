package com.example.matth.surveyquestionnaire

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Summary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        //receives values from main with number of YES NO responses
        val yes = intent.getIntExtra("yes", 0)
        val no = intent.getIntExtra("no", 0)

        var textView = findViewById<TextView>(R.id.summary).apply {
            text = "no: " + no + " yes: " + yes //prints answers to screen
        }
    }
}
