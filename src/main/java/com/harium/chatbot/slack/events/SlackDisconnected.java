package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackPersona;

public class SlackDisconnected implements SlackEvent {
    private SlackPersona persona;

    public SlackDisconnected(SlackPersona slackPersona) {
        this.persona = slackPersona;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_DISCONNECTED;
    }

    public SlackPersona getPersona() {
        return persona;
    }

    public void setPersona(SlackPersona persona) {
        this.persona = persona;
    }
}
