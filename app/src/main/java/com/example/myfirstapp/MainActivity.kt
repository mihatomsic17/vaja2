package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAdd (view: View?) {
        val shopName = findViewById<EditText>(R.id.shopNameText).text.toString()
        val serialNum = findViewById<EditText>(R.id.serialText).text.toString()
        listOfShops.add(Shop(shopName, serialNum.toInt()))
        findViewById<EditText>(R.id.shopNameText).text.clear()
        findViewById<EditText>(R.id.serialText).text.clear()
    }

    fun onClickInfo (view: View) {
        Log.i("Number of shops",listOfShops.size.toString())
    }

    fun onClickExit (view: View) {
        this@MainActivity.finish()
        exitProcess(0)
    }
}