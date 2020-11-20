package com.solar.bindingviewfactory.binding.adapter

import android.app.Activity
import android.view.View
import androidx.databinding.BindingAdapter

/**
 *  Created by Kenneth on 2020/11/20
 */
@BindingAdapter("onBackPressed")
fun setOnBackPressed(view: View, finish: Boolean) {
    val context = view.context
    if (finish && context is Activity) {
        view.setOnClickListener {
            context.onBackPressed()
        }
    }
}

@BindingAdapter("goneUnless")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}