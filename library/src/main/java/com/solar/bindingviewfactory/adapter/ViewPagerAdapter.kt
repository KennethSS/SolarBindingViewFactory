package com.solar.bindingviewfactory.adapter

import androidx.databinding.BindingAdapter
import androidx.viewpager.widget.ViewPager
import com.solar.bindingviewfactory.viewpager.PagerType
import com.solar.bindingviewfactory.viewpager.ViewPagerBindingAdapter

@BindingAdapter("pagerAdapter")
fun <T: PagerType>setBindingViewPagerAdapter(vp: ViewPager, list: List<T>?) {
    list?.let {
        vp.adapter = object: ViewPagerBindingAdapter<T>(it) { }
    }
}