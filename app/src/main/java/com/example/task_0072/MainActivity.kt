package com.example.task_0072

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textTV: TextView
    private lateinit var checkBoxCB: CheckBox

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        checkBoxCB = findViewById(R.id.checkBoxCB)

        checkBoxCB.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textTV.text = "Скорость превышать нельзя.\n" +
                              "На красный свет проезжать нельзя.\n" + "Пешеходов нужно пропускать.\n"
            } else {
                textTV.text = ""
            }
        }
    }
}