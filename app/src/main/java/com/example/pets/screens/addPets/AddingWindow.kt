package com.example.pets.screens.addPets

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pets.R
import com.example.pets.amir.firebase.addUsers

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun AddPets() {
    var name by remember {
        mutableStateOf("")
    }
    var type by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("")
    }
    var listage by remember {
        mutableStateOf(false)
    }
    var typeOfWool by remember {
        mutableStateOf("")
    }
    Scaffold {
        Box(
            Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.Font_Main))
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 98.dp, end = 152.dp),


            ) {
                Box(
                    Modifier

                ) {
                    Text(
                        text = "Профиль Питомца",
                        fontSize = 22.sp
                    )
                }
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 16.dp)
                ) {
                    Text(text = "Имя", fontSize = 12.sp)

                }
                Box(
                    Modifier
                        .width(242.dp)
                        .height(42.dp)
                ) {
                    TextField(
                        value = name,
                        onValueChange = { name = it },
                        shape = RoundedCornerShape(20.dp),
                        maxLines = 1,


                        colors = TextFieldDefaults.textFieldColors(
                            textColor = colorResource(id = R.color.color_text),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent,
                            backgroundColor = Color.White
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 16.dp),


                ) {
                    Text(text = "Порода", fontSize = 12.sp)
                }
                TextField(
                    value = type,
                    onValueChange = { type = it },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,

                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(242.dp)
                        .height(42.dp)
                )
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 16.dp)
                ) {
                    Text(text = "Возрост", fontSize = 12.sp)
                }
                Row {
                    Box(
                        Modifier
                            .width(96.dp)
                    ) {
                        TextField(
                            value = age,
                            onValueChange = { age = it },
                            shape = RoundedCornerShape(20.dp),
                            maxLines = 1,

                            colors = TextFieldDefaults.textFieldColors(
                                textColor = colorResource(id = R.color.color_text),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                backgroundColor = Color.White
                            ),
                            modifier = Modifier
                                .width(96.dp)
                                .height(42.dp),
                            trailingIcon = {
                                Icon(
                                    painterResource(id = R.drawable.dropdown),
                                    contentDescription = null,
                                    modifier = Modifier.clickable {
                                        listage = true
                                    })

                            }


                        )
                        if (listage) {
                            DropdownMenu(
                                expanded = listage,
                                onDismissRequest = { listage = false },
                                modifier = Modifier
                                    .fillMaxHeight()

                            ) {
                                DropdownMenuItem(onClick = { }) {
                                    Text("Скопировать")
                                }
                            }
                        }
                    }

                }
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 16.dp)
                ){
                    Text(text = "Возрост", fontSize = 12.sp)
                }
                TextField(
                    value = typeOfWool,
                    onValueChange = { typeOfWool = it },
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = colorResource(id = R.color.color_text),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(242.dp)
                        .height(42.dp)
                )

            }
        }
    }

}