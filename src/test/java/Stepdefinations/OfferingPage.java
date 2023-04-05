package Stepdefinations;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.OfferingPageObjects;
import Utilities.TestContextTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.TestContextTest;

public class OfferingPage {
	//WebDriver driver;
	String OfferPageProductName ;
	String HomepageProductName;
	TestContextTest testcontexttest;
	public OfferingPageObjects of;
	public  OfferingPage(TestContextTest testcontexttest) {
		this.testcontexttest = testcontexttest;
		
	}
	
	@Then("User searched the {string} product name on the offer page")
	public void user_searched_the_product_name_on_the_offer_page(String offerPageShortName) throws InterruptedException {
		 //of = new OfferingPageObjects(testcontexttest.driver);
		of=  testcontexttest.pom.getOfferingPageObjects();
		of.linkText();
		SwitchToOfferPage();
		of.searchItem(offerPageShortName);
	    Thread.sleep(2000);
	   OfferPageProductName = of.gettingProductName();
	   System.out.println(OfferPageProductName);
	   
	}
	public void SwitchToOfferPage() {
		
		Set<String> sl = testcontexttest.testbase.driver.getWindowHandles();
	    Iterator<String> it =sl.iterator();
	   String  parentWindow =  it.next();
	   String ChildWindow = it.next();
	   testcontexttest.testbase.driver.switchTo().window(ChildWindow);
	}
	@Then("validate the both both product names")
	public void validate_the_both_both_product_names() {
		String PageProductName = "To";
		//OfferPageProductName
	   Assert.assertEquals(testcontexttest.HomepageProductName, PageProductName);
	   System.out.println(OfferPageProductName);
	   testcontexttest.testbase.driver.quit();
	}


}
