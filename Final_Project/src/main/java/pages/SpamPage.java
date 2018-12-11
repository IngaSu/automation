package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamPage extends BasePage {

	@FindBy(xpath = "(.//*[@data-name='noSpam'])[1]")
	WebElement notSpamButton;

	@FindBy(xpath = ".//span[@class='b-nav__item__text'] [text() = 'Спам']")
	WebElement spamLeftMenuButton;

	public SpamPage() {
		PageFactory.initElements(super.getDriver(), this);
	}

	public void openSpamMenu() {
		spamLeftMenuButton.click();
	}

	public void clickNotSpamButton() {
		notSpamButton.click();
	}
}
