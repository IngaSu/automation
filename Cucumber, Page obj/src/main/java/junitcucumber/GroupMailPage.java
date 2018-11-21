package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupMailPage extends BasePage {

	@FindBy (xpath="(.//*[text()='Написать письмо'])[1]")
	WebElement composeLetterButton;
	
	@FindBy (xpath="(.//*[@data-original-name='To'])[1]")
	WebElement receiverField;
	
	@FindBy (xpath = "(.//*[@data-original-name='CC'])[1]")
	WebElement ccField;
	
	@FindBy (xpath = ".//*[@name='Subject']")
	WebElement subjectField;
	
	@FindBy (xpath = ".//*[@class='composeEditorFrame']")
	WebElement textField;
	
	@FindBy (xpath = "(.//*[text()='Отправить'])[1]")
	WebElement sendButton;
	
	@FindBy (xpath = ".//*[@class='message-sent__title']")
	WebElement sentMessage;
	
	public GroupMailPage() {
		PageFactory.initElements(this.getDriver(), this);
	}
	
	public void composeLetter () {
		composeLetterButton.click();
	}
	public void enterRecipients () {
		receiverField.sendKeys("inga.supranovich@gmail.com");
	}
	public void enterCCRecipients () {
		ccField.sendKeys("inha@bk.ru");
	}
	public void enterSubject () {
		subjectField.sendKeys("Automation test subject");	
	}
	public void enterLetterText () {
		textField.sendKeys("This is my first automation test message");	
	}
	public void sendLetter () {
		sendButton.click();
	}
	public void sentMessageLetter () {
		sentMessage.isDisplayed();
	}

}
