package com.example.odev4.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SayfaX(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF673AB7)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Sayfa X", fontSize = 50.sp, color = Color(0xFFFFFFFF))

        Button(onClick = {
            navController.navigate("sayfaY")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFBFB0D9), // Buton arka plan rengi
                contentColor = Color.Black   // Buton içindeki yazı rengi
            )
        ) {
            Text(text = "Git > Y", fontSize = 30.sp)
        }
    }

    BackHandler (true) {
        //false ise geçiş izni var, true ise geçiş yok
        //buraya istersen bi kod yazabilirsin, logcat ya da kullanıya geri dönüş geri dönmek ister misiniz gibi vs
    }

}