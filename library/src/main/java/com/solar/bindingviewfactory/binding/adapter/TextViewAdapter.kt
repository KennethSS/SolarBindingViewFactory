package com.solar.bindingviewfactory.binding.adapter

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Build
import android.text.Html
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import java.lang.StringBuilder
import java.text.NumberFormat
import java.util.*

/**
 *  Created by Kenneth on 2020/11/20
 */
@BindingAdapter("spanBold", "start", "end", requireAll = true)
fun setSpanBold(tv: TextView, str: String?, start: Int?, end: Int?) {
    if (str != null && start != null && end != null) {
        tv.text = SpannableStringBuilder().apply {
            append(str)
            setSpan(StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
}

@BindingAdapter("colorStr")
fun setTextColorByString(textView: AppCompatTextView, color: String?) {
    color?.let {
        textView.setTextColor(Color.parseColor(color))
    }
}

@BindingAdapter("html")
fun setHtmlText(iv: TextView, str: String?) {
    str?.let {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            iv.text = Html.fromHtml(str, HtmlCompat.FROM_HTML_MODE_COMPACT)
        } else {
            iv.text = Html.fromHtml(str)
        }
    }
}

@BindingAdapter("priceUs", "suffix")
fun setNumberUsFormat(tv: TextView, price: Int?, suffix: String?) {
    price?.let {
        val formatNumber = NumberFormat.getNumberInstance(Locale.US).format(price)
        if (suffix != null) {
            tv.text = StringBuilder().run {
                append(formatNumber)
                append(suffix)
            }.toString()
        } else {
            tv.text = formatNumber
        }
    }
}