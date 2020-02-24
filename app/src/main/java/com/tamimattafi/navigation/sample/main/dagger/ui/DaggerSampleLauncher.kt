package com.tamimattafi.navigation.sample.main.dagger.ui

import com.tamimattafi.navigation.sample.main.extenstions.FragmentCreator
import com.tamimattafi.navigation.sample.main.extenstions.SampleLauncher

class DaggerSampleLauncher : SampleLauncher<DaggerSampleFragment>() {

    override val fragmentCreator: FragmentCreator<DaggerSampleFragment>
            = FragmentCreator(DaggerSampleFragment::class.java)

}