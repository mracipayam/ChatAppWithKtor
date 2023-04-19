package com.mracipayam.chatappwithktor.domain.model

import java.text.DateFormat
import java.util.Date


data class Message(
    val text : String,
    val formattedTime : String,
    val username : String
){

}
