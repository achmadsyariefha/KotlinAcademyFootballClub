package com.dicoding.kotlin.achmad.kotlinacademyfootballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    private var clubName: String = ""
    private var clubImage: Int = 0
    private var clubDetail: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        clubName = intent.getStringExtra("name")
        clubImage = intent.getStringExtra("club_image").toInt()
        clubDetail = intent.getStringExtra("club_detail")
        SecondActivityUI().setContentView(this)



    }

    inner class SecondActivityUI : AnkoComponent<SecondActivity> {
        override fun createView(ui: AnkoContext<SecondActivity>)= with(ui) {

            verticalLayout{
                padding = dip(16)
                imageView(clubImage).lparams {
                    height = wrapContent
                    width = wrapContent
                    margin = dip(8)
                    gravity = Gravity.CENTER_HORIZONTAL
                }
                textView(clubName).lparams {
                    height = wrapContent
                    width = wrapContent
                    margin = dip(4)
                    gravity = Gravity.CENTER_HORIZONTAL
                }
                textView(clubDetail).lparams {
                    height = wrapContent
                    width = wrapContent
                    margin = dip(8)
                    gravity = Gravity.CENTER_HORIZONTAL
                }

            }

        }
    }
}
