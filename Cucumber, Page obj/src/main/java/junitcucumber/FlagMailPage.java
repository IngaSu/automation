package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlagMailPage extends BasePage {

	@FindBy(xpath = ".//div[@data-id='0']")
	private WebElement inboxLabel;

	@FindBy(xpath = "(.//*[@class='b-checkbox__box'])[7]")
	private WebElement firstlatterCheckbox;
	@FindBy(xpath = "(.//*[@class='b-checkbox__box'])[8]")
	private WebElement secondlatterCheckbox;
	@FindBy(xpath = "(.//*[@class='b-checkbox__box'])[9]")
	private WebElement thirdlatterCheckbox;

	@FindBy(xpath = ".//div[@data-title='Ещё (.)']")
	private WebElement moreButton;

	@FindBy(xpath = ".//span[text()='Пометить флажком']")
	private WebElement flagOption;
	
	@FindBy(xpath = ".//span[text()='Снять флажок']")
	private WebElement unflagOption;

	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_yes b-flag_onhover'])[1]")
	private WebElement firtsFlag;
	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_yes b-flag_onhover'])[2]")
	private WebElement secondFlag;
	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_yes b-flag_onhover'])[3]")
	private WebElement thirdFlag;

	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_onhover'])[1]")
	private WebElement firtsUnFlag;
	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_onhover'])[2]")
	private WebElement secondUnFlag;
	@FindBy(xpath = "(.//div[@class='js-hover b-flag b-flag_onhover'])[3]")
	private WebElement thirdUnFlag;
	
	public FlagMailPage() {
		PageFactory.initElements(this.getDriver(), this);
	}
	
	public void selectInbox() {
		inboxLabel.click();
	}

	public void selectThreeMails() {
		firstlatterCheckbox.click();
		secondlatterCheckbox.click();
		thirdlatterCheckbox.click();
	}

	public void flagMails() {
		moreButton.click();
		flagOption.click();
	}

	public void flagIsDispalyed() {
		firtsFlag.isDisplayed();
		secondFlag.isDisplayed();
		thirdFlag.isDisplayed();
	}
	public void unflagMails() {
		moreButton.click();
		unflagOption.click();
	}
	public void flagIsNotDispalyed() {
		firtsUnFlag.isDisplayed();
		secondUnFlag.isDisplayed();
		thirdUnFlag.isDisplayed();
	}

}
