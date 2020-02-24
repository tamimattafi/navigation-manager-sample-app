package com.tamimattafi.navigation.sample.main.basic

import android.os.Bundle
import com.tamimattafi.navigation.basic.activities.BasicNavigationActivity
import com.tamimattafi.navigation.dagger.activities.DaggerNavigationActivity
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.global.Launcher

class BasicSampleActivity : BasicNavigationActivity() {

    override val layoutId: Int = R.layout.activity_dagger
    override val rootId: Int = R.id.fragmentContainer

    private val launcher: Launcher<BasicSampleFragment> = BasicSampleLauncher()

    override fun onViewCreated(savedInstanceState: Bundle?) {
        super.onViewCreated(savedInstanceState)
        launcher.handleLaunch(savedInstanceState, this::restartNavigationFrom)
    }

}
