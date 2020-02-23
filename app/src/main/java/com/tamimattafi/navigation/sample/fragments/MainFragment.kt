package com.tamimattafi.navigation.sample.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.tamimattafi.navigation.basic.fragments.BasicNavigationFragment
import com.tamimattafi.navigation.sample.R
import com.tamimattafi.navigation.sample.activities.BasicActivity
import com.tamimattafi.navigation.sample.activities.DaggerActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BasicNavigationFragment() {

    override val fragmentName: String = this.javaClass.name
    override val layoutId: Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    private fun setUpViews() {
        dagger.openActivityOnClick(DaggerActivity::class.java)
        basic.openActivityOnClick(BasicActivity::class.java)
    }

    private fun <T: Activity> MaterialButton.openActivityOnClick(clazz: Class<T>) {
        setOnClickListener {
            activity?.startActivity(Intent(activity, clazz))
        }
    }

}


