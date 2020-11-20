package com.solar.bindingviewfactory.binding.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 *  Created by Kenneth on 2020/11/20
 */
@BindingAdapter("adapter")
fun setRecyclerViewAdapter(rv: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    rv.adapter = adapter
}
