package com.tamimattafi.navigation.sample.main

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.tamimattafi.navigation.basic.fragments.BasicNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.main.basic.BasicSampleActivity
import com.tamimattafi.navigation.sample.main.dagger.ui.DaggerSampleActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainSampleFragment : BasicNavigationFragment() {

    override val fragmentName: String = this.javaClass.simpleName
    override val layoutId: Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    private fun setUpViews() {
        dagger.openActivityOnClick(DaggerSampleActivity::class.java)
        basic.openActivityOnClick(BasicSampleActivity::class.java)
    }

    private fun <T: Activity> MaterialButton.openActivityOnClick(clazz: Class<T>) {
        setOnClickListener {
            activity?.startActivity(Intent(activity, clazz))
        }
    }

}


