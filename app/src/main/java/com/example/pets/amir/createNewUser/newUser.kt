package com.example.pets.logic.asynkClass.createNewUser

import android.content.ContentValues.TAG
<<<<<<< HEAD
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.navigation.NavController
import com.example.pets.navigation.NavRoute
=======
import android.util.Log
import android.widget.Toast
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var auth: FirebaseAuth

<<<<<<< HEAD
fun CreateUser(  email: String,password: String, context: Context){
    auth = Firebase.auth
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
=======
fun CreateUser(name: String, password: String, email: String){
    init()
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener() { task ->
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information

            } else {
<<<<<<< HEAD


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
=======
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
                // If sign in fails, display a message to the user.

            }
        }
<<<<<<< HEAD
}
=======

}
fun init(){
    auth= Firebase.auth;
}
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
