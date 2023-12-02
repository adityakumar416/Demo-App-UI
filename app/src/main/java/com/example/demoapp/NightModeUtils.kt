package com.example.demoapp

import com.google.android.material.imageview.ShapeableImageView


object NightModeUtils {
    fun updateIconBasedOnMode(imageView: ShapeableImageView) {
        val isNightMode = when (imageView.context.resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) { android.content.res.Configuration.UI_MODE_NIGHT_YES -> true  //lambda function
            else -> false
        }

        if (isNightMode) {
            // Set night mode icon
            imageView.setImageResource(R.drawable.apple_white_icon)
        } else {
            // Set day mode icon
            imageView.setImageResource(R.drawable.apple_icon)
        }
    }
}
