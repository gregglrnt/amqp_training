package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    private ChatMessageRepository chatMessages;

    public ChatMessageController(ChatMessageRepository cmr) {
        this.chatMessages = cmr;
    }

    @GetMapping("/api/messages")
    List<String> getMessagesFromApi() {
        return this.chatMessages.getLastTenMessages();
    }
}
