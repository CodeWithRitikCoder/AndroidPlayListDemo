package com.ritikcoder.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ritikcoder.myapplication3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.userName.text.toString()== "RitikCoder" && binding.password.text.toString()== "@RitikCoder"){
                Toast.makeText(this, "Login Successfully!", Toast.LENGTH_SHORT).show()
                intent= Intent(applicationContext, MainActivity2::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })

    }
}