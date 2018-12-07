package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static final WebDriver DEFAULT_FF = new FirefoxDriver();
	
	public static WebDriver getDriver(String name){
	WebDriver driver = null;
	switch (name) {
    case "FIREFOX": return new FirefoxDriver();
    case "CHROME": return new ChromeDriver();
    case "IE": return new InternetExplorerDriver();
    default: return DEFAULT_FF;
}	
}