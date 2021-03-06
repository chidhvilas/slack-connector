/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.slack.automation.functional;

import org.junit.Test;
import org.mule.modules.slack.client.model.chat.MessageResponse;
import org.mule.modules.slack.automation.runner.AbstractSlackTestCase;

/**
 * Created by estebanwasinger on 8/8/15.
 */
public class UpdateAndDeleteMessageTestCases extends AbstractSlackTestCase {

    @Test
    public void testUpdateAndDeleteMessage() {
        MessageResponse response = getConnector().postMessage(TEST_MESSAGE, CHANNEL_ID, null, null, true);
        getConnector().updateMessage(response.getTs(),CHANNEL_ID,"updated message");
        getConnector().deleteMessage(response.getTs(),CHANNEL_ID);
    }

}
