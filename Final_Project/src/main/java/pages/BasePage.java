package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


public class BasePage {

	public WebDriver driver = DriverManager.getInstance();

	public BasePage() {
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}	
}
