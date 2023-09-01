package com.learning.binarch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // private var tvHelloWorld : TextView? = null

    //1. Declare binding
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //2. initiate binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        //3. change layout name into binding root
        setContentView(binding?.root)
        setTextHello()
    }

    private fun setTextHello() {
        // Old way

        //tvHelloWorld = findViewById(R.id.tv_hello_world)
        //tvHelloWorld?.text = "text text text" // Setter
        //Toast.makeText(this, tvHelloWorld?.text, Toast.LENGTH_SHORT).show() //getter

        //View binding
        binding?.tvHelloWorld?.text = "text text text"

        //context in android
        // Application context -> whole app context
        // Activity context -> Di activity mana
    }


}