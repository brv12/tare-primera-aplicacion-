package com.conexion.appedadcanina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowName.setOnClickListener{checkValue()}
    }
    fun checkValue(){
        if(etNAme.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
        }else{
            showErrorName()
        }
    }
    fun showErrorName(){
        Toast.makeText(this, "El nombre del usuario esta vacio", Toast.LENGTH_SHORT).show()
    }
}