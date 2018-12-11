package steps;

import org.apache.log4j.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utilities.User;

public class LoginSteps extends BaseSteps{
	private static final Logger log = Logger.getLogger(LoginSteps.class);

	@Given("^I am on main application page$")
	public void loadMainPage() throws Throwable{
		log.info("Loading page with the URL ");
	}

	@When("^I enter valid credentials taken from DB and click Enter$")
	public void loginAsUserWithCredentials() throws Throwable{
		LoginPage loginPage = new LoginPage() ;
		User user = new User();
		String login = user.getLogin();
		String password = user.getPassword();
		loginPage.enterLoginAndPass(login, password);
		log.info("Logging in");
	}
	@Then("^I see logout link$")
	public void logoutLinkAppear() throws Throwable{
		LoginPage loginPage = new LoginPage() ;
		loginPage.logoutDisplayed();
		log.info("Successfully logged in");
	}
}
