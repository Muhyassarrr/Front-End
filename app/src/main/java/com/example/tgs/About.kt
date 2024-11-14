package com.example.tgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutMe(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize(
            )
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
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .padding(end = 16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            modifier = Modifier.size(30.dp),
                            contentDescription = "Back",
                            tint = Color.Black
                        )
                    }
                    Text(
                        text = "About",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                    )
                }
            }
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(2f / 1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sampul),
                    contentDescription = "Gambar Sampul",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .offset(y = (-85.dp))
        ){
            Image(
                painter = painterResource(id = R.drawable.pp),
                contentDescription = "Gambar Profil",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.White, CircleShape)
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)

            ) {
                Text(
                    text = "Muh Yassar Nurfajri D",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Black
                )
                Text(
                    text = "I'm an Informatics Student at the National Development University \"Veteran\" East Java, I am actively engaged in the IT field, particularly in areas such as Web Programming, Database Management, System Analysis, and Project Management.",
                    textAlign = TextAlign.Justify,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
                Text(
                    text = "Contact Person",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
                Text(
                    text = "Email : muhyassarnurfajrid@gmail.com",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
                Text(
                    text = "Telephone : 081243091182",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
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
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
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

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
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
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
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
fun AboutMePreview(){
    val navController = rememberNavController()
    AboutMe(navController)
}
