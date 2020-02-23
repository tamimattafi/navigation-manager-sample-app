package com.tamimattafi.navigation.sample.activities

import com.tamimattafi.navigation.basic.activities.BasicNavigationActivity
import com.tamimattafi.navigation.sample.R

class BasicActivity : BasicNavigationActivity() {

    override val layoutId: Int = R.layout.activity_basic
    override val rootId: Int = R.id.fragmentContainer


}
