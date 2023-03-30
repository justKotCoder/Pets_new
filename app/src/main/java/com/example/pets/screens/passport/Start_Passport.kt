package com.example.pets.screens.passport

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pets.R
import com.example.pets.navigation.NavRoute
import com.example.pets.ui.theme.Blauw200

@Preview()
@Composable
fun Buttom() {
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.SpaceBetween){
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.doc_for_passport),
                contentDescription = "passportDog",
                modifier = Modifier.fillMaxSize()
            )
        }
        Button(
            onClick = { NavRoute.Passport },
            colors = ButtonDefaults.buttonColors(backgroundColor = Blauw200 ),
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        ) {
            Text(
                text = "Добавить",
                color = Color.White
            )

        }


    }


}

