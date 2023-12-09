package com.example.navaigationmultimodulehiltfragmentmanager.navigation.welcome

import androidx.fragment.app.FragmentActivity
import com.example.home.HomeFragment
import com.example.navaigationmultimodulehiltfragmentmanager.R
import com.example.welcome.WelcomeButtonClick
import javax.inject.Inject

class WelcomeButtonClickImpl @Inject constructor(
    private val activity: FragmentActivity /* Provides the nearest fragment activity */
) : WelcomeButtonClick {
    override fun goToNext() {
        activity.supportFragmentManager.beginTransaction()
            .addToBackStack("home")
            .replace(R.id.frag_container, HomeFragment::class.java, null)
            .commit()
    }
}