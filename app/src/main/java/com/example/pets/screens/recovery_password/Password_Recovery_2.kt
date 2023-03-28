package com.example.pets.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pets.R
import com.example.pets.navigation.NavRoute
import com.example.pets.ui.theme.PetsTheme


@Composable
fun Password_Recovery_2(navController: NavController){

    var code = remember {
        mutableStateOf("")
    }
    var code_prov= remember{
        mutableStateOf("000000")
    }
    var Error by remember{
        mutableStateOf(false)
    }


    Box(
        Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.Font_Main))) {
        Column(
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 52.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text ="Забыли пароль?", fontSize = 28.sp,color= colorResource(id = R.color.color_tema))
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp)) {
                Text("Введите код подтверждения", fontSize = 14.sp, modifier =Modifier.align(Alignment.BottomStart),color= colorResource(
                    id = R.color.color_text
                ))
            }
            Box(){
                TextField(
                    value = code.value,
                    onValueChange ={if (it.length<=6){
                        code.value= it
                        Error=false
                    }},
                    shape = RoundedCornerShape(20.dp),
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Transparent,
                        cursorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White

                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                Row(modifier = Modifier.fillMaxWidth().padding(top=8.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                    for (i in 0..5) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(end = 8.dp)
                        ) {


                            Text(text =if(code.value.length > i){code.value[i].toString()}else{" "}
                                , fontSize = 20.sp)
                            Log.d("Egor1",code.value.length.toString())



                            Spacer(
                                modifier = Modifier.width(30.dp).height(2.dp).background(Color.Blue)
                            )

                        }
                    }
                }
            }
            Text(text = "Неверный код, попробуйте еще раз",
                fontSize = 12.sp,
                color = if(Error==false){Color.Transparent}else{Color.Red},
                modifier = Modifier.padding(top=8.dp))
            Button(onClick = {
                Log.d("Egor2",code.value.toString())
                Log.d("Egor2",code_prov.value.toString())
                if(code.value==code_prov.value) {
                    navController.navigate(NavRoute.Password_Recovery_3.route)
                }
                else{
                    Error=true
                }
            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.icon), contentColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)) {
                Text(text = "Дальше", fontSize = 22.sp,color=Color.White)
            }
            Text(text = stringResource(id = R.string.xyz),lineHeight = 16.sp, letterSpacing = 0.4.sp , fontSize = 12.sp, textAlign = TextAlign.Center ,modifier = Modifier.padding(top=8.dp,start=18.5.dp,end=18.5.dp),color= colorResource(
                id = R.color.color_text
            ))
            Text(text="Выслать еще раз", fontSize = 14.sp,modifier = Modifier
                .padding(top = 24.dp)
                .clickable { }, color = colorResource(id = R.color.color_text))

        }

    }
}
@Preview(showBackground = true)
@Composable
fun viewPawword2(){
    PetsTheme {
        Password_Recovery_2(navController = rememberNavController())
    }
}