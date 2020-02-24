package com.tamimattafi.navigation.sample.main.tools

import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment
import com.tamimattafi.navigation.sample.global.Launcher

abstract class SampleFragmentLauncher<F: BaseNavigationFragment> : Launcher<F>() {

    protected abstract val fragmentCreator: SampleFragmentCreator<F>

    override val launcherFragment: F
        get() = fragmentCreator.newInstance(START_POSITION)

    fun handleAttach(currentNumber: Int, onRequestLaunchFragment: (fragment: F) -> Unit) {
        onRequestLaunchFragment.invoke(fragmentCreator.newInstance(currentNumber + NAVIGATION_STEP))
    }

    companion object {
        const val START_POSITION = 1
        const val NAVIGATION_STEP = 1
    }

}