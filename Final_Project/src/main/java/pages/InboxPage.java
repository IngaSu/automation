package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage extends BasePage {

	@FindBy(xpath = ".//div[@class='js-item-checkbox b-datalist__item__cbx' and not(ancestor::div[contains(@style,'display: none')])]")
	private List<WebElement> mailCheckBoxes;

	@FindBy(xpath = ".//div[@class='js-hover b-flag b-flag_yes b-flag_onhover']")
	private List<WebElement> flags;

	@FindBy(xpath = "(.//*[text()='Удалить'])[1]")
	private WebElement deleteButton;

	@FindBy(xpath = "(.//*[text()='В архив'])[1]")
	private WebElement archiveButton;

	@FindBy(xpath = "(.//*[text()='Спам'])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "(.//*[@data-shortcut-title='.'])[1]")
	private WebElement moreButton;

	@FindBy(xpath = ".//*[@data-name='flag_yes']")
	private WebElement flagOption;

	@FindBy(xpath = "(.//*[@data-name='flagged'])[1]")
	private WebElement filterByFlag;

	@FindBy(xpath = ".//i[@class='icon icon_info-state icon_tip-ok']")
	private WebElement okMessage;

	public InboxPage() {
		PageFactory.initElements(super.getDriver(), this);
	}

	public void markThreeLetter(int amount) {
		for (int i = 0; i < amount; i++) {
			mailCheckBoxes.get(i).click();
		}
	}

	public void deleteLetters() {
		deleteButton.click();
	}

	public void archiveLetters() {
		archiveButton.click();
	}

	public void moveToSpam() {
		spamButton.click();
	}

	public void flagMails() {
		moreButton.click();
		flagOption.click();
	}

	public void filterByFlaggedMails() {
		filterByFlag.click();
	}

	public void flagIsDispalyed(int number) {
		for (int i = 0; i < number; i++) {
			flags.get(i).isDisplayed();
		}
	}

	public void waitForOkNotification() {
		okMessage.isDisplayed();
	}
}
