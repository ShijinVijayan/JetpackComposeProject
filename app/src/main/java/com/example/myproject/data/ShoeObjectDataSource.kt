package com.example.myproject.data

import androidx.compose.ui.graphics.Color
import com.example.myproject.R



/*
default_shoe_case_02.webp

https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/sv01/fnd/PNA/fmt/png/Roma-Basic-Sneakers
https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/sv04/fnd/PNA/fmt/png/Roma-Basic-Sneakers
https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/sv03/fnd/PNA/fmt/png/Roma-Basic-Sneakers
https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/sv02/fnd/PNA/fmt/png/Roma-Basic-Sneakers
https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/bv/fnd/PNA/fmt/png/Roma-Basic-Sneakers
https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/353572/04/fnd/PNA/fmt/png/Roma-Basic-Sneakers
 */

val roma_basic_sneakers = arrayListOf(
    ShoeType(
        color = Color.White,
        thumbnailImagePainter = R.drawable.default_shoe,
        showcaseImagePainterList = arrayListOf(
            R.drawable.default_shoe_case_01,
            R.drawable.default_shoe_case_02,
            R.drawable.default_shoe_case_03,
            R.drawable.default_shoe_case_04,
            R.drawable.default_shoe_case_05,
            R.drawable.default_shoe_case_06,
        ),
        price = 70.00,
        totalInStock = 5,
        sizeList = arrayListOf(6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0, 15.0),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/353572/04/sv01/fnd/PNA/fmt/png/Roma-Basic-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/353572/04/sv01/fnd/PNA/fmt/png/Roma-Basic-Sneakers",
        )
    )
)
val rider_future = arrayListOf(
    ShoeType(
        color = Color.Black,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/02/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/02/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/02/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/02/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/02/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/02/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers"
        ),
        price = 59.99,
        sizeList = arrayListOf(9.5, 10.0, 10.5, 11.0, 11.5, 12.0)
    ),
    ShoeType(
        color = Color(color = 0xff4361ee),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/07/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/07/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/dt01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/dt02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/mod03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/mod01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/07/mod02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        ),
        price = 69.99,
        sizeList = arrayListOf(9.5, 10.0, 10.5, 11.0, 11.5, 12.0)
    ),
    ShoeType(
        color = Color(color = 0xfff77f00),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/13/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/13/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/13/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/13/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/13/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/13/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/13/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        ),
        price = 90.00,
        sizeList = arrayListOf(7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
        totalInStock = 1
    ),
    ShoeType(
        color = Color.Red,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/14/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/14/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/14/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/14/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/14/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/14/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/14/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        ),
        price = 90.00,
        sizeList = arrayListOf(7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
    ),
    ShoeType(
        color = Color(color = 0xffcce680),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/19/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/19/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/mod03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/mod01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/19/mod02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        ),
        price = 90.00,
        sizeList = arrayListOf(4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0)
    ),
    ShoeType(
        color = Color(color = 0xfffe9128),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387672/20/sv01/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/20/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/20/bv/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/20/sv02/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/20/sv03/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387672/20/sv04/fnd/PNA/fmt/png/Rider-Future-Vintage-Sneakers",
        ),
        price = 90.00,
        sizeList = arrayListOf(4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0)
    ),
)
val deviate_nitro = arrayListOf(
    ShoeType(
        color = Color(color = 0xffa7e846),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/06/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/06/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/bv/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/sv02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/sv03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/sv04/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/mod03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/mod01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/06/mod02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        ),
        price = 160.0,
        sizeList = arrayListOf(5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
    ),
    ShoeType(
        color = Color(0xffe86252),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/04/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/04/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/bv/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/sv02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/sv03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/dt01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/dt02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/mod03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/mod01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/mod02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/dt04/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/04/dt05/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        ),
        price = 160.0,
        sizeList = arrayListOf(5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0),
    ),
    ShoeType(
        color = Color(0xffdbb42c),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/02/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376855/02/sv01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/bv/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/sv02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/sv03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/sv04/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/dt01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/dt02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/mod03/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/mod01/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/mod02/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376855/02/dt04/fnd/PNA/fmt/png/Deviate-NITRO-2-Women's-Running-Shoes",
        ),
        price = 160.0,
        sizeList = arrayListOf(5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0),
    ),
)
val scuderia_ferrari = arrayListOf(
    ShoeType(
        color = Color.Yellow,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307322/01/sv01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307322/01/sv01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/bv/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/sv02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/sv03/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/mod03/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/mod01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/mod02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/dt01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/dt02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/01/dt03/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
        ),
        price = 130.0,
        sizeList = arrayListOf(7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0),
    ),
    ShoeType(
        color = Color.Red,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307322/02/sv01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307322/02/sv01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/bv/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/sv02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/sv03/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/sv04/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/mod03/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/mod01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/mod02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/dt01/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307322/02/dt02/fnd/PNA/fmt/png/Scuderia-Ferrari-TRC-Blaze-Motorsport-Shoes",
        ),
        price = 130.0,
        sizeList = arrayListOf(7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0),
    ),
)
val bmw_m_motorsport = arrayListOf(
    ShoeType(
        color = Color.Red,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307409/01/sv01/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307409/01/sv01/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307409/01/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307409/01/bv/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307409/01/sv02/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307409/01/sv03/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307409/01/sv04/fnd/PNA/fmt/png/BMW-M-Motorsport-RS-Fast-Sneakers",
        ),
        price = 120.0,
        sizeList = arrayListOf( 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0),
    )
)

