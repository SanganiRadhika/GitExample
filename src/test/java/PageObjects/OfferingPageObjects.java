package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferingPageObjects {
	public WebDriver driver;
	public OfferingPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//input[@type='search'] ")
	WebElement search;
	By Linktext = By.linkText("Top Deals");
	By Search = By.xpath("//input[@type='search']");
	By ProductText = By.xpath("(//tr/td)[1]");
	public void linkText()
	{
	driver.findElement(Linktext).click();
	}
	public void searchItem(String name)
	{
	driver.findElement(Search).sendKeys(name);
		//search.sendKeys(name);
	}
	public String gettingProductName()
	{
		return driver.findElement(ProductText).getText();
	}
}
