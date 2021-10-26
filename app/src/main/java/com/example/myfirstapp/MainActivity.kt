package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.inflate
import android.widget.EditText
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.example.myfirstapp.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickAdd (view: View) {
        val shopName = binding.shopNameText.text.toString()
        val serialNum = binding.serialText.text.toString()
        listOfShops.add(Shop(shopName, serialNum.toInt()))
        binding.shopNameText.text.clear()
        binding.serialText.text.clear()

    }

    fun onClickInfo (view: View) {
        Log.i("Number of shops",listOfShops.size.toString())
    }

    fun onClickExit (view: View) {
        this@MainActivity.finish()
        exitProcess(0)
    }
}