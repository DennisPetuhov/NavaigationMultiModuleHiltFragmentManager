package com.example.navaigationmultimodulehiltfragmentmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.welcome.WelcomeFragment
import dagger.hilt.android.AndroidEntryPoint

//https://proandroiddev.com/scalable-navigation-in-multi-module-projects-c3c44dc1b913
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frag_container, WelcomeFragment::class.java, null)
                .commit()
        }
    }

}