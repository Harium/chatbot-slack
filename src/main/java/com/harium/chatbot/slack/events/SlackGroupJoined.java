package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackChannel;

public class SlackGroupJoined implements SlackEvent {

    private SlackChannel slackChannel;

    public SlackGroupJoined(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_GROUP_JOINED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }
}
