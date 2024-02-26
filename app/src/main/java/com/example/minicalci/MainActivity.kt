package com.example.minicalci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adding()


    }


    fun adding(){
        var var1 = findViewById<EditText>(R.id.Number1)
        var var2 = findViewById<EditText>(R.id.Number2)
        var var3 = findViewById<ImageView>(R.id.plus)
        var subtract = findViewById<ImageView>(R.id.subtract)
        var multiply = findViewById<ImageView>(R.id.multiply)
        var divide = findViewById<ImageView>(R.id.divide)
        var var4 = findViewById<ImageView>(R.id.clear)
        var res = findViewById<TextView>(R.id.textView)


        var3.setOnClickListener {

            try {


                var var4 = var1.text.toString().toInt()
                var var5 = var2.text.toString().toInt()
                var var6 = var4 + var5
                res.setText("Your answer is $var6");

            } catch (e: NumberFormatException) {
                res.text = "Enter valid numbers."

            }
        }
            subtract.setOnClickListener {
                try {
                    var var4 = var1.text.toString().toInt()
                    var var5 = var2.text.toString().toInt()
                    var var6 = var4 - var5
                    res.setText("Your answer is $var6");
                } catch (e: NumberFormatException) {
                    res.text = "Enter valid numbers."
                }}
                multiply.setOnClickListener{
                try {
                    var var4 = var1.text.toString().toInt()
                    var var5 = var2.text.toString().toInt()
                    var var6 = var4 * var5
                    res.setText("Your answer is $var6");
                } catch (e: NumberFormatException) {
                    res.text = "Enter valid numbers."
                }}

                divide.setOnClickListener {
                    try {
                        var var4 = var1.text.toString().toFloat()
                        var var5 = var2.text.toString().toFloat()
                        var var6 = var4 / var5
                        res.setText("Your answer is $var6");
                    } catch (e: NumberFormatException) {
                        res.text = "Enter valid numbers."
                    }
                }

                var4.setOnClickListener {
                    var1.setText("");
                    var2.setText("");
                    res.setText("(●'◡'●)")

                    Toast.makeText(this, "Good TO go now!", Toast.LENGTH_SHORT).show()


            }


            }


        }
