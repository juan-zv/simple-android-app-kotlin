package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etAge: EditText
    private lateinit var tvFriend: TextView
    private lateinit var btnAbstractFriend: Button

    class Friend (private val name:String, private val age:String){

        fun greet (): String {
            return "Hi, I am $name and I am $age years old!"
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        tvFriend = findViewById(R.id.tvFriend)
        btnAbstractFriend = findViewById(R.id.button)

        tvFriend.visibility = View.INVISIBLE

        btnAbstractFriend.setOnClickListener {

            val newFriend = Friend(etName.text.toString(), etAge.text.toString())

            tvFriend.text = newFriend.greet()

            tvFriend.visibility = View.VISIBLE
        }

    }
}