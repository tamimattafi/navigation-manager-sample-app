package com.tamimattafi.navigation.sample.main.dagger.di.modules.activity

import com.tamimattafi.navigation.sample.main.dagger.di.modules.fragment.FragmentsModule
import com.tamimattafi.navigation.sample.main.dagger.ui.DaggerSampleActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = [DaggerActivityModule::class, FragmentsModule::class])
    abstract fun daggerActivity(): DaggerSampleActivity

}