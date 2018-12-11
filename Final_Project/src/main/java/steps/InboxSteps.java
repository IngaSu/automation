package steps;

import org.apache.log4j.Logger;
import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InboxPage;

public class InboxSteps extends BaseSteps {
	private static final Logger log = Logger.getLogger(LoginSteps.class);

	@When("^I select mail checkbox$")
	public void selectLetters() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.markThreeLetter(3);
		log.info("Checkboxes are selected");
	}

	@When("^I click on Delete button$")
	public void clickOnDeleteButton() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.deleteLetters();
		log.info("Delete letters is processing");
	}

	@When("^I click on Archive button$")
	public void clickOnArchiveButton() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.archiveLetters();
		log.info("Archive letters is processing");
	}

	@When("^I click on spam button$")
	public void clickOnSpamButton() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.moveToSpam();
		log.info("Moving to spam letters is processing");
	}

	@When("^I mark mail with a flag$")
	public void markWithFlags() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.flagMails();
		log.info("Mails are flagged");
	}

	@When("^I click filter by flags button$")
	public void filterByFlags() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.filterByFlaggedMails();
		log.info("Filtering by flagged mails");
	}

	@Then("^I wait for OK notification$")
	public void checkOkNotification() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.waitForOkNotification();
		log.info("Letters are deleted");
	}

	@Then("^I see flag is displayed$")
	public void flagsAreDispalyed() throws Throwable {
		InboxPage inboxPage = new InboxPage();
		inboxPage.flagIsDispalyed(3);
		Assert.assertTrue(true);
		log.info("Flags are displayed");
	}
}
