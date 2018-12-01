package api;

import org.apache.http.client.ClientProtocolException;
import org.junit.*;
Hometask_23
import java.io.IOException;
import java.net.URISyntaxException;

public class RequestsTest {

	Requests request = new Requests();

	@Test
	public void sendMessageTest() throws ClientProtocolException, URISyntaxException, IOException {
		request.sendMessage("send?", "My message");
		boolean result = false;
		if (request.getMessageID() != 0) {
			result = true;
		}
		Assert.assertTrue(result);
	}

	@Test
	public void editMessageTest() throws ClientProtocolException, URISyntaxException, IOException {
		request.editMessage("edit?", "Edited message");
		int actual_result = 1;
		int expected_result = request.getMessageID2();
		Assert.assertEquals(expected_result, actual_result);
	}

	@Test
	public void deleteMessageTest() throws ClientProtocolException, URISyntaxException, IOException {
		request.deleteMessage("delete?");
		int actual_result = 1;
		int expected_result = request.getMessageID3();
		Assert.assertEquals(expected_result, actual_result);
	}
}
