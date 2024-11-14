package com.example.tgs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MyMusic : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "halamanmenu"
    ) {
        composable("halamanmenu") { MyMusikk(navController) }
        composable("library") { Library(navController = navController)}
        composable("about") { AboutMe(navController = navController) }
        composable("album") { DetailLagu(navController = navController) }
        composable("album2") { DetailLagu2(navController = navController) }
    }
}
@Composable
fun MyMusikk(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(76.dp)
                    .background(
                        Color.White,
                        RoundedCornerShape(bottomEnd = 8.dp, bottomStart = 8.dp)
                    ),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "My Music",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 25.dp, top = 10.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Recent",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            LazyRow (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ){
                item {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.album2),
                            contentDescription = "gambar album",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = ".Feast",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Arteri",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumblink),
                            contentDescription = "gambar album",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "blink-182",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "I Miss You",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumgrenday),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Green Day",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                        Text(
                            text = "Basket Case",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumcincin),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Hindia",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Cincin",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumoasis),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Oasis",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Wonderwall",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumam),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Arctic Monkey",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                        Text(
                            text = "R U Mine?",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumadele),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Adele",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "All I Ask",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumcoldplay),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Coldplay",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Yellow",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.album1d),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "One Direction",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                        Text(
                            text = "You & I",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                    }
                }
                item {
                    Column (
                        modifier = Modifier.padding(start = 10.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.albumbernadya),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Bernadya",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                        Text(
                            text = "Satu Bulan",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 25.dp,),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Recommended Album",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            LazyColumn (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 20.dp, start = 20.dp, bottom =80.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp)
                            .clickable {
                                 navController.navigate("album")
                            },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.album1),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Menari dengan Bayangan",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2019 - Hindia Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.album2),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Membangun &\n" +
                                        "Menghancurkan",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2024 - .Feast Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lombasihir),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Selamat Datang di\n" +
                                        "Ujung Dunia",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2021 - Lomba Sihir Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.albumam),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "AM",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2013 - Arctic Monkey Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.theadams),
                            contentDescription = "Gambar Album",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Agterplaas",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2019 - The Adams Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bruno),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "24K Magic",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2016 - Bruno Mars Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.juicyluicy),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Sentimental",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2020 - Juicy Luicy Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.billieeilish),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Hit Me Hard and Soft",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2024 - Billie Eilish Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.thevamps),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Meet The Vamps",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2014 - The Vamps Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(390.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lanadelrey),
                            contentDescription = "Icon Fav",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ){
                            Text(
                                text = "Lust For Life",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2016 - Lana Del Rey Album",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp),
                    clip = false
                )
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(8.dp)
                )
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp, end = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "Icon Home",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                navController.navigate("halamanmenu")
                            }
                    )
                    Text(
                        text = "Home",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(id = R.drawable.folder),
                        contentDescription = "Icon Playlist",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                 navController.navigate("library")
                            }
                    )
                    Text(
                        text = "Library",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Icon Home",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                navController.navigate("about")
                            }
                    )
                    Text(
                        text = "About",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MyMusikkPreview() {
    val navController = rememberNavController()
    MyMusikk(navController)
}