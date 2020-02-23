package com.tamimattafi.navigation.sample.activities

import com.tamimattafi.navigation.dagger.activities.DaggerNavigationActivity
import com.tamimattafi.navigation.sample.R

class DaggerActivity : DaggerNavigationActivity() {

    override val layoutId: Int = R.layout.activity_dagger
    override val rootId: Int = R.id.fragmentContainer

}
