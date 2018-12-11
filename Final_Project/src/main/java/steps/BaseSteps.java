package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.DriverManager;
import ru.yandex.qatools.allure.annotations.Attachment;

public class BaseSteps {

	protected WebDriver driver = DriverManager.getInstance();

	@Attachment(value = "Attachment Screenshot", type = "image/png")
	public byte[] makeScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
