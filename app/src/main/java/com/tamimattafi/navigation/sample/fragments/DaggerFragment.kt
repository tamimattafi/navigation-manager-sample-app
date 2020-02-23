package com.tamimattafi.navigation.sample.fragments

import com.tamimattafi.navigation.dagger.fragments.DaggerNavigationFragment
import com.tamimattafi.navigation.sample.R

class DaggerFragment : DaggerNavigationFragment() {

    override val fragmentName: String = this.javaClass.name
    override val layoutId: Int = R.layout.fragment_dagger

}