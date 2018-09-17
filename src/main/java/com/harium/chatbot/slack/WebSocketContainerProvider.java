package com.harium.chatbot.slack;

import javax.websocket.WebSocketContainer;

public interface WebSocketContainerProvider {
    WebSocketContainer getWebSocketContainer();
}
