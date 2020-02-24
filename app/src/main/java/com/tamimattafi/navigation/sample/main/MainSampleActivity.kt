package com.tamimattafi.navigation.sample.main

import android.os.Bundle
import com.tamimattafi.navigation.basic.activities.BasicNavigationActivity
import com.tamimattafi.navigation.basic.fragments.BasicNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.global.Launcher

class MainSampleActivity : BasicNavigationActivity() {

    override val layoutId: Int = R.layout.activity_main
    override val rootId: Int = R.id.fragmentContainer

    private val launcher: Launcher<BasicNavigationFragment> = MainSampleLauncher()

    override fun onViewCreated(savedInstanceState: Bundle?) {
        super.onViewCreated(savedInstanceState)
        launcher.handleLaunch(savedInstanceState, this::restartNavigationFrom)
    }

}
