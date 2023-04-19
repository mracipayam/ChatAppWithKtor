package com.mracipayam.chatappwithktor.data.remote

import com.mracipayam.chatappwithktor.domain.model.Message
import com.mracipayam.chatappwithktor.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {
    suspend fun initSession(
        username: String,
    ) : Resource<Unit>

    suspend fun sendMessage(message : String)

    fun observeMessages() : Flow<Message>

    suspend fun closeSession()

    companion object{
        const val BASE_URL = "ws://192.168.1.4:8080"
    }

    sealed class Endpoints(val url : String){
        object ChatSocket : Endpoints("$BASE_URL/chat-socket")
    }
}