package com.example.pets.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pets.R
import com.example.pets.logic.asynkClass.createNewUser.SignIn

import com.example.pets.navigation.NavRoute
import com.example.pets.pets

import com.example.pets.ui.theme.PetsTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Authotization(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var visibility by remember {
        mutableStateOf(false)
    }
    Scaffold() {
        Box(
            Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.Font_Main))
        ) {
            Column(
                Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Добро Пожаловать",
                    fontSize = 28.sp,
                    color = colorResource(id = R.color.color_tema)
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp, start = 16.dp)
                ) {
                    Text(
                        "Введите email",
                        fontSize = 14.sp,
                        modifier = Modifier.align(Alignment.BottomStart),
                        color = colorResource(
                            id = R.color.color_text
                        )
                    )
                }
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Поиск") },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 16.dp)
                ) {
                    Text(
                        "Введите пароль",
                        fontSize = 14.sp,
                        modifier = Modifier.align(Alignment.BottomStart),
                        color = colorResource(
                            id = R.color.color_text
                        )
                    )
                }
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Поиск") },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    visualTransformation = PasswordVisualTransformation()
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(end = 9.dp)
                ) {
                    Text(
                        "Забыли пароль?", fontSize = 14.sp,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .clickable { navController.navigate(NavRoute.Password_Recovery.route) },
                        color = colorResource(id = R.color.color_text)
                    )
                }
<<<<<<< HEAD
                Button(
                    onClick = {
                        SignIn(email = email, password=password, navController)
                        navController.navigate(NavRoute.Shoping.route)
                        visibility = true

                    },
=======
                Button(onClick = {

                    navController.navigate(NavRoute.Shoping.route)
                                 visibility=true
                                 },
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(id = R.color.icon),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 54.dp)
                ) {
                    Text(text = "Войти", fontSize = 22.sp, color = Color.White)
                }
                Text(
                    text = "Регистрация",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)
<<<<<<< HEAD
                        .clickable { navController.navigate(NavRoute.Registration.route) },
                    color = colorResource(id = R.color.color_1)
=======

                        .clickable {navController.navigate(NavRoute.Registration.route) },
                    color= colorResource(id = R.color.color_1)
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
                )

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun pewStartScreen() {
    PetsTheme {
        Authotization(navController = rememberNavController())
    }
}