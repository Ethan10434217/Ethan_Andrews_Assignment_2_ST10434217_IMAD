package com.example.ethanandrewsassignment2st10434217imad

//Imports

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView



class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        //Initializing Variables

        val imgView = findViewById<ImageView>(R.id.imgMain)
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val edtHungerStatus = findViewById<TextView>(R.id.edtHungerStatus)
        val edtCleanStatus = findViewById<TextView>(R.id.edtCleanStatus)
        val edtPlayStatus = findViewById<TextView>(R.id.edtPlayStatus)

        val edtWelcome = findViewById<TextView>(R.id.edtWelcome)

        val secondlayout = findViewById<LinearLayout>(R.id.backgroundLayout)

        //Changing the color and Getting it From The First Screen

        val randomColor = Color.argb(255, (0..255).random(), (0..255).random(), (0..255).random())
        val color = intent.getIntExtra("color", randomColor)

        //Setting The Color

        secondlayout.setBackgroundColor(color)

        //Checking if The Buttons Are Clicked Then Changing The Image And Updating The Status

        btnFeed.setOnClickListener{
            imgView.setImageResource(R.drawable.image2)
            edtHungerStatus.text = "I am Full!"
            edtWelcome.text = "Thank You! That Was Yum!"
        }

        btnClean.setOnClickListener {
            imgView.setImageResource(R.drawable.image3)
            edtCleanStatus.text = "I am Clean!"
            edtWelcome.text = "Thank You! I am Clean!"
        }

        btnPlay.setOnClickListener {
            imgView.setImageResource(R.drawable.image4)
            edtPlayStatus.text = "I am Happy!"
            edtWelcome.text = "Thank You! That Was Fun!"

        }


    }

}

