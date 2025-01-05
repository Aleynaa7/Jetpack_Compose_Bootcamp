package com.example.goodreads.ui.screens

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.util.copy
import com.example.goodreads.R
import com.example.goodreads.data.entity.Kitaplar1
import com.example.goodreads.data.entity.Kitaplar2
import com.example.goodreads.data.entity.Kitaplar3
import com.example.goodreads.data.entity.Kitaplar4
import com.example.goodreads.data.entity.Kitaplar5

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(){
    val snackbarHostState = remember { SnackbarHostState() }
    val latoLight = FontFamily(
        Font(R.font.lato_light)
    )
    val latoRegular = FontFamily(
        Font(R.font.lato_regular)
    )

    val kitaplarListesi = remember {
        mutableStateListOf<Kitaplar1>()
    }
    LaunchedEffect(key1 = true){
        val k1 = Kitaplar1(1, "hungergames")
        val k2 = Kitaplar1(2, "lordoftheflies")
        val k3 = Kitaplar1(3, "thegoldencompass")
        val k4 = Kitaplar1(4, "percyjackson")
        val k5 = Kitaplar1(5, "narnia")
        val k6 = Kitaplar1(6, "harrypotter")
        kitaplarListesi.add(k1)
        kitaplarListesi.add(k2)
        kitaplarListesi.add(k3)
        kitaplarListesi.add(k4)
        kitaplarListesi.add(k5)
        kitaplarListesi.add(k6)
    }

    val kitaplarListesi2 = remember {
        mutableStateListOf<Kitaplar2>()
    }
    LaunchedEffect(key1 = true){
        val ki1 = Kitaplar2(1, "theweddingpeople")
        val ki2 = Kitaplar2(2, "thegodofthewoods")
        val ki3 = Kitaplar2(3, "quicksilver")
        val ki4 = Kitaplar2(4, "thewomen")
        val ki5 = Kitaplar2(4, "funnystory")
        val ki6 = Kitaplar2(4, "theanxious")
        kitaplarListesi2.add(ki1)
        kitaplarListesi2.add(ki2)
        kitaplarListesi2.add(ki3)
        kitaplarListesi2.add(ki4)
        kitaplarListesi2.add(ki5)
        kitaplarListesi2.add(ki6)
    }

    val kitaplarListesi3 = remember {
        mutableStateListOf<Kitaplar3>()
    }
    LaunchedEffect(key1 = true){
        val kit1 = Kitaplar3(1, "intermezzo")
        val kit2 = Kitaplar3(2, "hyunamdong")
        val kit3 = Kitaplar3(3, "burneddreams")
        val kit4 = Kitaplar3(4, "midnightlibrary")
        val kit5 = Kitaplar3(4, "iwantto")
        val kit6 = Kitaplar3(4, "babel")
        kitaplarListesi3.add(kit1)
        kitaplarListesi3.add(kit2)
        kitaplarListesi3.add(kit3)
        kitaplarListesi3.add(kit4)
        kitaplarListesi3.add(kit5)
        kitaplarListesi3.add(kit6)
    }

    val kitaplarListesi4 = remember {
        mutableStateListOf<Kitaplar4>()
    }
    LaunchedEffect(key1 = true){
        val kit1 = Kitaplar4(1, "heavenly")
        val kit2 = Kitaplar4(2, "windandtruth")
        val kit3 = Kitaplar4(3, "whatthewife")
        val kit4 = Kitaplar4(4, "notinmybook")
        val kit5 = Kitaplar4(4, "amonsoon")
        val kit6 = Kitaplar4(4, "underloch")
        kitaplarListesi4.add(kit1)
        kitaplarListesi4.add(kit2)
        kitaplarListesi4.add(kit3)
        kitaplarListesi4.add(kit4)
        kitaplarListesi4.add(kit5)
        kitaplarListesi4.add(kit6)
    }


    val kitaplarListesi5 = remember {
        mutableStateListOf<Kitaplar5>()
    }
    LaunchedEffect(key1 = true){
        val kit1 = Kitaplar5(1, "funnystory")
        val kit2 = Kitaplar5(2, "thewomen")
        val kit3 = Kitaplar5(3, "justforthesummer")
        val kit4 = Kitaplar5(4, "firstlie")
        val kit5 = Kitaplar5(4, "theteacher")
        val kit6 = Kitaplar5(4, "houseof")
        kitaplarListesi5.add(kit1)
        kitaplarListesi5.add(kit2)
        kitaplarListesi5.add(kit3)
        kitaplarListesi5.add(kit4)
        kitaplarListesi5.add(kit5)
        kitaplarListesi5.add(kit6)
    }


    Scaffold (
        topBar = {

            TopAppBar(
                title = {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(20.dp)
                            )
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.Center), // Ortalamak için

                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = { }) {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "Search Icon",
                                    tint = Color.Black,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                            Text(
                                text = "Title, author or ISBN",
                                modifier = Modifier.padding(start = 3.dp),
                                color = Color(0xff888888),
                                fontSize = 17.sp,
                                fontFamily = latoRegular,
                            )
                            Spacer(modifier = Modifier.weight(10f))
                            IconButton(onClick = { }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.camera_icon),
                                    contentDescription = "",
                                    tint = Color.Black,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFe5e2d2)
                ),
                actions = {  }
            )
        },

        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },

        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
                contentColor = Color(0xff888888),
                modifier = Modifier
                    .height(100.dp)
                    .border(0.1.dp, Color.Black, RoundedCornerShape(0.dp))
            )  {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "",
                                tint = Color(0xff888888)
                            )
                        }
                        Text(
                            text = "Home",
                            color = Color(0xff888888),
                            fontSize = 15.sp,
                            fontFamily = latoRegular,
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.books),
                                contentDescription = "",
                                tint = Color(0xff888888)
                            )
                        }
                        Text(
                            text = "My Books",
                            color = Color(0xff888888),
                            fontSize = 15.sp,
                            fontFamily = latoRegular,
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.discover),
                                contentDescription = "",
                                tint = Color.Black
                            )
                        }
                        Text(
                            text = "Discover",
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontFamily = latoRegular,
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "",
                                tint = Color(0xff888888)
                            )
                        }
                        Text(
                            text = "Search",
                            color = Color(0xff888888),
                            fontSize = 15.sp,
                            fontFamily = latoRegular,
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.line),
                                contentDescription = "",
                                tint = Color(0xff888888)
                            )
                        }
                        Text(
                            text = "More",
                            color = Color(0xff888888),
                            fontSize = 15.sp,
                            fontFamily = latoRegular,
                        )
                    }
                }
            }
        }



    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
        ){

            Row (
                modifier = Modifier.fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.goodreadsaward2024),
                    contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .size(220.dp)
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ){
                Text(
                    text = buildAnnotatedString {
                        append("Because you shelved The Hobbit, or ")
                        append("\n")  // Burada alt satıra geçiyor
                        append("There and Back Again")
                    },
                    fontSize = 20.sp,
                    fontFamily = latoRegular
                )

                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }

            }
            LazyRow(modifier = Modifier.fillMaxWidth().padding(1.dp)) {
                items(kitaplarListesi) { kitap ->
                    val context = LocalContext.current
                    val imageResource = context.resources.getIdentifier(
                        kitap.resim,
                        "drawable",
                        context.packageName
                    )
                    if (imageResource != 0) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = imageResource),
                            contentDescription = kitap.resim,
                            modifier = Modifier.size(120.dp).padding(1.dp)
                        )
                    }
                }
            }




            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
            ) {
                Text(text = "Trending with Goodreads members", fontSize = 20.sp, fontFamily = latoRegular,)
                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            LazyRow(modifier = Modifier.fillMaxWidth().padding(1.dp)) {
                items(kitaplarListesi2) { kitap ->
                    val context = LocalContext.current
                    val imageResource = context.resources.getIdentifier(
                        kitap.resim,
                        "drawable",
                        context.packageName
                    )
                    if (imageResource != 0) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = imageResource),
                            contentDescription = kitap.resim,
                            modifier = Modifier.size(120.dp).padding(1.dp)
                        )
                    }
                }
            }



            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
            ) {
                Text(text = "Most read this week", fontSize = 20.sp, fontFamily = latoRegular,)
                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            LazyRow(modifier = Modifier.fillMaxWidth().padding(1.dp)) {
                items(kitaplarListesi3) { kitap ->
                    val context = LocalContext.current
                    val imageResource = context.resources.getIdentifier(
                        kitap.resim,
                        "drawable",
                        context.packageName
                    )
                    if (imageResource != 0) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = imageResource),
                            contentDescription = kitap.resim,
                            modifier = Modifier.size(120.dp).padding(1.dp)
                        )
                    }
                }
            }



            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
            ) {
                Text(text = "New releases this month", fontSize = 20.sp, fontFamily = latoRegular,)
                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            LazyRow(modifier = Modifier.fillMaxWidth().padding(1.dp)) {
                items(kitaplarListesi4) { kitap ->
                    val context = LocalContext.current
                    val imageResource = context.resources.getIdentifier(
                        kitap.resim,
                        "drawable",
                        context.packageName
                    )
                    if (imageResource != 0) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = imageResource),
                            contentDescription = kitap.resim,
                            modifier = Modifier.size(120.dp).padding(1.dp)
                        )
                    }
                }
            }




            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
            ) {
                Text(text = "New releases this year", fontSize = 20.sp, fontFamily = latoRegular,)
                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            LazyRow(modifier = Modifier.fillMaxWidth().padding(1.dp)) {
                items(kitaplarListesi5) { kitap ->
                    val context = LocalContext.current
                    val imageResource = context.resources.getIdentifier(
                        kitap.resim,
                        "drawable",
                        context.packageName
                    )
                    if (imageResource != 0) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = imageResource),
                            contentDescription = kitap.resim,
                            modifier = Modifier.size(120.dp).padding(1.dp)
                        )
                    }
                }
            }

            //
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 0.dp)
            ) {
                Text(text = "Featured Lists", fontSize = 20.sp, fontFamily = latoRegular,)
                Spacer(modifier = Modifier.weight(7f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_right),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }


            LazyRow (modifier = Modifier
                .fillMaxWidth()
            ) {
                items(2){
                    Card(
                        modifier = Modifier
                            .padding(15.dp)
                            .width(250.dp)
                            .height(190.dp)
                            .background(Color.White),
                        shape = RoundedCornerShape(16.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.featured1),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                            )
                            Text(
                                text = buildAnnotatedString {
                                    append("Goodreads Editors' Book Picks for 2024")
                                    append("\n")
                                    withStyle(style = SpanStyle(fontSize = 12.sp)) {
                                        append("118 books")
                                    }
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth(),
                                color = Color.Black,
                                fontFamily = latoRegular,
                                fontSize = 16.sp

                            )


                        }
                    }

                    Card(
                        modifier = Modifier
                            .padding(15.dp)
                            .width(250.dp)
                            .height(190.dp)
                            .background(Color.White),
                        shape = RoundedCornerShape(16.dp),
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.featured2),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                            )
                            Text(
                                text = buildAnnotatedString {
                                    append("Top Books for Kindle")
                                    append("\n")
                                    append("Unlimited")
                                    append("\n")
                                    withStyle(style = SpanStyle(fontSize = 12.sp)) {
                                        append("3.110 books")
                                    }
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth(),
                                color = Color.Black,
                                fontFamily = latoRegular,
                                fontSize = 16.sp

                            )


                        }
                    }
                }

            }






        }
    }
}