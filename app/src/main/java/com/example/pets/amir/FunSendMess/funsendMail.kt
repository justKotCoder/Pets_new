package com.example.pets.logic.asynkClass.FunSendMess

import com.example.pets.amir.AsynkClasses.SendMailTask

<<<<<<< HEAD


fun sendNessage(mail: String): String {
    val codeOfFive= java.util.Random()
=======
import java.util.*


fun sendNessage(mail: String): String {
    val codeOfFive= Random()
>>>>>>> dc79291c041938fd1da2c31c6421eebfc50c4ab7
    val numbers= codeOfFive.nextInt(999999)
    val sendMailTask =
        SendMailTask(
            mail,
            "Code",
            "Code verification",
            numbers.toString()
        )
    sendMailTask.execute()
    return numbers.toString()
}