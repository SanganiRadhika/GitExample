package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
public WebDriver driver;
	public WebDriver WebDriverManager() {
		if(driver==null) {
		System.setProperty("Webdriver.chrome", "E:/selemiumpratice/chromedriver_win32");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}
}
