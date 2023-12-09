package com.example.home

import com.example.home_internal.HomeInternalButtonClicked
import com.example.home_internal2.HomeInternal2Fragment
import com.kpstv.home.di.HomeQualifier
import javax.inject.Inject
class HomeInternalButtonClickedImpl @Inject constructor(
  // @HomeQualifier will correctly route this to our provider defined in `HomeDependencyModule` to provide
  // the required instance of HomeFragment from Activity's backstack.
  @HomeQualifier private val fragment: HomeFragment,
) : HomeInternalButtonClicked {
  override fun goToNext() {
    fragment.childFragmentManager.beginTransaction()
      .addToBackStack("home-internal2")
      .replace(R.id.frag_container, HomeInternal2Fragment::class.java, null)
      .commit()
  }
}