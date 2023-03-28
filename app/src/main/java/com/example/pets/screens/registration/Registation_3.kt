package com.example.pets.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pets.R
import com.example.pets.logic.asynkClass.createNewUser.Data
import com.example.pets.navigation.NavRoute
import com.example.pets.ui.theme.PetsTheme

@Composable
fun Registration_3(navController: NavController){
    var Name by remember {
        mutableStateOf("")
    }


    Box(
        Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.Font_Main))) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Регистрация", fontSize = 28.sp,color= colorResource(id = R.color.color_tema))
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp)) {
                Text("Введите имя", fontSize = 14.sp, modifier = Modifier.align(Alignment.BottomStart), color = colorResource(
                    id = R.color.color_text
                )
                )
            }
            TextField(
                value = Name,
                onValueChange ={Name=it},
                leadingIcon = { Icon(Icons.Filled.Person, contentDescription = "Поиск") },
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

                if(Name.length>=3){
                    Data.name=Name
                    navController.navigate(NavRoute.Registration_4.route)
                }


            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.icon), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)) {
                Text(text = "Дальше", fontSize = 22.sp,color= Color.White)
            }


        }

    }
}
@Preview(showBackground = true)
@Composable
fun viewRegistration3(){
    PetsTheme {
        Registration_3(navController = rememberNavController())
    }
}