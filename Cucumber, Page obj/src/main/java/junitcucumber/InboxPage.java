package junitcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage extends BasePage {
	@FindBy(xpath = "(.//*[@class='b-checkbox__box'])[5]")
	private WebElement latterCheckbox;

	@FindBy(xpath = "(.//*[@data-shortcut-title='J'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = ".//i[@class='icon icon_info-state icon_tip-ok']")
	private WebElement spamMessage;
	
	@FindBy (xpath = ".//div[@class='threads-enabled']")
	private WebElement canvas;
	
	public InboxPage() {
		PageFactory.initElements(this.getDriver(), this);
	}
	public void checkLatterCheckbox() {
		latterCheckbox.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public void showMovedToSpamMessage() {
		spamMessage.isDisplayed();
	}
	public void waitForCanvas(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(canvas));
	}
	public void waitForSpamMessage(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(spamMessage));
	}

}
