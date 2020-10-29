package com.solar.bindingviewfactory.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewpager.widget.PagerAdapter
import com.solar.bindingviewfactory.BindingItem

abstract class ViewPagerBindingAdapter<T: BindingItem>(
    private val list: List<T>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater    = container.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val bind = DataBindingUtil.inflate<ViewDataBinding>(
            inflater,
            list[position].layoutRes,
            container,
            false
        )
        bind.setVariable(BR.item, list[position])
        container.addView(bind.root)

        return bind.root
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`
    override fun getCount(): Int = list.size
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}