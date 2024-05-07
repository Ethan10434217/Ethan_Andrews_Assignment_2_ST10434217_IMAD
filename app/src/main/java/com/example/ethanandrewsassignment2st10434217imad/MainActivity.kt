package com.example.ethanandrewsassignment2st10434217imad

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private lateinit var btnChangeColor : Button
private lateinit var backgroundLayout : View

//Initializing Private Variables to be Used Later

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnChangeColor = findViewById(R.id.btnChangeColor)
        backgroundLayout = findViewById(R.id.backgroundLayout)

        //Checking if The Button is Clicked Then Changing The Color Randomly And
        //Putting it The Intent For The Second Screen

        btnChangeColor.setOnClickListener{
            val randomColor = Color.argb(255, (0..255).random(), (0..255).random(), (0..255).random())
            backgroundLayout.setBackgroundColor(randomColor)
            val intent = Intent(this, MainScreen::class.java)
            intent.putExtra("color", randomColor)


        }

        //Checking if The Button is Clicked Then Moving on to The Second Screen

        val btnWelcome = findViewById<Button>(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            //create the explicit intent
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
            //starting the activity
        }



    }
}


