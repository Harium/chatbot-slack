package com.ullink.slack.simpleslackapi.impl;

import com.ullink.slack.simpleslackapi.WebSocketContainerProvider;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

public class TestSlackWebSocketSessionImpl {

  @Test(expected = IllegalArgumentException.class)
  public void testSendMessageWithNullChanel() throws Exception{
    WebSocketContainerProvider provider = mock(WebSocketContainerProvider.class);

    SlackWebSocketSessionImpl webSocketSession = new SlackWebSocketSessionImpl(provider,
        "", false, false, 42L, TimeUnit.MILLISECONDS);
    try {
      webSocketSession.sendMessage(null, "");
    } catch (NullPointerException e) {
      fail("NullPointerException unexpected here");
    }
  }
}
