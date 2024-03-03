package com.example.bnimobile.model

import androidx.annotation.DrawableRes

data class Menu(
    val title: String,
    @DrawableRes val background: Int?,
    @DrawableRes val icon: Int,
)
