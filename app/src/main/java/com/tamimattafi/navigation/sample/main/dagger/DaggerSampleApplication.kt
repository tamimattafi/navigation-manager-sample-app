package com.tamimattafi.navigation.sample.main.dagger

import com.tamimattafi.navigation.sample.main.dagger.di.components.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class DaggerSampleApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerSampleApplication>
        = DaggerApplicationComponent.builder().withApplication(this).build()

}