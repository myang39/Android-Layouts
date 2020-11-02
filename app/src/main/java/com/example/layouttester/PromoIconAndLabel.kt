package com.example.layouttester

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

import kotlinx.android.synthetic.main.promo_icon_and_label.view.*

class PromoIconAndLabel : ConstraintLayout {
    init {
        View.inflate(context, R.layout.promo_icon_and_label, this)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeViews(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initializeViews(attrs)
    }

    private fun initializeViews(attrs: AttributeSet) {
        val typedArray: TypedArray = context
            .obtainStyledAttributes(attrs, R.styleable.PromoIconAndLabel)
        val imageId = typedArray.getResourceId(R.styleable.PromoIconAndLabel_image, -1)
        promo_icon.setImageResource(imageId)

        val labelText = typedArray.getString(R.styleable.PromoIconAndLabel_label)
        promo_label.text = labelText

        typedArray.recycle()
    }
}