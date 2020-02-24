package com.tamimattafi.navigation.sample.main.extenstions

import android.app.Activity
import android.view.View
import com.google.android.material.button.MaterialButton
import com.tamimattafi.navigation.core.NavigationContract.*
import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment
import kotlinx.android.synthetic.main.layout_navigation_fragment.view.*
import kotlinx.android.synthetic.main.toolbar_navigation_fragment.view.*

interface SampleFragment<B: BaseNavigationFragment, F: B, N: Navigator<B>> {

    val launcher: SampleLauncher<F>
    val fragmentNumber: Int

    fun getFragmentView(): View
    fun getFragmentNavigator(): N
    fun getFragmentActivity(): Activity
    fun getFragmentTitle(): String

    fun setUpViews() {
        getFragmentView().apply {
            navigateTo.navigateOnClick(getFragmentNavigator()::navigateTo)
            switchTo.navigateOnClick(getFragmentNavigator()::switchTo)
            restartFrom.restartOnClick(getFragmentNavigator()::restartNavigationFrom)
            back.doOnClick(getFragmentNavigator()::performBackPress)
            close.doOnClick(getFragmentActivity()::finish)
            title.text = getFragmentTitle()
            number.text = fragmentNumber.toString()
        }
    }

    private fun MaterialButton.navigateOnClick(action: (fragment: F, addToBackStack: Boolean) -> Unit) {
        setOnClickListener {
            launcher.handleAttach(fragmentNumber) { newFragment ->
                action.invoke(newFragment, getFragmentView().backStack.isChecked)
            }
        }
    }

    private fun MaterialButton.restartOnClick(action: (fragment: F) -> Unit) {
        setOnClickListener {
            launcher.handleLaunch(null, action)
        }
    }

    private fun View.doOnClick(action: () -> Unit) {
        setOnClickListener {
            action.invoke()
        }
    }


}