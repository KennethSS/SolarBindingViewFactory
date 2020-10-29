package com.solar.bindingviewfactory.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("clip")
fun clipToOutLine(iv: ImageView, isClip: Boolean?) {
    isClip?.let {
        iv.clipToOutline = isClip
    }
}