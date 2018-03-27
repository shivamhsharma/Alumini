package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbtn.setOnClickListener {
            val loginintent=Intent(this,dataset::class.java)
            startActivity(loginintent)
        }
            registerbtn.setOnClickListener {
                val registerintent=Intent(this,register::class.java)
                startActivity(registerintent)
            }
    }
}
