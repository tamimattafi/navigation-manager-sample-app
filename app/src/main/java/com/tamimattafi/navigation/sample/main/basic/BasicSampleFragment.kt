package com.tamimattafi.navigation.sample.main.basic

import android.os.Bundle
import android.view.View
import com.tamimattafi.navigation.basic.BasicNavigator
import com.tamimattafi.navigation.basic.fragments.BasicNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentExtension
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentLauncher

class BasicSampleFragment : BasicNavigationFragment(), BasicSampleExtension {

    override val fragmentName: String = this.javaClass.simpleName

    override val layoutId: Int = R.layout.fragment_basic
    override val launcher: SampleFragmentLauncher<BasicSampleFragment> = BasicSampleLauncher()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    override fun getSampleFragment(): BasicSampleFragment = this

    override fun getSampleNavigator(): BasicNavigator = navigator

}


