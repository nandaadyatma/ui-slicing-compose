package com.example.bnimobile.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bnimobile.R
import com.example.bnimobile.ui.Montserrat

@Composable
fun MenuItem(@DrawableRes background: Int, @DrawableRes icon: Int, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        MenuIcon(background = background, icon = icon)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title, fontFamily = Montserrat.fontFamily, fontWeight = FontWeight.Normal, fontSize = 12.sp)
    }
}

@Composable
fun MenuIcon(@DrawableRes background: Int = R.drawable.background_menu, @DrawableRes icon:Int = R.drawable.transfer ) {
    Box(modifier = Modifier
        .size(55.dp)
        .clip(RoundedCornerShape(25.dp)),
        contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = background), contentDescription = null, contentScale = ContentScale.Crop)
        Image(painter = painterResource(id = icon), contentDescription = null, modifier = Modifier.size(20.dp))
    }
}