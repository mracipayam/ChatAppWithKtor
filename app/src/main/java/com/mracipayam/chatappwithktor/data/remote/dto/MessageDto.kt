package com.mracipayam.chatappwithktor.data.remote.dto

import com.mracipayam.chatappwithktor.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.Date

@Serializable
data class MessageDto(
    val text : String,
    val timeStamp : Long,
    val username : String,
    val id : String
){
    fun toMessage(): Message {
        val date = Date()
        val formattedDate = DateFormat.getDateInstance(DateFormat.DEFAULT).format(date)
        return Message(text, formattedDate, username)
    }
}
