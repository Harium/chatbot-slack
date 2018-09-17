package com.harium.chatbot.slack.replies;

public interface ParsedSlackReply extends SlackReply {
    boolean isOk();

    String getErrorMessage();
}
