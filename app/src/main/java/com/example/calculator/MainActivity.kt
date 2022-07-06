package com.example.calculator
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: MaterialTextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.welcomeScreen)
        button = findViewById(R.id.welcomeButton)
        textView.text = "Welcome to Calculator"
        button.setOnClickListener {
            val intent = Intent(this, CalculatorActivity :: class.java)
            startActivity(intent)
        }
    }
}