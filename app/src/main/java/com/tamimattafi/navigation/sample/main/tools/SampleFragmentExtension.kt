package com.tamimattafi.navigation.sample.main.tools

import android.view.View
import android.widget.RadioGroup
import com.google.android.material.button.MaterialButton
import com.tamimattafi.navigation.core.NavigationContract.Navigator
import com.tamimattafi.navigation.core.animation.AnimationSet
import com.tamimattafi.navigation.core.animation.AnimationSet.Companion.SLIDE_LEFT
import com.tamimattafi.navigation.core.animation.AnimationSet.Companion.SLIDE_RIGHT
import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment
import com.tamimattafi.navigation.sample.R
import kotlinx.android.synthetic.main.layout_navigation_fragment.view.*
import kotlinx.android.synthetic.main.toolbar_navigation_fragment.view.*

interface SampleFragmentExtension<B: BaseNavigationFragment, F: B, N: Navigator<B>> {

    fun getSampleFragment(): F

    fun getSampleNavigator(): N

    val launcher: SampleFragmentLauncher<F>

    private val fragmentNumber: Int
    get() = getSampleFragment().arguments?.getInt(SampleFragmentCreator.FRAGMENT_NUMBER) ?: SampleFragmentLauncher.START_POSITION

    private val addToBackStack
    get() = getSampleFragment().view?.backStack?.isChecked ?: true

    fun setUpViews() {
        getSampleFragment().view?.apply {
            navigateTo.navigateOnClick(getSampleNavigator()::navigateTo)
            switchTo.navigateOnClick(getSampleNavigator()::switchTo)
            restartFrom.restartOnClick(getSampleNavigator()::restartNavigationFrom)
            animationsGroup.setUp()
            back.doOnClick(getSampleNavigator()::performBackPress)
            close.doOnClick(getSampleFragment().activity!!::finish)
            title.text = getSampleFragment().fragmentName
            number.text = fragmentNumber.toString()
        }
    }

    private fun MaterialButton.navigateOnClick(action: (fragment: F, addToBackStack: Boolean) -> Unit) {
        setOnClickListener {
            launcher.handleAttach(fragmentNumber) { newFragment ->
                action.invoke(newFragment, addToBackStack)
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

    private fun RadioGroup.setUp() {

        when (AnimationSet.DEFAULT) {
            SLIDE_LEFT -> slideLeft
            SLIDE_RIGHT -> slideRight
            else -> noAnimation
        }.isChecked = true


        setOnCheckedChangeListener { _, checkedId ->
            AnimationSet.DEFAULT = when (checkedId) {
                R.id.slideLeft -> SLIDE_LEFT
                R.id.slideRight -> SLIDE_RIGHT
                else -> null
            }
        }

    }

}


