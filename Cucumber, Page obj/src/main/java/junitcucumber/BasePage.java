package junitcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BasePage {
	private WebDriver driver = DriverManager.getInstance();
	public BasePage() {
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
