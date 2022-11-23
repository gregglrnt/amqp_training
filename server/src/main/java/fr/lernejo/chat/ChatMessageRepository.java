package fr.lernejo.chat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMessageRepository {
    List<String> messages = new ArrayList<>();

    void addChatMessage(String message) {
        if(this.messages.size() > 9) {
            this.messages.remove(0);
        }
        this.messages.add(message);
    }

    List<String> getLastTenMessages() {
        return this.messages;
    }


}
