[![Build Status](https://travis-ci.org/Harium/slack.svg?branch=master)](https://travis-ci.org/Harium/slack)

# Slack

This library is a fork of [simple-slack-api](https://github.com/Ullink/simple-slack-api)

This library allows an application to connect to [Slack](http://www.slack.com/) to receive and send messages from any channel as if it were a slack client.

The main purpose of this library is to build Slack bots able to react to channel events without having to configure any web hook.

With this library you should be able to connect to Slack and to send some messages in less than 20 lines (no one-liners).

### Maven
```
<dependency>
    <groupId>com.harium.chatbot</groupId>
    <artifactId>slack</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle
```
compile 'com.harium.chatbot:slack:1.0.0'
```

## How to use it ?

You can find some samples of the most common use cases in the [samples](https://github.com/Harium/slack-samples/tree/master/samples) folder.

Sample code

```java
SlackSession session = SlackSessionFactory.createWebSocketSlackSession("slack-bot-auth-token");
session.connect();
SlackChannel channel = session.findChannelByName("general"); //make sure bot is a member of the channel.
session.sendMessage(channel, "hi im a bot" );
```

## Features

### Supported Slack commands

All these commands can be sent through the library provided your bot has the rights to (IE : the bot has to be a member of the group or the channel to post some messages on it)

* Post a message on a channel / private group / user
* Post a typing indicator on a channel
* Update a message
* Delete a message
* Join a channel
* Leave a channel / a private group
* Invite to a channel / a private group
* Archive a channel
* Open a direct message channel (since v0.5.0)
* Open a multiparty direct message channel (since v0.5.0)
* Get the presence status of a user
* Add a reaction emoji to a message
* Fetch the channel history (since v0.5.0) (needs full user credentials)
* Invite a user to Slack (since v0.5.0)

On top of these built-in features, it is now possible to send not yet implemented API calls by using the postGenericSlackCommand method : 

```java
postGenericSlackCommand(Map<String, String> params, String command);
```


### Supported Slack events

All these events can be listen provided your bot has the rights to (IE : the bot has to be a member of the group or a channel to gets the message events related to it)

* message posted event
* message deleted event
* message updated event
* channel created event
* channel / private group deleted event
* channel / private group archived event
* channel / private group unarchived event
* channel / private group renamed event
* channel / private group joined event
* reaction added to message event (since v0.5.0)
* reaction removed from message event (since v0.5.0)
* team joined event


# Thanks

Many thanks to everyone who has contributed to this library :

* Christian Sprecher
* Jan Vidar Krey
* David Seebacher
* Wouter Vernaillen
* Claudio Comandini
* Maxim Gurkin
* Ole Kozaczenko
* Georges Gomes
* François Valdy
* Harry Fox
* Logan Clément
* Rhys Kenwell
* Aman Gupta
* Miklos Sagi

(Let me know if I forgot someone, I'll fix that ASAP ;) )

# License
- [LGPL](https://www.gnu.org/licenses/lgpl-3.0.en.html)