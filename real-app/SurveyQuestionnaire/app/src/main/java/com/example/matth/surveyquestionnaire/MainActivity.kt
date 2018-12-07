package com.example.matth.surveyquestionnaire

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

lateinit var array: Array<String>
var count = 0 //question increment value
var no = 0
var yes = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        array = resources.getStringArray(R.array.Questions) //captures questions array values from string.xml files
    }

    //Sends question to question activity from string array in string.xml file
    fun sendMessage(view: View) {
        var message = array.get(count)
        count += 1 //increments through string array
        var intent = Intent(this, Question::class.java).apply {
            putExtra("EXTRA_MESSAGE", message)
        }
        startActivityForResult(intent, 1)
    }

    //receives value from question adding to the sum of yes or no responses
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==1 && resultCode== Activity.RESULT_OK){
            var receivedMessage = data!!.getStringExtra("Data") //receives answer from question
            if(receivedMessage.equals("No")){
                no += 1
            }
            if(receivedMessage.equals("Yes")){
                yes += 1
            }

        } else {
            println("error")
        }
        if(count>=array.size){ //launches summary when all questions are answered sending sum of yes no answers

            val intent = Intent(this, Summary::class.java)
                intent.putExtra("yes", yes)
                intent.putExtra("no", no)

            startActivity(intent)
        }
    }
}
