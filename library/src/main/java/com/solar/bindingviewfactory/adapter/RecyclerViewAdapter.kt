package com.solar.bindingviewfactory.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.solar.bindingviewfactory.BindingItem
import com.solar.bindingviewfactory.recyclerview.adapter.DataBindingAdapter

@BindingAdapter("addList")
fun <T: BindingItem>setRecyclerViewAdapter(rv: RecyclerView, list: List<T>) {
    val adapter = rv.adapter?.let {
        DataBindingAdapter<T>()
    } as DataBindingAdapter<T>

    adapter.addAll(list)
}
