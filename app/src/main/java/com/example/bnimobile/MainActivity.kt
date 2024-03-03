package com.example.bnimobile

import android.os.Bundle
import android.widget.GridLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bnimobile.data.Data
import com.example.bnimobile.model.Menu
import com.example.bnimobile.ui.Montserrat
import com.example.bnimobile.ui.components.MenuItem
import com.example.bnimobile.ui.model.HomeCardData
import com.example.bnimobile.ui.theme.BniMobileTheme



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BniMobileTheme {
                // A surface container using the 'background' color from the theme
                Box(modifier = Modifier.fillMaxSize()) {
                    HomePage()
                }
            }
        }
    }
}


@Composable
fun HomePage() {
    val data = HomeCardData(
        balance = 5000000,
        accountNumber = "1211968231",
        cardType = "KARTU TANDA MHS (KTM)"
    )
    Column(Modifier.fillMaxWidth()) {
        HomeHeader()
        Spacer(modifier = Modifier.height(15.dp))
        GreetingSection()
        Spacer(modifier = Modifier.height(15.dp))
        HomeCard(data = data)
        Spacer(modifier = Modifier.height(15.dp))
        HomeMenus()
    }
}


@Composable
fun HomeHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.bni_logo),
            contentDescription = "BNI logo",
            modifier = Modifier.height(30.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.notifications),
                contentDescription = "notification",
                modifier = Modifier
                    .padding(horizontal = 2.dp)
                    .height(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.logout),
                contentDescription = "Logout",
                modifier = Modifier.height(30.dp)
            )
        }
    }
}

@Composable
fun GreetingSection(text1: String = "Selamat Datang", text2: String = "PUTU AGUNG BAYU GEDE") {
    Row {
        ProfileIcon()
        Column {
            Text(text = text1, fontSize = 14.sp, fontFamily = Montserrat.fontFamily)
            Text(text = text2, fontWeight = FontWeight.Medium, fontFamily = Montserrat.fontFamily)
        }
    }

}

@Composable
fun ProfileIcon() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(horizontal = 15.dp), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ellipse),
            contentDescription = null,
            modifier = Modifier.size(55.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.person),
            contentDescription = null,
            modifier = Modifier.height(22.dp)
        )

    }

}

@Composable
fun HomeCard(data: HomeCardData) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(125.dp)
            .padding(horizontal = 16.dp), shape = RoundedCornerShape(15.dp)
    ) {
        Box() {
            Image(
                painter = painterResource(id = R.drawable.home_card_bg),
                contentDescription = null,
                modifier = Modifier.fillMaxHeight(),
                contentScale = ContentScale.Crop,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(15.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 10.dp)
                    ) {
                        Text(
                            text = "Rp${data.balance}",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                        Image(
                            painter = painterResource(id = R.drawable.visibility_off),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = 6.dp)
                                .width(30.dp)
                        )
                    }
                    Row {
                        Text(
                            text = data.accountNumber,
                            fontSize = 18.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                        Image(
                            painter = painterResource(id = R.drawable.content_copy),
                            contentDescription = null,
                            modifier = Modifier.width(30.dp)
                        )
                    }
                    Text(text = data.cardType, color = Color.White, fontSize = 14.sp)
                }
                Image(
                    painter = painterResource(id = R.drawable.expand_more),
                    contentDescription = "expand more",
                    modifier = Modifier
                        .padding(end = 30.dp)
                        .width(20.dp)
                )
            }
        }
    }
}

@Composable
fun HomeMenus(modifier: Modifier = Modifier) {
    val menus = Data.menu
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            content = {
                items(menus) { menu ->
                    MenuItem(
                        background = menu.background,
                        icon = menu.icon,
                        title = menu.title
                    )
                }

            },
            horizontalArrangement = Arrangement.SpaceEvenly,
            contentPadding = PaddingValues(6.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        )
    }


}