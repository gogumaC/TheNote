package com.gogumac.thenote.customView

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.appcompat.widget.AppCompatImageView
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class NoteCoverView(context: Context, attrs:AttributeSet) : AppCompatImageView(context, attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        //크기 및 위치 지정
       // val lp= LayoutParams(100,100)
        //setLayoutParams(50,50)
        setMeasuredDimension(500,500)

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //색은 여기서 칠하낭..


    }


}