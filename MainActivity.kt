package com.example.birthdaywish

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createbdaycard(view: View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this,"Happy birthday $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this,MainActivity2::class.java)
        intent.putExtra(MainActivity2.NAME_EXTRA,name)
        startActivity(intent)
    }
}