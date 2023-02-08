package com.example.myproject.data

import androidx.compose.ui.graphics.Color

data class ShoeType(
    var color : Color,
    var thumbnailImage : String,
    var showcaseImageList : ArrayList<String>,
    var showcaseImagePainterList : ArrayList<Int>? = null,
    var price : Double,
    var sizeList : ArrayList<Double>,
    var totalInStock : Int = -1,
    var thumbnailImagePainter: Int? = null
)
