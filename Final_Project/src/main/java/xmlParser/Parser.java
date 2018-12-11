package xmlParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Parser {

	private static final String MAIL = "Mail";
	private static final String ID = "id";
	private static final String TO = "to";
	private static final String SUBJECT = "subject";
	private static final String TEXT = "text";
	private MailsXML mail;
	List<MailsXML> mails = new ArrayList<MailsXML>();

	public List<MailsXML> parse(XMLEventReader xmlEventReader) throws FileNotFoundException, XMLStreamException {
		while (xmlEventReader.hasNext()) {
			XMLEvent xmlEvent = xmlEventReader.nextEvent();
			proceedStartElement(xmlEvent, xmlEventReader);
			proceedEndElement(xmlEvent);
		}
		return mails;
	}

	private void proceedStartElement(XMLEvent xmlEvent, XMLEventReader xmlEventReader) throws XMLStreamException {
		if (xmlEvent.isStartElement()) {
			StartElement startElement = xmlEvent.asStartElement();
			if (isTagNameEqual(startElement, MAIL)) {
				mail = new MailsXML();
				Attribute attribute = startElement.getAttributeByName(new QName(ID));
				if (attribute != null) {
					mail.setId(Integer.parseInt(attribute.getValue()));
				}
			} else if (isTagNameEqual(startElement, TO)) {
				mail.setTo(xmlEventReader.nextEvent().asCharacters().getData());
			} else if (isTagNameEqual(startElement, SUBJECT)) {
				mail.setSubject(xmlEventReader.nextEvent().asCharacters().getData());
			} else if (isTagNameEqual(startElement, TEXT)) {
				mail.setText(xmlEventReader.nextEvent().asCharacters().getData());
			}
		}
	}

	private void proceedEndElement(XMLEvent xmlEvent) {
		if (xmlEvent.isEndElement()) {
			EndElement endElement = xmlEvent.asEndElement();
			if (endElement.getName().getLocalPart().equals(MAIL)) {
				mails.add(mail);
			}
		}
	}

	private boolean isTagNameEqual(StartElement startElement, String tagName) {
		return startElement.getName().getLocalPart().equals(tagName);
	}
}
