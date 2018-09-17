package com.harium.chatbot.slack.events.userchange;

import com.harium.chatbot.slack.SlackUser;
import com.harium.chatbot.slack.events.SlackEventType;

public class SlackTeamJoin implements SlackUserChangeEvent {

    private final SlackUser slackUser;

    public SlackTeamJoin(SlackUser slackUser) {
        this.slackUser = slackUser;
    }

    @Override
    public SlackUser getUser() {
        return slackUser;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_TEAM_JOIN;
    }
}
