package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        //plus function
        binding.plusButton.setOnClickListener {

        }

        //dividor function
        binding.plusButton.setOnClickListener {

        }

        //clear function
        binding.clearButton.setOnClickListener {
            binding.eingabewert1.setText("")
            binding.eingabewert2.setText("")
            binding.endergebnis.setText("")
        }

        //equal function
        binding.resultButton.setOnClickListener {
            var wert1 = binding.eingabewert1.text.toString().toInt()
            var wert2 = binding.eingabewert2.text.toString().toInt()

            var ergebnis = wert1 + wert2
            binding.endergebnis.text = ergebnis.toString()

        }

    }
}