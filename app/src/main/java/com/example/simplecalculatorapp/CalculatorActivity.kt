package com.example.simplecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)

        val etFirst = findViewById<TextInputEditText>(R.id.etFirst)
        val etSecond = findViewById<TextInputEditText>(R.id.etSecond)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val n1 = etFirst.text.toString()
            val n2 = etSecond.text.toString()

            if (n1.isEmpty() || n2.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val a = n1.toDoubleOrNull()
            val b = n2.toDoubleOrNull()

            if (a == null || b == null) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (b == 0.0) {
                Toast.makeText(this, "Division or Modulus by 0 not allowed.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val add = a + b
            val sub = a - b
            val mul = a * b
            val div = a / b
            val mod = a % b

            val formattedDiv = "%.2f".format(div)



            val resultText = """
        Addition : ${add.toInt()}
        Subtraction : ${sub.toInt()}
        Multiplication : ${mul.toInt()}
        Division : $formattedDiv
        Modulus : ${mod.toInt()}
    """.trimIndent()

            tvResult.text = resultText
        }

    }
}