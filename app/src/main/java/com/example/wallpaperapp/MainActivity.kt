package com.example.wallpaperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaperapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = arrayOf("January", "February", "March")
        val customAdapter = ImagesRecyclerViewAdapter(dataset)

        val recyclerView: RecyclerView = binding.imagesRecyclerView

        recyclerView.layoutManager = GridLayoutManager(this  , 2)
        recyclerView.adapter = customAdapter


        val dataset2 = arrayOf("enero", "febrero", "marzo", "abril")

        // todo in a button
        binding.chageInButton.setOnClickListener {
            customAdapter.setItems(dataset2)
        }
        binding.previsouPosition.setOnClickListener {
            customAdapter.setItems(dataset)
        }
    }
}
