package com.example.pets.amir

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pets.logic.asynkClass.createNewUser.CreateUser
import androidx.compose.ui.platform.LocalContext
@Preview
@Composable
fun adadd(){
    val context= LocalContext.current
    Button(onClick = { CreateUser("fg21@gmial.com", "awdawf12", context)}) {

    }
}