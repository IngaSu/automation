package parisTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import paris.ParisSearch;

public class ParisSearchTest {
	private ParisSearch search;
	private WebDriver driver;

	@BeforeTest

	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://booking.com");
		search = new ParisSearch(driver);
	}

//	@AfterTest
//	public void afterClass() {
//		driver.close();
//	}
//	@Test
//	public void firstTestCase() {
//		search.enterCountry();
//		search.selectDates();
//		search.findResults();
//		search.filterByCheapest();
//		search.sortByRating();
//		search.waitForPopup(driver);
//		search.getPrice();
//		search.getBudgetPerNight(1);
//		search.comparePrices(1);
//	}
//	@Test
//	public void secondTestCase() {
//		search.enterCountry();
//		search.selectDates();
//		search.selectPeopleAndRooms();
//		search.findResults();
//		search.filterByExpensiveWithLowestPrie();
//		search.waitForPopup(driver);
//		System.out.println(search.getPrice());
//		System.out.println(search.getBudgetPerNight(5));
//		search.comparePrices(5);
//	}
	@Test
	public void thirdTestCase() {
	search.enterCountry();
	search.selectDates();
	search.selectPeopleAndRooms();
	search.findResults();
	search.filterByExpensiveWithLowestPrie();
	search.waitForPopup(driver);
	String winHandleBefore = driver.getWindowHandle();
	search.clickOnHotelLink();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	
	}	
}
