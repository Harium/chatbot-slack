package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackUser;

public class SlackChannelCreated implements SlackEvent {
    private SlackChannel slackChannel;
    private SlackUser slackUser;

    public SlackChannelCreated(SlackChannel slackChannel, SlackUser slackUser) {
        this.slackChannel = slackChannel;
        this.slackUser = slackUser;
    }

    public SlackUser getCreator() {
        return slackUser;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_CREATED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    public SlackUser getSlackUser() {
        return slackUser;
    }

    public void setSlackUser(SlackUser slackUser) {
        this.slackUser = slackUser;
    }
}
