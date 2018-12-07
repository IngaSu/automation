package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
	public static WebDriver instance;

	private DriverManager() {
	};

	public static WebDriver getInstance() {
		if (instance == null) {
			instance = new ChromeDriver();
		}
		return instance;
	}
}
