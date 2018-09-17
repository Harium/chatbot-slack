package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackPersona;

public class PresenceChange implements SlackEvent {
    private String userId;
    private SlackPersona.SlackPresence presence;

    public PresenceChange(String userId, SlackPersona.SlackPresence presence) {
        this.userId = userId;
        this.presence = presence;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.PRESENCE_CHANGE;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SlackPersona.SlackPresence getPresence() {
        return presence;
    }

    public void setPresence(SlackPersona.SlackPresence presence) {
        this.presence = presence;
    }
}
