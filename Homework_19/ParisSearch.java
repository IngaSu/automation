package paris;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParisSearch {

	private boolean result1 = true;

	public ParisSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//input[@name='ss']")
	private WebElement searchCountry;

	@FindBy(xpath = "(.//button[@role='button'])[1]")
	private WebElement clickOnCalendar;

	@FindBy(xpath = ".//td[@class='bui-calendar__date bui-calendar__date--today']")
	private WebElement selectCurrentDateAsArrival;

	@FindBy(xpath = "(.//td[@class='bui-calendar__date'])[3]")
	private WebElement selectDepatrureDate;

	@FindBy(xpath = ".//button[@class='sb-searchbox__button  ']")
	private WebElement clickCheckPrices;

	@FindBy(xpath = "(.//*[@data-name='pri'])[1]")
	private WebElement checkCheapest;

	@FindBy(xpath = ".//h2[contains(text(), 'Париж: найден')]")
	private WebElement checkText;

	@FindBy(xpath = ".//a[@data-category='review_score_and_price']")
	private WebElement sortByRating;

	@FindBy(xpath = "//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/div[2]/div")
	private WebElement findPrice;

	@FindBy(xpath = "//*[@id=\"filter_price\"]/div[2]/a[1]")
	private WebElement firstBudgetPerNight;

	@FindBy(xpath = "//*[@id=\"filter_price\"]/div[2]/a[2]")
	private WebElement secondBudgetPerNight;

	@FindBy(xpath = "//*[@id=\"filter_price\"]/div[2]/a[3]")
	private WebElement thirdBudgetPerNight;

	@FindBy(xpath = "//*[@id=\"filter_price\"]/div[2]/a[4]")
	private WebElement fourthBudgetPerNight;

	@FindBy(xpath = "//*[@id=\"filter_price\"]/div[2]/a[5]")
	private WebElement fifthBudgetPerNight;

	@FindBy(xpath = ".//label[@id='xp__guests__toggle']")
	private WebElement peopleAndRooms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]")
	private WebElement rooms;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/button[2]")
	private WebElement adults;

	@FindBy(xpath = "(.//*[@data-name='pri'])[5]")
	private WebElement checkExpensive;

	@FindBy(xpath = ".//a[@data-category='price']")
	private WebElement lowestPrice;
	
	@FindBy(xpath = "(.//a[@class='hotel_name_link url'])[1]")
	private WebElement hotelLink;

	public void enterCountry() {
		searchCountry.sendKeys("Paris");
	}

	public void selectDates() {
		clickOnCalendar.click();
		selectCurrentDateAsArrival.click();
		selectDepatrureDate.click();
	}

	public void findResults() {
		clickCheckPrices.submit();
	}

	public void filterByCheapest() {
		checkCheapest.click();
		String numberOfHotels = checkText.getText();
		if (numberOfHotels.equals("0")) {
			System.out.println("No hotels found");
		} else {
			System.out.println(numberOfHotels);
		}
	}

	public void sortByRating() {
		sortByRating.click();
	}

	public Integer getPrice() {
		return Integer.parseInt(findPrice.getText().substring(32, 42).replaceAll("\\D", ""));
	}

	public Integer getBudgetPerNight(int id) {
		if (id == 1) {
			return Integer.parseInt(firstBudgetPerNight.getText().replaceAll("\\D", ""));
		} else if (id == 2) {
			return Integer.parseInt(secondBudgetPerNight.getText().replaceAll("\\D", ""));
		} else if (id == 3) {
			return Integer.parseInt(thirdBudgetPerNight.getText().replaceAll("\\D", ""));
		} else if (id == 4) {
			return Integer.parseInt(fourthBudgetPerNight.getText().replaceAll("\\D", ""));
		} 
		else if (id == 5) {
			return Integer.parseInt(fifthBudgetPerNight.getText().replaceAll("\\D", ""));
		}
		return 0;
	}

	public void comparePrices(int id) {
		if (getPrice() <= getBudgetPerNight(id) * 3) {
			System.out.println("The price of rated hotel is within specified budget boudariers");
		}
	}

	public void selectPeopleAndRooms() {
		peopleAndRooms.click();
		rooms.click();
		adults.click();
		adults.click();
	}

	public void filterByExpensiveWithLowestPrie() {
		checkExpensive.click();
		lowestPrice.click();
	}
	public void clickOnHotelLink() {
		hotelLink.click();
	}

	public void waitForPopup(WebDriver driver) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
	}

}
