package Stepdefinations;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.Homepageobjects;
import Utilities.TestContextTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	//public WebDriver driver;
	public String HomepageProductName;
	TestContextTest testcontexttest;
	
	public HomePage(TestContextTest testcontexttest) {
		this.testcontexttest = testcontexttest;
		
	}
	@Given("user is on Greencart home page")
	public void user_is_on_greencart_home_page() {
	 /*System.setProperty("Webdriver.chrome", "E:/selemiumpratice/chromedriver_win32");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 testcontexttest.driver = new ChromeDriver(options);
	
	 testcontexttest.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");*/
	 
	 testcontexttest.testbase.WebDriverManager();
	}
	@When("User searched for the {string} product in the Home page")
	public void user_searched_for_the_product_in_the_home_page(String Shortname) throws InterruptedException {
		//Homepageobjects hp = new Homepageobjects( testcontexttest.driver);
		
		System.out.println("This the git commit statement");
		Homepageobjects hp = testcontexttest.pom.getHomepageObjects();
		hp.searchItem(Shortname);
		
		Thread.sleep(2000);
	    Thread.sleep(2000);

	    testcontexttest.HomepageProductName =  hp.gettingProductName().split("-")[0].trim();
	   System.out.println(HomepageProductName);
	}
	


}
