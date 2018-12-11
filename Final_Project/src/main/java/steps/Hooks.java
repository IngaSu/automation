package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.DriverManager;
import ru.yandex.qatools.allure.annotations.Attachment;

public class Hooks {
	private WebDriver driver;
	private static final String MAIN_URL = "http://mail.ru";

	@Before
	public void beforeScenario() {
		driver = DriverManager.getInstance();
		driver.get(MAIN_URL);
		
	}
	@Attachment(value = "Attachment Screenshot", type = "image/png")
    public byte[] makeScreenshot()
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
	@After
	public void afterScenario() {
		makeScreenshot();
        driver.quit();
        DriverManager.nullInstance();
	}
}
