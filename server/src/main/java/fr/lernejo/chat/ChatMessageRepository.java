package fr.lernejo.chat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMessageRepository {
    List<String> messages = new ArrayList<>();

    void addChatMessage(String message) {
        if(messages.size() >= 10) {
            messages.remove(0);
        }
        messages.add(message);
    }

    List<String> getLastTenMessages() {
        return messages;
    }


}
