package Utilities;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextTest {
	public static WebDriver driver;
	public static String  OfferPageProductName;
	public static String HomepageProductName;
	public PageObjectManager pom;
	public TestBase testbase;
	public TestContextTest() {
		testbase = new TestBase();
		pom = new PageObjectManager(testbase.WebDriverManager());
		
	}
	
}
