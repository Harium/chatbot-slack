package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackFile;
import com.harium.chatbot.slack.SlackUser;
import com.harium.chatbot.slack.SlackChannel;

public class PinAdded implements SlackEvent {

    private SlackUser sender;
    private SlackChannel channel;
    private String timestamp;
    private SlackFile file;
    private String message;

    public PinAdded(SlackUser sender, SlackChannel channel, String timestamp, SlackFile file, String message) {
        this.sender = sender;
        this.channel = channel;
        this.timestamp = timestamp;
        this.file = file;
        this.message = message;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.PIN_ADDED;
    }

    public SlackUser getSender() {
        return sender;
    }

    public void setSender(SlackUser sender) {
        this.sender = sender;
    }

    public SlackChannel getChannel() {
        return channel;
    }

    public void setChannel(SlackChannel channel) {
        this.channel = channel;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public SlackFile getFile() {
        return file;
    }

    public void setFile(SlackFile file) {
        this.file = file;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
