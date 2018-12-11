package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = ".//a[@id='PH_logoutLink']")
	private WebElement logoutLink;

	@FindBy(id = "mailbox:error")
	private WebElement errorMessage;

	public LoginPage() {
		PageFactory.initElements(super.getDriver(), this);
	}

	public void enterLoginAndPass(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
		buttonEnter.submit();
	}

	public void logoutDisplayed() {
		logoutLink.isDisplayed();
	}
}
