package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;

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
