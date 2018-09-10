package com.dicoding.kotlin.achmad.kotlinacademyfootballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.detail.view.*
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {
    private var name: String = ""
    private var desc: String = ""
    lateinit var nameTextView: TextView
    lateinit var clubImageView: ImageView
    lateinit var clubDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        verticalLayout{
            padding = dip(16)
            clubImageView = imageView()
            nameTextView = textView()
            clubDescription = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextView.text = name
        desc = intent.getStringExtra("desc")
        clubDescription.text = desc


    }
}
