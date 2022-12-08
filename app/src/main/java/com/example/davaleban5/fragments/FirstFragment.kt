package com.example.davaleban5.fragments

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.davaleban5.R


class FirstFragment: Fragment(R.layout.fragment_first) {

    private lateinit var editText: EditText
    private lateinit var addBtn: Button
    private lateinit var clearBtn: Button
    private lateinit var textView: TextView
    private lateinit var sharedPreferences: SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editText)
        addBtn = view.findViewById(R.id.addBtn)
        clearBtn = view.findViewById(R.id.clearBtn)
        textView = view.findViewById(R.id.textView)
        sharedPreferences=  requireActivity().applicationContext.getSharedPreferences("MY_PREFERENCES", MODE_PRIVATE)
        val prefNote = sharedPreferences.getString("NOTE","")
        textView.text = prefNote


        addBtn.setOnClickListener{
            val note= editText.text.toString()

            if (note.isNullOrEmpty()){
                return@setOnClickListener
            }

            val notes=textView.text.toString()
            val resultText=notes + "\n" + note
            textView.text = resultText
            editText.setText("")

            sharedPreferences.edit()
                .putString("NOTE",resultText)
                .apply()

        }

        clearBtn.setOnClickListener{
            textView.text = ""
            sharedPreferences.edit()
                .putString("NOTE","")
                .apply()
        }



    }

}