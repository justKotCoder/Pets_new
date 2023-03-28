package com.example.pets.logic.asynkClass.createNewUser


import android.content.Context

import androidx.navigation.NavController
import com.example.pets.navigation.NavRoute

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var auth: FirebaseAuth


fun CreateUser(  email: String,password: String, context: Context){
    auth = Firebase.auth
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->

            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information

            } else {

            }
        }

}
fun SignIn(email: String, password: String, navController: NavController){
    auth.signInWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information
                navController.navigate(NavRoute.Shoping.route)
            } else {

                // If sign in fails, display a message to the user.

            }
        }

}

