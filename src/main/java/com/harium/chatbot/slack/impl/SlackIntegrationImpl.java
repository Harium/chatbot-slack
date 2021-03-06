package com.harium.chatbot.slack.impl;

import com.harium.chatbot.slack.SlackIntegration;

class SlackIntegrationImpl implements SlackIntegration {

    private final String id;
    private final String name;
    private final boolean deleted;

    public SlackIntegrationImpl(String id, String name, boolean deleted) {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDeleted() {
        return deleted;
    }
}
