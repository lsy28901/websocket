package com.chat.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocket {
    @MessageMapping("/send")
    @SendTo("/topic/test")
    public Message broadCast(Message message){
        return message;
    }
}
