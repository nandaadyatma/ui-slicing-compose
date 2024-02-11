package com.example.bnimobile.ui

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.bnimobile.R

class Montserrat {
    companion object {
        val fontFamily = FontFamily(
            Font(R.font.montserrat_thin, FontWeight.Thin),
            Font(R.font.montserrat_light, FontWeight.Light),
            Font(R.font.montserrat_regular, FontWeight.Normal),
            Font(R.font.montserrat_medium, FontWeight.Medium),
            Font(R.font.montserrat_semibold, FontWeight.SemiBold),
            Font(R.font.montserrat_bold, FontWeight.Bold),
        )
    }
}