package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_engineering__details.*

class Engineering_Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engineering__details)

        eng_submit.setOnClickListener{
            var engsbmt= Intent(this,AcademicDetails::class.java )
            startActivity(engsbmt)

        }



    }
}
