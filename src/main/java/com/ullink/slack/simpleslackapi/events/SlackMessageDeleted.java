package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;

public class SlackMessageDeleted implements SlackEvent {
    private SlackChannel slackChannel;
    private String messageTimestamp;
    private String deleteTimestamp;

    public SlackMessageDeleted(SlackChannel slackChannel, String messageTimestamp, String deleteTimestamp) {
        this.slackChannel = slackChannel;
        this.messageTimestamp = messageTimestamp;
        this.deleteTimestamp = deleteTimestamp;
    }

    public String getTimeStamp() {
        return deleteTimestamp;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_MESSAGE_DELETED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    public String getMessageTimestamp() {
        return messageTimestamp;
    }

    public void setMessageTimestamp(String messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }

    public String getDeleteTimestamp() {
        return deleteTimestamp;
    }

    public void setDeleteTimestamp(String deleteTimestamp) {
        this.deleteTimestamp = deleteTimestamp;
    }
}
