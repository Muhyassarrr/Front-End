package com.example.tgs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailLagu(navController: NavController) {
    Box(
        Modifier.fillMaxSize()
    ) {
        Column(
            Modifier.fillMaxWidth()
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
                            text = "Album",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.album1),
                    contentDescription = "Icon Fav",
                    modifier = Modifier
                        .size(200.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 15.dp)
                ) {
                    Text(
                        text = "Menari dengan Bayangan",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Hindia",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                    Text(
                        text = "2019 - Album",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Evakuasi",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Wejangan Mama",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Besok Mungkin Kita Sampai",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Jam Makan Siang",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                            Text(
                                text = "Hindia, Matter Mos",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Dehidrasi",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                                )
                            Text(
                                    text = "Hindia, Petra Sihombing",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Normal,
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.menu2),
                                contentDescription = "Icon Home",
                                modifier = Modifier
                                    .size(20.dp)
                            )
                        }
                    }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Untuk Apa/Untuk Apa?",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                                )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                                )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Voice Note Anggra",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                                )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                                )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                        ) {
                            Text(
                                text = "Secukupnya",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                                )
                            Text(
                                text = "Hindia",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                                )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.menu2),
                            contentDescription = "Icon Home",
                            modifier = Modifier
                                .size(20.dp)
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
}

@Preview(showBackground = true)
@Composable
fun DetailLaguPreview(){
    val navController = rememberNavController()
    DetailLagu(navController)
}