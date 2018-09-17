package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;

public class SlackChannelDeleted implements SlackEvent {
    private SlackChannel slackChannel;

    public SlackChannelDeleted(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_DELETED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }
}
