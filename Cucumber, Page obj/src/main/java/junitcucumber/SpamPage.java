package junitcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpamPage extends BasePage {

	@FindBy(xpath = ".//span[@class='b-nav__item__text'] [text() = 'Спам']")
	WebElement spamLeftMenuButton;
	
	@FindBy(xpath= ".//*[@class='js-txt _js-title notify-message__title__text notify-message__title__text_ok']")
	WebElement outOfSpamMessage;

	@FindBy(xpath = "(.//*[@class='b-checkbox__box'])[36]")
	WebElement latterCheckboxInSpam;

	@FindBy(xpath = "(.//*[text()='Не спам'])[2]")
	WebElement notSpamButton;
	
	public SpamPage() {
		PageFactory.initElements(this.getDriver(), this);
	}
	
	public void openSpamMenu() {
		spamLeftMenuButton.click();
	}

	public void checkSpamLatterCheckbox() {
		latterCheckboxInSpam.click();
	}

	public void clickNotSpamButton() {
		notSpamButton.click();
	}
	public void movedFromSpamMessage () {
		outOfSpamMessage.isDisplayed();
	}
}
