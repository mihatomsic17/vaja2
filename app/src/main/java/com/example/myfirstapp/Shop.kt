package com.example.myfirstapp

class Shop(val name:String, val serial: Int) {
    override fun toString(): String {
        return "Name: $name, Serial: $serial"
    }
}
val listOfShops: MutableList<Shop> = mutableListOf();
