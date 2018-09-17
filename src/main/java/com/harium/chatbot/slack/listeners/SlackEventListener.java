package com.harium.chatbot.slack.listeners;

import com.harium.chatbot.slack.SlackSession;
import com.harium.chatbot.slack.events.SlackEvent;

public interface SlackEventListener<T extends SlackEvent> {
    void onEvent(T event, SlackSession session);
}
