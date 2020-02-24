package com.tamimattafi.navigation.sample.main.dagger.ui

import com.tamimattafi.navigation.dagger.DaggerNavigator
import com.tamimattafi.navigation.dagger.fragments.DaggerNavigationFragment
import com.tamimattafi.navigation.sample.main.tools.SampleFragmentExtension

interface DaggerSampleExtension : SampleFragmentExtension<DaggerNavigationFragment, DaggerSampleFragment, DaggerNavigator>