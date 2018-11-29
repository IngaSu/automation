package api;

import org.apache.http.client.ClientProtocolException;
import org.junit.*;
 import java.io.IOException;
import java.net.URISyntaxException;
public class RequestsTest {
	
Requests request = new Requests();

@Test
public void sendMessageTest() throws ClientProtocolException, URISyntaxException, IOException {
	request.sendMessage("send?", "My message");
	boolean result=false;
	if (request.getMessageID()!=0) {
	result = true;
	}
	Assert.assertTrue(result);
}


}
