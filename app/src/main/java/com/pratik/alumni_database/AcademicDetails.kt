package com.pratik.alumni_database

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_academic_details.*

class AcademicDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_academic_details)




        acdmcprsnl.setOnClickListener {             //id.setOnClickListener{}
            var acdmcprsl = Intent(this, personaldetails::class.java)
            startActivity(acdmcprsl)
        }

        acdmc10.setOnClickListener {
            var ssc = Intent(this, SSCDetails::class.java)
            startActivity(ssc)
        }

        acdmc12.setOnClickListener {
            var hsc = Intent(this, HSC_Detais::class.java)
            startActivity(hsc)
        }
            acdmceng.setOnClickListener {
             var acdmceng1 = Intent(this, Engineering_Details::class.java)
             startActivity(acdmceng1)

                }
            acdmcsubmit.setOnClickListener{
                var acdsbmt = Intent(this, dataset::class.java)
                startActivity(acdsbmt)
            }
            }
    }
