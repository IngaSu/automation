package xmlParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import org.xml.sax.SAXException;

public class XMLRunner {
	public XMLRunner() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {

	}

	private static final String MAILS_XML = "Mails.xml";

	public String getTextFromXml() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(MAILS_XML));
		MailsXML mailsXML = new MailsXML();
		List<MailsXML> mails = mailsXML.getMails();
		mails = new Parser().parse(xmlEventReader);
		String str = mails.toString();
		Pattern p = Pattern.compile(".*\\' *(.*) *\\'.*");
		Matcher m = p.matcher(str);
		m.find();
		String text = m.group(1);
		return text;
	}
}
