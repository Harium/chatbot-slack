package com.harium.chatbot.slack.impl;

import com.harium.chatbot.slack.ChannelHistoryModule;
import com.harium.chatbot.slack.SlackSession;

public class ChannelHistoryModuleFactory {

    public static ChannelHistoryModule createChannelHistoryModule(SlackSession session) {
        return new ChannelHistoryModuleImpl(session);
    }

    ;

}
