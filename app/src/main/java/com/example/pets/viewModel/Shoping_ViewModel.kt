package com.example.pets.viewModel

import androidx.lifecycle.ViewModel
import com.example.pets._class.List_Tovar
import com.example.pets._class.Tovar
import kotlinx.coroutines.flow.MutableStateFlow

class Shoping_ViewModel:ViewModel() {
    val Products : MutableStateFlow<ArrayList<Tovar>> = MutableStateFlow(List_Tovar!!)
    val count : MutableStateFlow<Double> =MutableStateFlow(Products?.value?.size!!.toDouble())
    var int=0
    fun nomer():Tovar{
        if(int<Products.value.size){
            return Products.value.get(int++)

        }
        return Tovar()
    }

}