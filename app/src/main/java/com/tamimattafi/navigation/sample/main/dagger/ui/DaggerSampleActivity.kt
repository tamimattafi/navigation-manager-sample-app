package com.tamimattafi.navigation.sample.main.dagger.ui

import android.os.Bundle
import com.tamimattafi.navigation.dagger.activities.DaggerNavigationActivity
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.global.Launcher

class DaggerSampleActivity : DaggerNavigationActivity() {

    override val layoutId: Int = R.layout.activity_dagger
    override val rootId: Int = R.id.fragmentContainer

    private val launcher: Launcher<DaggerSampleFragment> = DaggerSampleLauncher()

    override fun onViewCreated(savedInstanceState: Bundle?) {
        super.onViewCreated(savedInstanceState)
        launcher.handleLaunch(savedInstanceState, this::restartNavigationFrom)
    }

}
