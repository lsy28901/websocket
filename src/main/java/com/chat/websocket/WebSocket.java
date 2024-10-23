package com.chat.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class WebSocket {
    @MessageMapping("/send")
    @SendTo("/topic/test")
    public Message broadCast(Message message){
        log.info("메시지를 받았습니다 ={}",message);
        return message;
    }
}
