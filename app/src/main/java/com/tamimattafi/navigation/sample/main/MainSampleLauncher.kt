package com.tamimattafi.navigation.sample.main

import com.tamimattafi.navigation.basic.fragments.BasicNavigationFragment
import com.tamimattafi.navigation.sample.global.Launcher

class MainSampleLauncher : Launcher<BasicNavigationFragment>() {

    override val launcherFragment: BasicNavigationFragment
        get() = MainSampleFragment()

}