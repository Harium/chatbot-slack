package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackChannel;

public class SlackChannelJoined implements SlackEvent {

    private SlackChannel slackChannel;

    public SlackChannelJoined(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_JOINED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }
}
