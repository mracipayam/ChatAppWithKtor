package com.mracipayam.chatappwithktor.presentation.chat

import com.mracipayam.chatappwithktor.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false,
)
