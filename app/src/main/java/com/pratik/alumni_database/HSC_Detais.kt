package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hsc__detais.*

class HSC_Detais : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hsc__detais)


        hsc_submit.setOnClickListener{
            var hscsbmt=Intent( this,Engineering_Details::class.java )
            startActivity(hscsbmt)
        }

    }
}



