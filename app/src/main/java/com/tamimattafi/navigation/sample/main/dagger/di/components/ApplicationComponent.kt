package com.tamimattafi.navigation.sample.main.dagger.di.components

import com.tamimattafi.navigation.sample.main.dagger.DaggerSampleApplication
import com.tamimattafi.navigation.sample.main.dagger.di.modules.activity.ActivitiesModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent : AndroidInjector<DaggerSampleApplication> {

    override fun inject(instance: DaggerSampleApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withApplication(daggerSampleApplication: DaggerSampleApplication): Builder

        fun build(): ApplicationComponent

    }
}