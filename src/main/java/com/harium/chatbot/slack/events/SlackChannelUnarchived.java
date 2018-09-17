package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackChannel;
import com.harium.chatbot.slack.SlackUser;


public class SlackChannelUnarchived implements SlackEvent {
    private SlackChannel slackChannel;
    private SlackUser slackUser;

    public SlackChannelUnarchived(SlackChannel slackChannel, SlackUser slackUser) {
        this.slackChannel = slackChannel;
        this.slackUser = slackUser;
    }

    public SlackUser getUser() {
        return slackUser;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_UNARCHIVED;
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
