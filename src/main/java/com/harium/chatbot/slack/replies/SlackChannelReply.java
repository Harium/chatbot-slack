package com.harium.chatbot.slack.replies;

import com.harium.chatbot.slack.SlackChannel;

public class SlackChannelReply extends SlackReplyImpl implements ParsedSlackReply {
    private SlackChannel slackChannel;

    public SlackChannelReply(boolean ok, String error, SlackChannel slackChannel) {
        super(ok, error);
        this.slackChannel = slackChannel;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }
}
