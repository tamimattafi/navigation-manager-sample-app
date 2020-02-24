package com.tamimattafi.navigation.sample.main.dagger.ui

import com.tamimattafi.navigation.sample.main.tools.SampleFragmentCreator
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentLauncher

class DaggerSampleLauncher : SampleFragmentLauncher<DaggerSampleFragment>() {

    override val fragmentCreator: SampleFragmentCreator<DaggerSampleFragment>
            = SampleFragmentCreator(DaggerSampleFragment::class.java)

}