package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_personaldetails.*

class personaldetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaldetails)


        pdbtn.setOnClickListener{
            var prsnldtl=Intent(this,SSCDetails::class.java )
            startActivity(prsnldtl)
        }



        }
    }

