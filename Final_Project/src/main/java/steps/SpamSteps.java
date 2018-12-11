package steps;

import org.apache.log4j.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SpamPage;

public class SpamSteps extends BaseSteps {
	private static final Logger log = Logger.getLogger(LoginSteps.class);
	private SpamPage spamPage = new SpamPage();

	@Given("^I click on Spam left side button$")
	public void clickOnSpamLeftMenu() {
		spamPage.openSpamMenu();
		log.info("Opening Spam left side menu");
	}

	@When("^I click on Not Spam button$")
	public void moveToNonSpam() {
		spamPage.clickNotSpamButton();
	}
}
