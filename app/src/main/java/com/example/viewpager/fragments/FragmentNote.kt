package com.example.viewpager.fragments

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaCodec.MetricsConstants.MODE
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.viewpager.R

class FragmentNote : Fragment(R.layout.fragment_note) {
    private lateinit var textView: TextView
    private lateinit var editTextNote : EditText
    private lateinit var buttonAdd : Button
    

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        val sharedPreferences = requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE)
        val text = sharedPreferences.getString("andria","")
        textView.text = text
        buttonAdd.setOnClickListener(){
            var note = editTextNote.text.toString()
            var text = textView.text.toString()
            var result = note + "\n" + text
            textView.text = result
            sharedPreferences.edit().putString("result",result).apply()
        }



    }
    private fun init(){
        textView = requireView().findViewById(R.id.textView)
        editTextNote = requireView().findViewById(R.id.editTextNote)
        buttonAdd = requireView().findViewById(R.id.buttonAdd)
    }



    }
