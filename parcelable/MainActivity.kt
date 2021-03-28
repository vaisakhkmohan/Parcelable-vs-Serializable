package com.vaisakh.hustler.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    companion object{
        const val users = "user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("vaisakh","abcd123", PersonalInfo("vais","vava"))
        val intent =Intent(this, MainActivity2::class.java)
        intent.putExtra("users",user)
        startActivity(intent)

    }
}