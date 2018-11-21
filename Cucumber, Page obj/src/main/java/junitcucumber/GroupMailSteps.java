package junitcucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GroupMailSteps {

	private GroupMailPage mail;
	private WebDriver webDriver = DriverManager.getInstance();

	public GroupMailSteps() {
		mail = new GroupMailPage();
	}

	@Given("^I click on Compose Letter button$")
	public void clickComposeLetterButton() {
		mail.composeLetter();
	}

	@When("^I enter To recipient$")
	public void enterToRecipient() {
		mail.enterRecipients();
	}

	@When("^I enter CC recipients$")
	public void enterCCRecipient() {
		mail.enterCCRecipients();
	}

	@When("^I enter subject$")
	public void enterSubject() {
		mail.enterSubject();
	}

	@When("^I enter message$")
	public void enterMessage() {
		mail.enterLetterText();
	}

	@When("^I click on send button$")
	public void sendMessage() {
		mail.sendLetter();
	}

	@Then("^I see success message$")
	public void checkSentMessageNote() {
		mail.sentMessageLetter();
	}

}
