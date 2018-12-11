package xmlParser;

import java.util.List;

public class MailsXML {

	private List<MailsXML> mails;
	private int id;
	private String to;
	private String subject;
	private String text;

	public List<MailsXML> getMails() {
		return mails;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "MailsXML [id = " + id + ", to = " + to + ", subject = " + subject + ", text = " + text + "]";
	}
}
