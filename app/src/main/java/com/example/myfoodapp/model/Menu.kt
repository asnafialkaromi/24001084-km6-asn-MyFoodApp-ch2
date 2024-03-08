package com.example.myfoodapp.model

import androidx.annotation.DrawableRes

data class Menu(
    @DrawableRes var image: Int,
    var name: String,
    var rating: Double,
    var price: Double
)
