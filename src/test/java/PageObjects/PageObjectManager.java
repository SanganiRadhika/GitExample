package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public Homepageobjects hpo;
	public OfferingPageObjects opo;
	WebDriver driver;
	public PageObjectManager(WebDriver driver){
		
		this.driver = driver;
	}

	public Homepageobjects getHomepageObjects(){
		hpo = new Homepageobjects(driver);
		return hpo;
	}

	public OfferingPageObjects getOfferingPageObjects() {
		opo = new OfferingPageObjects(driver);
		return opo;
		
	}
}
