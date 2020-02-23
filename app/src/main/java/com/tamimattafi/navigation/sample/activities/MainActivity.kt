package com.tamimattafi.navigation.sample.activities

import android.os.Bundle
import com.tamimattafi.navigation.basic.activities.BasicNavigationActivity
import com.tamimattafi.navigation.sample.fragments.MainFragment
import com.tamimattafi.navigation.sample.R

class MainActivity : BasicNavigationActivity() {

    override val layoutId: Int = R.layout.activity_main
    override val rootId: Int = R.id.fragmentContainer

    override fun onViewCreated(savedInstanceState: Bundle?) {
        super.onViewCreated(savedInstanceState)
        savedInstanceState?.let { restartNavigationFrom(MainFragment()) }
    }

}
