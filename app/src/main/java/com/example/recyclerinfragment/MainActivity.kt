package com.example.recyclerinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
   lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
//    val fragment=FirstFragment()
//            supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
//            true
        button=findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val fragment=FirstFragment()
            supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
            true

        })

//        button.setOnClickListener {
//            val fragment=FirstFragment()
//            supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
//            true
//        }

    }
}