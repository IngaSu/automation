package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	public static WebDriver instance;

	public DriverManager() {
	};

	public static WebDriver getInstance() {
		if (instance == null) {
			instance = new ChromeDriver();
		}
		return instance;
	}

	public static void nullInstance() {
		instance = null;
	}
}
