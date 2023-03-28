package com.example.pets.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
<<<<<<< HEAD
=======
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pets.R
import com.example.pets.logic.asynkClass.FunSendMess.sendNessage
import com.example.pets.logic.asynkClass.createNewUser.Data
import com.example.pets.navigation.NavRoute
<<<<<<< HEAD
import com.example.pets.ui.theme.PetsTheme
=======
import com.example.pets.screens.Authotization
import com.example.pets.ui.theme.PetsTheme

>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7

@Composable
fun Registration(@PreviewParameter(PreviewParameterProvider::class)navController: NavController){
    var email by remember {
        mutableStateOf("")
    }


    Box(Modifier.fillMaxSize().background(colorResource(id = R.color.Font_Main))) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth()
            , horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Регистрация", fontSize = 28.sp, color = colorResource(id = R.color.color_tema))
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp)) {
                Text("Введите email", fontSize = 14.sp, modifier = Modifier.align(Alignment.BottomStart),
                    color= colorResource(id = R.color.color_text)
                )
            }
            TextField(
                value = email,
                onValueChange ={email=it},
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
            Button(onClick = {
                Data.email=email
                Data.code=sendNessage(email)
                navController.navigate(NavRoute.Registration_2.route)
            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.icon), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)) {
                Text(text = "Дальше", fontSize = 22.sp, color = Color.White)
            }


        }

    }
}
@Preview(showBackground = true)
@Composable
<<<<<<< HEAD
fun viewRegistration(){
=======
fun showReg1(){
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
    PetsTheme {
        Registration(navController = rememberNavController())
    }
}