package com.example.calculator
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {
    var TAG = "CalculatorActivity"

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var button0: Button
    lateinit var equation: MaterialTextView
    lateinit var answer: MaterialTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // View numbers
        button1 = findViewById(R.id.button_1)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_3)
        button4 = findViewById(R.id.button_4)
        button5 = findViewById(R.id.button_5)
        button6 = findViewById(R.id.button_6)
        button7 = findViewById(R.id.button_7)
        button8 = findViewById(R.id.button_8)
        button9 = findViewById(R.id.button_9)
        button0 = findViewById(R.id.button_0)
        equation = findViewById(R.id.equation)
        answer = findViewById(R.id.answer)

        button0.setOnClickListener(::onClick)
        button1.setOnClickListener(::onClick)
        button2.setOnClickListener(::onClick)
        button3.setOnClickListener(::onClick)
        button4.setOnClickListener(::onClick)
        button5.setOnClickListener(::onClick)
        button6.setOnClickListener(::onClick)
        button7.setOnClickListener(::onClick)
        button8.setOnClickListener(::onClick)
        button9.setOnClickListener(::onClick)
    }

    override fun onClick(v: View?) {
        // Click numbers
        when(v?.id) {
            R.id.button_0,
            R.id.button_1,
            R.id.button_2,
            R.id.button_3,
            R.id.button_4,
            R.id.button_5,
            R.id.button_6,
            R.id.button_7,
            R.id.button_8,
            R.id.button_9,
            -> {
                // Inputs appear on screen
                val num = (v as? Button)?.text.toString().toInt()
                Log.e(TAG, "onClick: $num was pressed", )
                val equationText = "${equation.text}${num}"
                equation.text = equationText
            }

            // Click operators
            R.id.button_add,
            R.id.button_subtract,
            R.id.button_multiply,
            R.id.button_divide -> {
                operatorClick(v)
            }

            // Click equal operator
            R.id.button_result -> {
                calculateResult(answer.text.toString())
            }
        }

        // Do dope tings and calculate
    }

    private fun operatorClick(v: View) {}

    private fun calculateResult(equation: String?) {}
}