package com.harium.chatbot.slack.impl;

import com.harium.chatbot.slack.SlackUser;
import com.harium.chatbot.slack.SlackIntegration;

class SlackIntegrationUser implements SlackIntegration, SlackUser {
    private SlackIntegration integration;

    SlackIntegrationUser(SlackIntegration integration) {
        this.integration = integration;
    }

    @Override
    public String getId() {
        return integration.getId();
    }

    @Override
    public String getUserName() {
        return integration.getName();
    }

    @Override
    public String getRealName() {
        return integration.getName();
    }

    @Override
    public String getUserMail() {
        return null;
    }

    @Override
    public String getUserSkype() {
        return null;
    }

    @Override
    public String getUserPhone() {
        return null;
    }

    @Override
    public String getUserTitle() {
        return null;
    }

    @Override
    public String getName() {
        return integration.getName();
    }

    @Override
    public boolean isDeleted() {
        return integration.isDeleted();
    }

    @Override
    public boolean isAdmin() {
        return false;
    }

    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public boolean isPrimaryOwner() {
        return false;
    }

    @Override
    public boolean isRestricted() {
        return false;
    }

    @Override
    public boolean isUltraRestricted() {
        return false;
    }

    @Override
    public boolean isBot() {
        return true;
    }

    @Override
    public String getTimeZone() {
        return null;
    }

    @Override
    public String getTimeZoneLabel() {
        return null;
    }

    @Override
    public Integer getTimeZoneOffset() {
        return null;
    }

    @Override
    public SlackPresence getPresence() {
        return SlackPresence.UNKNOWN;
    }
}
