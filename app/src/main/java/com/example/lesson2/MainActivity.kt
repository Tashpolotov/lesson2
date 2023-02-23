package com.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    val list = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
        listeners()
    }



    private fun initListeners() = with(binding) {
        btnAdd.setOnClickListener {
            if (edText.text.isNotEmpty()) {
                list.add(edText.text.toString())
                edText.text.clear()
            }
        }
    }

    private fun listeners() = with(binding) {
        btnPrint.setOnClickListener{
            list.forEach {
                tvText.append("$it\n")
            }

        }
    }
}