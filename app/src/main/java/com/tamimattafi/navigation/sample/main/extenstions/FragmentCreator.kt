package com.tamimattafi.navigation.sample.main.extenstions

import android.os.Bundle
import com.tamimattafi.navigation.core.fragments.BaseNavigationFragment

class FragmentCreator<F: BaseNavigationFragment>(private val clazz: Class<F>) {

    fun newInstance(fragmentNumber: Int): F
        = clazz.newInstance().apply {
            arguments = createArguments(fragmentNumber)
        }

    private fun createArguments(fragmentNumber: Int): Bundle
        = Bundle().apply {
            putInt(FRAGMENT_NUMBER, fragmentNumber)
        }

    companion object {
        const val FRAGMENT_NUMBER = "fragment-number"
    }

}