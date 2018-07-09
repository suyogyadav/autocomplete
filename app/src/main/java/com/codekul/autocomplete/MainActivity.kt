package com.codekul.autocomplete

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val abc = arrayOf("abc","Pav-Bhaji","Shejwan Noodles","CountryFeastPizza","Sandwitch" )
        val lst = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,abc)
        autoCompleteTextView.setAdapter(lst);
    }

}
