package com.example.layouttester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.instant_promo_upsell.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle_share_on_snapchat.setOnClickListener {
            three.visibility = if (three.visibility == View.VISIBLE){
                View.GONE
            } else {
                View.VISIBLE
            }
        }
    }
}