package com.tamimattafi.navigation.sample.main.dagger.di.modules.fragment

import com.tamimattafi.navigation.sample.main.dagger.ui.DaggerSampleFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract fun daggerFragment(): DaggerSampleFragment

}