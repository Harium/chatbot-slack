package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackChannel;

public class SlackChannelLeft implements SlackEvent {

    private SlackChannel slackChannel;

    public SlackChannelLeft(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_LEFT;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }
}
