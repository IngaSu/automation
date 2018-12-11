package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import xmlParser.XMLRunner;

public class ComposeMailPage extends BasePage {
	
	@FindBy(xpath = "(.//a[@data-bem=\"b-toolbar__btn\"])[1]")
	private WebElement createLetterButton;

	@FindBy(xpath = ".//textarea[@tabindex=\"4\"]")
	private WebElement recipientField;

	@FindBy(xpath = ".//input[@tabindex=\"7\"]")
	private WebElement themeField;

	@FindBy(xpath = ".//*[@id='tinymce']")
	private WebElement textField;

	@FindBy(xpath = "(.//div[@data-name=\"send\"])[1]")
	private WebElement sendLetterButton;
	
	@FindBy(xpath = ".//*[@cnt_sb='964649']")
	private WebElement canvas;

	public ComposeMailPage() {
		PageFactory.initElements(super.getDriver(), this);
	}
	
	public void createGroupLetter(WebDriver driver, String text, String... data) {
		createLetterButton.click();
		for (int i = 0; i < data.length; i++) {
			recipientField.sendKeys(data[i] + " ");
		}
		themeField.sendKeys("Test message for the group");
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe")));
		textField.sendKeys(text);	
		driver.switchTo().defaultContent();
		sendLetterButton.click();
	}
	public void waitForCanvas() {
		canvas.isDisplayed();
	}
}
