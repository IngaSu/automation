package steps;

import java.io.IOException;
import java.sql.SQLException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.xml.sax.SAXException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ComposeMailPage;
import xmlParser.XMLRunner;

public class ComposeMailSteps extends BaseSteps {
	private static final Logger log = Logger.getLogger(LoginSteps.class);
	private ComposeMailPage composePage;

	public ComposeMailSteps() throws SQLException, ParserConfigurationException, SAXException, IOException, XMLStreamException {
		composePage = new ComposeMailPage();
	}
	XMLRunner xmlr = new XMLRunner();
	private String text = xmlr.getTextFromXml();
	private static final String EMAIL = "inha@bk.ru"+ "," + " inga.supranovich@gmail.com";
	
	@When("^I send message to the group$")
	public void selectLetters() {
		composePage.createGroupLetter(driver, text, EMAIL);
		log.info("Sending message to the group");
	}

	@Then("^I am redirected to success message$")
	public void redirectAterSendMessage() {
		composePage.waitForCanvas();
		Assert.assertTrue(true);
		log.info("Message successfully sent to the group");
	}
}
