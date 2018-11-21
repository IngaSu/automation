package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InboxSteps{
	private InboxPage inboxPage;
	private WebDriver driver = DriverManager.getInstance();

	public InboxSteps() {
		inboxPage = new InboxPage();
	}
	@Given("^I wait while canvas loading$")
	public void waifForCanvasLoading () {
		inboxPage.waitForCanvas(driver);
	}

	@When("^I select checkbox of the latter$")
	public void sendLetterToSpam() {
		inboxPage.checkLatterCheckbox();
	}

	@When("^I click on spam button$")
	public void clickOnSpamButton() {
		inboxPage.clickSpamButton();
	}
	
	@Then("^I see moved to spam message$")
	public void checkMovedToSpamMessage() {
		inboxPage.waitForSpamMessage(driver);
		System.out.println("Message was moved to spam");
	}

}
