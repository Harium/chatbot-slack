package com.harium.chatbot.slack.events.userchange;

import com.harium.chatbot.slack.SlackUser;
import com.harium.chatbot.slack.events.SlackEvent;

public interface SlackUserChangeEvent extends SlackEvent {

    SlackUser getUser();
}
