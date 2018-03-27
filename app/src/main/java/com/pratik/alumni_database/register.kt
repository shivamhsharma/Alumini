package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import com.google.firebase.database.FirebaseDatabase

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        registersubmit.setOnClickListener {
            var sbbtn = Intent(this, AcademicDetails::class.java)
            startActivity(sbbtn)
            var n=names.text.toString()
            var p=phnumber.text.toString()
            var h=mails.text.toString()
            val mydatabase=FirebaseDatabase.getInstance().getReference("Register")//forr connecting with database
            val entry=mydatabase.push().key//deafult function of firebase
            val generates=generate(n,p,h)//values store in function
            mydatabase.child(entry).setValue(generates).addOnCompleteListener {
                Toast.makeText(this,"register_successfully",Toast.LENGTH_LONG).show()
            }
        }


            

        }

    }

