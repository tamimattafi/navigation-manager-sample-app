package com.tamimattafi.navigation.sample.main.extenstions

import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment
import com.tamimattafi.navigation.sample.global.Launcher

abstract class SampleLauncher<F: BaseNavigationFragment> : Launcher<F>() {

    protected abstract val fragmentCreator: FragmentCreator<F>

    override val launcherFragment: F
        get() = fragmentCreator.newInstance(START_POSITION)

    fun handleAttach(currentNumber: Int, onRequestLaunchFragment: (fragment: F) -> Unit) {
        onRequestLaunchFragment.invoke(fragmentCreator.newInstance(currentNumber + NAVIGATION_STEP))
    }

    companion object {
        private const val START_POSITION = 1
        private const val NAVIGATION_STEP = 1
    }

}