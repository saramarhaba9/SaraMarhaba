package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var x = MyRandom()
    var y = MyRandom()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clickme = findViewById<Button>(R.id.button1)
        val clickme1 = findViewById<Button>(R.id.button2)

        clickme.text = x.toString()
        clickme1.text = y.toString()

        clickme.setOnClickListener {
            if (x>y)
                Toast.makeText(this, "Correct",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Not Correct ",Toast.LENGTH_SHORT).show()
            changeValue()
            clickme.text = x.toString()
            clickme1.text = y.toString()

        }

        clickme1.setOnClickListener{
            if (y>x)
                Toast.makeText(this, "Correct",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Not Correct ",Toast.LENGTH_SHORT).show()
            changeValue()
            clickme.text = x.toString()
            clickme1.text = y.toString()
        }

    }

    fun b1(view: View) {}

    fun MyRandom(): Int {
        return (0..100).random()
    }

    fun changeValue () {
        x = MyRandom()
        y = MyRandom()
    }


}