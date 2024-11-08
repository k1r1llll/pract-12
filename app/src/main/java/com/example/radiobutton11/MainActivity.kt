package com.example.radiobutton11

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val img1 = findViewById<ImageView>(R.id.imageView9)
        val img11 = findViewById<ImageView>(R.id.imageView10)
        val img111 = findViewById<ImageView>(R.id.imageView11)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)


        radioGroup.setOnCheckedChangeListener { _, checked ->
            val imageView = findViewById<ImageView>(R.id.imageView)
            when (checked) {

                R.id.radioButton4 -> imageView.setImageResource(R.drawable.fish)
                R.id.radioButton6 -> imageView.setImageResource(R.drawable.caar)
                R.id.radioButton7 -> imageView.setImageResource(R.drawable.gf)
            }



            checkBox1.setOnCheckedChangeListener { _, checked ->
                if (checked) {
                    img1.setImageResource(R.drawable.f)
                } else {
                    img1.setImageDrawable(null)
                }


            }
            checkBox2.setOnCheckedChangeListener { _, checked ->

                if (checked) {
                    img11.setImageResource(R.drawable.qa)
                } else {
                    img11.setImageDrawable(null)
                }
            }
        }
        checkBox3.setOnCheckedChangeListener { _, checked ->

            if (checked) {
                img111.setImageResource(R.drawable.qwq)
            } else {
                img111.setImageDrawable(null)
            }
        }
    }}



