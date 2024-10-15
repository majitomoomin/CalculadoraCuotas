package com.example.a12octu.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun SpaceH(size: Dp = 5.dp){
    Spacer(modifier = Modifier.height(size))
}

@Composable
    fun SpaceW(size: Dp = 5.dp){
        Spacer(modifier = Modifier.width(size))
    }

    @Composable
    fun MainTextField(value: String, onValueChange: (String) -> Unit, label: String){
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            label = {Text(label)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )
    }

@Composable
fun MainButton(text: String, onClick: () -> Unit, color: Color = MaterialTheme.colorScheme.primary){
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor= color,
            contentColor = Color.Transparent),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    ){
        Text(text = text)
    }

}

@Composable
fun Alert(title: String,
          message: String,
          confirmText: String,
          onConfirmClick: () -> Unit,
          onDismissClick: () -> Unit){

    AlertDialog(
        onDismissRequest = onDismissClick,
        title = {Text(title)},
        text = {Text(message)},
        confirmButton = {
            Button(onClick = {onConfirmClick}){
                Text(text = confirmText)
            }
        }
          }
    )
