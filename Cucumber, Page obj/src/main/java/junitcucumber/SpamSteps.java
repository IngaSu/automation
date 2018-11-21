package junitcucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpamSteps {

	private SpamPage spamPage;
	private WebDriver webDriver = DriverManager.getInstance();
	
	public SpamSteps() {
		spamPage = new SpamPage();
	}

	@Given("^I click on Spam left side button$")
	public void clickOnSpamLeftMenu() {
		spamPage.openSpamMenu();
	}

	@When("^I select latter checkbox$")
	public void selectLatterCheckbox() {
		spamPage.checkSpamLatterCheckbox();
	}

	@When("^I click on Not Spam button$")
	public void moveToNonSpam() {
		spamPage.clickNotSpamButton();
	}

	@Then("I see moved ouf of spam message")
	public void showOutOfSpamMessage() {
		spamPage.movedFromSpamMessage();
	}
}
