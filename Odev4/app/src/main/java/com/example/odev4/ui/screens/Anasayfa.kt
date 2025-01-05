package com.example.odev4.ui.screens

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
import androidx.core.provider.FontsContractCompat.Columns
import androidx.navigation.NavController

@Composable
fun Anasayfa(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
        .background(Color(0xFF3F51B5)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Anasayfa", fontSize = 50.sp, color = Color(0xFFD1CAE5))

        Button(onClick = {
            navController.navigate("sayfaA")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC4D7E7), // Buton arka plan rengi
                contentColor = Color.Black   // Buton içindeki yazı rengi
            )
        ) {
            Text(text = "Git > A", fontSize = 30.sp)
        }

        Button(onClick = {
            navController.navigate("sayfaX")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC4D7E7), // Buton arka plan rengi
                contentColor = Color.Black   // Buton içindeki yazı rengi
            )
        ) {
            Text(text = "Git > X", fontSize = 30.sp)
        }
    }
}