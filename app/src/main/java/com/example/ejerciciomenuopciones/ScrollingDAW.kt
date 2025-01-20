package com.example.ejerciciomenuopciones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciomenuopciones.databinding.ActivityScrollingDawBinding
import com.google.android.material.appbar.CollapsingToolbarLayout

class ScrollingDAW : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingDawBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingDawBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        val toolBarLayout: CollapsingToolbarLayout = binding.toolbarLayout
        toolBarLayout.title = title

        val fab = binding.fab
        fab.setOnClickListener {
            val intent = Intent(this@ScrollingDAW, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
