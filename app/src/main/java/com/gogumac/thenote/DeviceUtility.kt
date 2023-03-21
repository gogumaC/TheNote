package com.gogumac.thenote

import android.util.DisplayMetrics


object DeviceUtility {

    private val metrics= TheNote.ApplicationContext().resources.displayMetrics
    private val density=metrics.density

    fun getScreenWidth():Int{
        val screenWidth: Int = metrics.widthPixels
        return screenWidth
    }
    fun getScreenHeight():Int{
        val screenHeight = metrics.heightPixels
        return screenHeight
    }

    fun Float.pxToDp(px: Float): Float {
        return px / (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    }

    fun Float.dpToPx(dp:Float):Int{
        return Math.round(dp*density)
    }

}