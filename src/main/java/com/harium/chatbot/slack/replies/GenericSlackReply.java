package com.harium.chatbot.slack.replies;

public class GenericSlackReply implements SlackReply {
    private String obj;

    public GenericSlackReply(String obj) {
        this.obj = obj;
    }

    public String getPlainAnswer() {
        return obj;
    }

}
