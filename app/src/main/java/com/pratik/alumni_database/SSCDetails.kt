package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_dataset.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_sscdetails.*

class SSCDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sscdetails)


//        ssc_submit.setOnClickListener{
//            var sscsbmt=intent(this,H::class.java )
//            startactivity(sscsbmt)
//
//     }
        ssc_submit.setOnClickListener {
            var sbbtn = Intent(this, AcademicDetails::class.java)
            startActivity(sbbtn)
            var n=ssc_school.text.toString()
            var p=ssc_passing.text.toString()
            var h=ssc_percentage.text.toString()
            var x=ssc_Board.text.toString()
            val mydatabase= FirebaseDatabase.getInstance().getReference("SSCDETAILS")//forr connecting with database
            val entry=mydatabase.push().key//deafult function of firebase
            val generates=details(n,p,h,x)//values store in function
            mydatabase.child(entry).setValue(generates).addOnCompleteListener {
                Toast.makeText(this,"register_successfully", Toast.LENGTH_LONG).show()
            }
        }


    }
}
