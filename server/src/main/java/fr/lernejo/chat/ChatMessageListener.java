package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    private ChatMessageRepository messages;

    public ChatMessageListener(ChatMessageRepository cmr) {
        this.messages = cmr;
    }

    public void onMessage(String m) {
        this.messages.addChatMessage(m);
    }
}
