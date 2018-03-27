package com.pratik.alumni_database

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_dataset.*
import android.widget.AdapterView
import android.widget.Toast


class dataset : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataset)
      //  val spinner = findViewById(R.id.spinner) as Spinner
//       // spinner.onItemSelectedListener =  object : AdapterView.OnItemSelectedListener {
        //    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

               // Toast.makeText(this, "You have Selected " + spinner.selectedItem.toString(), Toast.LENGTH_SHORT).show()

        datasetedit.setOnClickListener{
            var personeldetail=Intent(this,AcademicDetails::class.java )
            startActivity(personeldetail)
            }

//        textView2.setOnClickListener{
//            var AcademicDetail=Intent(this,AcademicDetails::class.java )
//            startActivity(AcademicDetail)
//        }
        }

    }

