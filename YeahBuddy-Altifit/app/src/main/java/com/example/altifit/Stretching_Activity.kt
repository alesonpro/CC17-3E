package com.example.altifit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StretchingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stretching)


        val stretchingRecyclerView: RecyclerView = findViewById(R.id.stretchingRecyclerView)
        val stretchingList = generateStretchingList() // Replace this with your list of stretching activities

        val adapter = StretchingAdapter(stretchingList)
        stretchingRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        stretchingRecyclerView.adapter = adapter
    }

    // Data class for stretching activities
    data class StretchingActivity(val imageResource: Int, val text: String)

    // Function to generate a list of stretching activities (Replace this with your data source)
    private fun generateStretchingList(): List<StretchingActivity> {
        val stretchingList = mutableListOf<StretchingActivity>()

        // Add stretching activities here, with image and text
        stretchingList.add(StretchingActivity(R.drawable.stretch_1, "Stretching Activity 1"))
        stretchingList.add(StretchingActivity(R.drawable.stretch_2, "Stretching Activity 2"))
        // Add more activities as needed

        return stretchingList
    }
    // Adapter class for the RecyclerView
    inner class StretchingAdapter(private val stretchingList: List<StretchingActivity>) :
        RecyclerView.Adapter<StretchingAdapter.StretchingViewHolder>() {

        // ViewHolder class
        inner class StretchingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val stretchingImage: ImageView = itemView.findViewById(R.id.stretchingImage)
            val stretchingText: TextView = itemView.findViewById(R.id.stretchingText)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StretchingViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_stretching, parent, false)
            return StretchingViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: StretchingViewHolder, position: Int) {
            val currentItem = stretchingList[position]

            holder.stretchingImage.setImageResource(currentItem.imageResource)
            holder.stretchingText.text = currentItem.text
        }

        override fun getItemCount(): Int {
            return stretchingList.size
        }
    }
}
