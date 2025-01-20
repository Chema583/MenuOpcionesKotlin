package com.example.ejerciciomenuopciones

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciomenuopciones.databinding.ActivityScrollingDamBinding
import com.google.android.material.appbar.CollapsingToolbarLayout

class ScrollingDAM : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingDamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingDamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        val toolBarLayout: CollapsingToolbarLayout = binding.toolbarLayout
        toolBarLayout.title = title

        val fab = binding.fab
        fab.setOnClickListener {
            val intent = Intent(this@ScrollingDAM, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
