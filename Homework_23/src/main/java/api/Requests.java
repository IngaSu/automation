package api;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Requests {

	HttpClient client = HttpClientBuilder.create().build();
	private int messageID;
	private String token = "50d3caa3a1af8f84803a830da7b3b0ac355ef5f3e88a1e124d78914bf7fff802b289a1f6eb3fad39e9a2c";
	private String request = "https://api.vk.com/method/messages.";
	private String userID = "210597275";
	private String messageText;
	private String editedMessage;
	private String version = "5.92";



	public void sendMessage(String method, String message)
			throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder = new URIBuilder(request + method);
		this.messageText = message;
		builder.setParameter("access_token", token).setParameter("user_id", userID).setParameter("message", message)
				.setParameter("v", version);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		messageID = Integer.parseInt(EntityUtils.toString(response.getEntity()).replaceAll("\\D", ""));
	}

	public int getMessageID() {
		return messageID;
	}

	public void editMessage(String method, String newMessage)
			throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder = new URIBuilder(request + method);
		this.editedMessage = newMessage;
		builder.setParameter("access_token", token).setParameter("user_id", userID).setParameter("peer_id", userID)
				.setParameter("message_id", String.valueOf(messageID)).setParameter("message", newMessage)
				.setParameter("v", version);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}

	public void deleteMessage(String method, String newMessage)
			throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder = new URIBuilder(request + method);
		builder.setParameter("access_token", token).setParameter("user_id", userID)
				.setParameter("message_id", String.valueOf(messageID)).setParameter("v", version);
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}
}
