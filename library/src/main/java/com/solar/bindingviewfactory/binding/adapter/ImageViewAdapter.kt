package com.solar.bindingviewfactory.binding.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

/**
 *  Created by Kenneth on 2020/11/20
 */
@BindingAdapter("clip")
fun setClipToOutLine(iv: ImageView, isClip: Boolean?) {
    isClip?.let {
        iv.clipToOutline = isClip
    }
}