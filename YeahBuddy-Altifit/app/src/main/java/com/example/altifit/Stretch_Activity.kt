package com.example.altifit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class Stretch_Activity : AppCompatActivity() {

    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Tutorials>
    private lateinit var tempArrayList : ArrayList<Tutorials>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stretch)

        imageId = arrayOf(
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1,
            R.drawable.stretch_1
        )

        heading = arrayOf(
            "Cobra Stretch",
            "Placeholder",
            "Placeholder",
            "Placeholder",
            "Placeholder"

        )


        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)


        newArrayList = arrayListOf<Tutorials>()
        tempArrayList = arrayListOf<Tutorials>()
        getUserdata()

    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val tutorials = Tutorials(imageId[i], heading[i])
            newArrayList.add(tutorials)
        }

        newRecylerview.adapter = MyAdapter(newArrayList)
    }

}

