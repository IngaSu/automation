package task_18_part2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingPart2 {

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
		WebElement filterByRating = driver.findElement(By.xpath(".//a[@data-category='review_score_and_price']"));
		filterByRating.click();
		WebElement defineRating = driver.findElement(By.xpath("(.//div[@class='bui-review-score c-score bui-review-score--end'])[1]"));
		String valuOfRating = defineRating.getText();
		System.out.println(valuOfRating);
		}
	}