val rs_x_t3ch_rize = arrayListOf(
    ShoeType(
        color = Color(0xff560bad),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387301/02/sv01/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/387301/02/sv01/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387301/02/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387301/02/bv/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387301/02/sv02/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387301/02/sv03/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/387301/02/sv04/fnd/PNA/fmt/png/RS-X-T3CH-RIZE-Sneakers",
        ),
        price = 110.0,
        sizeList = arrayListOf(8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
    ),
)

val rs_x_t3ch_rize_new_heritage = arrayListOf(
    ShoeType(
        color = Color(0xfffb8500),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/389134/01/sv01/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/389134/01/sv01/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/389134/01/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/389134/01/bv/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/389134/01/sv02/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/389134/01/sv03/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/389134/01/sv04/fnd/PNA/fmt/png/RS-X-T3CH-New-Heritage-Sneakers",
        ),
        price = 120.0,
        sizeList = arrayListOf(7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0),
    ),
)

val rs_x_t3ch_spec = arrayListOf(
    ShoeType(
        color = Color.Red,
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/374914/01/sv01/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/374914/01/sv01/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/374914/01/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/374914/01/bv/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/374914/01/sv02/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/374914/01/sv03/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/374914/01/sv04/fnd/PNA/fmt/png/RS-X-T3CH-SPEC-Sneakers",
        ),
        price = 110.0,
        sizeList = arrayListOf(8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
    ),
)

val porsche_legacy_trc  = arrayListOf(
    ShoeType(
        color = Color(0xffff9500),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307386/01/sv01/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/307386/01/sv01/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/mod03/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/mod01/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/mod02/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/bv/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/sv02/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/sv03/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/sv04/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/dt01/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/dt02/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/307386/01/dt03/fnd/PNA/fmt/png/Porsche-Legacy-TRC-Blaze-Motorsport-Shoes",
        ),
        price = 130.0,
        sizeList = arrayListOf(8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0),
    ),
)

val first_mile_deviate_nitro = arrayListOf(
    ShoeType(
        color = Color(0xffcfcfcf),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376259/01/sv01/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/376259/01/sv01/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/bv/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/sv02/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/sv03/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/sv04/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/dt01/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/376259/01/dt02/fnd/PNA/fmt/png/PUMA-x-FIRST-MILE-Deviate-Nitro-Women's-Running-Shoes",
        ),
        price = 160.0,
        sizeList = arrayListOf(5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0),
    ),
)

val deviate_nitro_elite_fireglow = arrayListOf(
    ShoeType(
        color = Color(0xffd62828),
        thumbnailImage = "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/377603/01/sv01/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
        showcaseImageList = arrayListOf(
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_750,h_750/global/377603/01/sv01/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/bv/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/sv02/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/sv03/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/sv04/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/dt01/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
            "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_600,h_600/global/377603/01/dt02/fnd/PNA/fmt/png/Deviate-NITRO-Elite-Fireglow-Women's-Running-Shoes",
        ),
        price = 200.0,
        sizeList = arrayListOf(5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 11.0),
    ),
)

//val deviate_nitro = arrayListOf(
//    ShoeType(
//        color = Color.Black,
//        thumbnailImage = "",
//        showcaseImageList = arrayListOf(
//            "",
//            "",
//            "",
//        ),
//        price = 0.0,
//        sizeList = arrayListOf(4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 13.0, 14.0),
//    ),
//)