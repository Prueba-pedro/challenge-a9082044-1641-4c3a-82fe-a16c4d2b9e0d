package com.pragma.chat.service;

import com.pragma.chat.dto.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private final List<MessageDTO> messages = new ArrayList<>();

    public List<MessageDTO> getMessages() {
        return messages;
    }

    public void addMessage(MessageDTO message) {
        messages.add(message);
    }
}