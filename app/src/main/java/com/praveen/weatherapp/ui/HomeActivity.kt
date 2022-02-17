package com.praveen.weatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.praveen.weatherapp.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val transation=supportFragmentManager.beginTransaction()
        transation.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transation.add(R.id.frame_container,HomeFragmentFragment(),"HomeFragmentFragment").commitAllowingStateLoss()


    }
}