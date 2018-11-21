package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private LoginPage loginPage;
	private WebDriver webDriver = DriverManager.getInstance();

	public LoginSteps() {
		loginPage = new LoginPage();
	}

	@Given("^I am on main application page$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@Given("^I login as correct user$")
	public void loginAsUserWithCredentials() {
		loginPage.enterLoginAndPass();
		loginPage.clickEnterButton();
	}
}
