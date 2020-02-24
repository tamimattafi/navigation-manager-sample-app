package com.tamimattafi.navigation.sample.main.basic

import com.tamimattafi.navigation.sample.main.extenstions.FragmentCreator
import com.tamimattafi.navigation.sample.main.extenstions.SampleLauncher

class BasicSampleLauncher : SampleLauncher<BasicSampleFragment>() {

    override val fragmentCreator: FragmentCreator<BasicSampleFragment>
            = FragmentCreator(BasicSampleFragment::class.java)

}