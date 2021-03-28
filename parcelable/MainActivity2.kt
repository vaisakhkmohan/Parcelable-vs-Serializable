package com.vaisakh.hustler.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import org.parceler.Parcels

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       intent?.let {
           val use = intent.extras?.getParcelable<User>("users")
          name.setText(use.toString())

       }
    }
}

