package com.tamimattafi.navigation.sample.global

import android.os.Bundle
import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment

abstract class Launcher<F: BaseNavigationFragment> {

    protected abstract val launcherFragment: F

    fun handleLaunch(savedInstanceState: Bundle?, onRequestLaunchFragment: (fragment: F) -> Unit) {
        if (savedInstanceState == null) onRequestLaunchFragment.invoke(launcherFragment)
    }

}