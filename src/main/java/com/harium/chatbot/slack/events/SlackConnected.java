package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackPersona;

public class SlackConnected implements SlackEvent {
    private SlackPersona slackConnectedPersona;

    public SlackConnected(SlackPersona slackConnectedPersona) {
        this.slackConnectedPersona = slackConnectedPersona;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CONNECTED;
    }

    public SlackPersona getSlackConnectedPersona() {
        return slackConnectedPersona;
    }

    public void setSlackConnectedPersona(SlackPersona slackConnectedPersona) {
        this.slackConnectedPersona = slackConnectedPersona;
    }
}
