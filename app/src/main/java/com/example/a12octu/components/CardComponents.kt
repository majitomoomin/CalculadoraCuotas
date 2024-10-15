package com.example.a12octu.components

import androidx.copose.runtime.Composable

@Composable
fun InfoCard(title: String, info: Double, modifier: Modifier){
    Card{
        Column(

        ){
            Text(text = title, color = Color.Black, fontSize= 20.sp)
        }
    }
}