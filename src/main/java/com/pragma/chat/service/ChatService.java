package com.pragma.chat.controller;

import com.pragma.chat.dto.MessageDTO;
import com.pragma.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping
    public List<MessageDTO> getMessages() {
        return chatService.getMessages();
    }

    @PostMapping
    public ResponseEntity<MessageDTO> addMessage(@RequestBody MessageDTO message) {
        chatService.addMessage(message);
        return ResponseEntity.ok(message);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MessageDTO> updateMessage(@PathVariable Long id, @RequestBody MessageDTO message) {
        // Implementar lógica de actualización
        return ResponseEntity.ok(message);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        // Implementar lógica de eliminación
        return ResponseEntity.ok().build();
    }
}