package task_18_part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingPart1 {

	public static void main(String[] args) {
		String exePath = "C:\\chrome_Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://booking.com");
		WebElement searchline = driver.findElement(By.xpath(".//input[@name=\"ss\"]"));
		searchline.sendKeys("Москва");	
		WebElement clickOnCalendar = driver.findElement(By.xpath(".//div[@data-calendar2-type='checkin']"));
		clickOnCalendar.click();
		WebElement selectDepatrureDate = driver.findElement(By.xpath(".//td[@class='bui-calendar__date']"));
		selectDepatrureDate.click();
		WebElement selectArrivalDate = driver.findElement(By.xpath(".//td[@class='bui-calendar__date']"));
		selectArrivalDate.click();
		WebElement clickCheckPrices = driver.findElement(By.xpath(".//button[@class='sb-searchbox__button  ']"));
		clickCheckPrices.submit();
		WebElement checkResults = driver.findElement(By.xpath(".//h2[contains(text(), 'Москва: найдено')]"));
		driver.close();
	}

}
