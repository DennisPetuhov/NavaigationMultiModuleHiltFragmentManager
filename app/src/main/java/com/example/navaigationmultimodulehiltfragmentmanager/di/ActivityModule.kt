package com.example.navaigationmultimodulehiltfragmentmanager.di

import com.example.navaigationmultimodulehiltfragmentmanager.navigation.welcome.WelcomeButtonClickImpl
import com.example.welcome.WelcomeButtonClick
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ActivityModule {
    @Binds
    abstract fun provideWelcomeButtonClick(welcomeButtonClick: WelcomeButtonClickImpl): WelcomeButtonClick
}