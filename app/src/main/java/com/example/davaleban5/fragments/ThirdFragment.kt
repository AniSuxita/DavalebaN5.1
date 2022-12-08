package com.example.davaleban5.fragments

import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.davaleban5.R

class ThirdFragment: Fragment (R.layout.fragment_third) {

    private lateinit var roll: ImageView
    private lateinit var restex: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        roll = view.findViewById(R.id.rolly)
        restex=view.findViewById(R.id.restex)

        roll.setOnClickListener{
            var num =(1 until 7).random()
            when(num){
                1 -> Toast.makeText(activity,"You rolled 1",Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(activity,"You rolled 2",Toast.LENGTH_LONG).show()
                3 -> Toast.makeText(activity,"You rolled 3",Toast.LENGTH_LONG).show()
                4 -> Toast.makeText(activity,"You rolled 4",Toast.LENGTH_LONG).show()
                5 -> Toast.makeText(activity,"You rolled 5",Toast.LENGTH_LONG).show()
                6 -> Toast.makeText(activity,"You rolled 6",Toast.LENGTH_LONG).show()
            }

            if (num == 6){
                restex.text = "თითქმის მოიგე შემდეგში 7-ის გაგორება სცადე"
            } else {
                restex.text = "ჰაჰა ლუზერო რა დაბალს აგორებ"
            }
        }

    }
}