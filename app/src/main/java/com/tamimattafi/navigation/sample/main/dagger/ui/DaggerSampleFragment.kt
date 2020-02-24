package com.tamimattafi.navigation.sample.main.dagger.ui

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.tamimattafi.navigation.dagger.DaggerNavigator
import com.tamimattafi.navigation.dagger.fragments.DaggerNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.main.extenstions.FragmentCreator
import com.tamimattafi.navigation.sample.main.extenstions.SampleFragment
import com.tamimattafi.navigation.sample.main.extenstions.SampleLauncher

class DaggerSampleFragment : DaggerNavigationFragment(),
    SampleFragment<DaggerNavigationFragment, DaggerSampleFragment, DaggerNavigator> {

    override val fragmentName: String = this.javaClass.simpleName

    override val layoutId: Int = R.layout.fragment_dagger
    override val launcher: SampleLauncher<DaggerSampleFragment> = DaggerSampleLauncher()

    override val fragmentNumber: Int by lazy {
        arguments?.getInt(FragmentCreator.FRAGMENT_NUMBER) ?: 1
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    override fun getFragmentView(): View = view!!

    override fun getFragmentNavigator(): DaggerNavigator = navigator

    override fun getFragmentActivity(): Activity = activity!!

    override fun getFragmentTitle(): String = fragmentName

}


