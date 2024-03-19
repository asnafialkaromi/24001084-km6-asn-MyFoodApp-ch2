package com.example.myfoodapp.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu(
    @DrawableRes var image: Int,
    var name: String,
    var rating: Double,
    var price: Double,
    var description: String,
    var location: String,
    var mapLink: String
) : Parcelable
