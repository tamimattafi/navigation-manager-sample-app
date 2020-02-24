package com.tamimattafi.navigation.sample.main.dagger.ui

import android.os.Bundle
import android.view.View
import com.tamimattafi.navigation.dagger.DaggerNavigator
import com.tamimattafi.navigation.dagger.fragments.DaggerNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentLauncher

class DaggerSampleFragment : DaggerNavigationFragment(), DaggerSampleExtension {

    override val fragmentName: String = this.javaClass.simpleName

    override val layoutId: Int = R.layout.fragment_dagger
    override val launcher: SampleFragmentLauncher<DaggerSampleFragment> = DaggerSampleLauncher()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    override fun getSampleFragment(): DaggerSampleFragment = this

    override fun getSampleNavigator(): DaggerNavigator = navigator

}


