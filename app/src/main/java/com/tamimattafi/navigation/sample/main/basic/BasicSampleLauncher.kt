package com.tamimattafi.navigation.sample.main.basic

import com.tamimattafi.navigation.sample.main.tools.SampleFragmentCreator
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentLauncher

class BasicSampleLauncher : SampleFragmentLauncher<BasicSampleFragment>() {

    override val fragmentCreator: SampleFragmentCreator<BasicSampleFragment>
            = SampleFragmentCreator(BasicSampleFragment::class.java)

}