package junitcucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlagMailSteps {

	private FlagMailPage flagMail;
	private WebDriver webDriver = DriverManager.getInstance();

	public FlagMailSteps() {
		flagMail = new FlagMailPage();
	}

	@Given("^I click on Inbox menu$")
	public void openInboxMenu() {
		flagMail.selectInbox();
	}

	@When("^I select 3 mail checkboxes$")
	public void seletMailsForFlagging() {
		flagMail.selectThreeMails();
	}

	@When("^I mark mails with a flag$")
	public void markWithFlags() {
		flagMail.flagMails();
	}

	@Then("^I see flag is displayed$")
	public void flagsAreDispalyed() {
		flagMail.flagIsDispalyed();
	}

	@When("^I click on More button and unflag mails$")
	public void unmarkWithFlags() {
		flagMail.unflagMails();
	}

	@Then("^I see flag is not displayed$")
	public void flagsAreNotDispalyed() {
		flagMail.flagIsNotDispalyed();
	}
}
