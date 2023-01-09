package com.conexion.appedadcanina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Segundapanta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundapanta)
        btnback.setOnClickListener{onBackPressed()}
    }
    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        tvGreeting.text = "Bienvenido $name"
    }
}