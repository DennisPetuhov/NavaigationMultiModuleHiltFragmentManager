package com.example.home.di

import androidx.fragment.app.Fragment
import com.example.home.HomeFragment
import com.example.home.HomeInternalButtonClickedImpl
import com.example.home_internal.HomeInternalButtonClicked
import com.kpstv.home.di.HomeQualifier
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class HomeDependencyModule {


    @Provides
    @HomeQualifier
    fun homeFragment(fragment: Fragment): HomeFragment {
        return fragment.requireActivity().supportFragmentManager.fragments.find { it is HomeFragment } as HomeFragment
    }
}

@Module
@InstallIn(FragmentComponent::class)
abstract class HomeModule {

    @Binds
    abstract fun provideHomeInternalButtonClick(homeButtonClicked: HomeInternalButtonClickedImpl): HomeInternalButtonClicked
}
