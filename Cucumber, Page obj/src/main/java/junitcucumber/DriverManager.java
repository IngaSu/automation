package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	public static WebDriver instance;
	  private DriverManager() {};

	  public static WebDriver getInstance() {
	    if (instance == null) {
	      instance = new ChromeDriver();
	    }
	    return instance;
	  }
	}
