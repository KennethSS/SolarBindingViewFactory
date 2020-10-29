package com.solar.bindingviewfactory.recyclerview.holder

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.solar.bindingviewfactory.BR

class BindingHolder<T>(
    val binding: ViewDataBinding
) : RecyclerView.ViewHolder(binding.root){

    fun bind(item: T, position: Int, viewModel: ViewModel?) {
        binding.setVariable(BR.item, item)
        binding.setVariable(BR.position, position)
        binding.setVariable(BR.vm, viewModel)
        binding.executePendingBindings()
    }
}