package com.example.materi_41

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)

        imageView1.setOnClickListener {
            showToast("Ia adalah Steve Jobs")
        }

        imageView2.setOnClickListener {
            showToast("Ia adalah Tim Cook")
        }
    }

    fun onImageClick(view: View) {
        when (view.id) {
            R.id.imageView1 -> showToast("")
            R.id.imageView2 -> showToast("")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
