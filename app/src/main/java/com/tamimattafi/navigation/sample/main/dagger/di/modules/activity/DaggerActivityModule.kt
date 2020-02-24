package com.tamimattafi.navigation.sample.main.dagger.di.modules.activity

import com.tamimattafi.navigation.dagger.DaggerNavigator
import com.tamimattafi.navigation.sample.main.dagger.ui.DaggerSampleActivity
import dagger.Binds
import dagger.Module

@Module
abstract class DaggerActivityModule {

    @Binds
    abstract fun bindDaggerNavigator(navigator: DaggerSampleActivity): DaggerNavigator

}