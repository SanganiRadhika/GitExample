package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepageobjects {
	By Search = By.xpath("//input[@type='search']");
	By ProductText = By.xpath("//h4[@class='product-name']");
	
	
	public WebDriver driver;
	public Homepageobjects(WebDriver driver) {
		this.driver = driver;
	}
public void searchItem(String name)
	{
	driver.findElement(Search).sendKeys(name);
	}
public String gettingProductName()
{
	return driver.findElement(ProductText).getText();
}
	

}
