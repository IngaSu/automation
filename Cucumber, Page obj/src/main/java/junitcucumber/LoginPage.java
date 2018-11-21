package junitcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	private static final String LOGIN = "inha@bk.ru";
	private static final String PASSWORD = "Thule2541";

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	public LoginPage() {
		PageFactory.initElements(this.getDriver(), this);
	}

	public void enterLoginAndPass() {
		loginField.clear();
		loginField.sendKeys(LOGIN);
		passwordField.clear();
		passwordField.sendKeys(PASSWORD);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}
}
