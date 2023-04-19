package com.mracipayam.chatappwithktor.data.remote

import com.mracipayam.chatappwithktor.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    companion object{
        const val BASE_URL = "http://192.168.1.4:8080"
    }

    sealed class Endpoints(val url : String){
        object GetAllMessages : Endpoints("$BASE_URL/messages")
    }
}