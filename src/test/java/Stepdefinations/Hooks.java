package Stepdefinations;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.TestContextTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	TestContextTest testcontexttest;
	public Hooks(TestContextTest testcontexttest) {
		this.testcontexttest = testcontexttest;
		
	}
@After
public void AfterScenario() {
	testcontexttest.testbase.WebDriverManager();
	
}
@AfterStep
public void AddScreenshot(Scenario scenario) throws IOException {
	if(scenario.isFailed()) {
		WebDriver driver = testcontexttest.testbase.WebDriverManager();
		
		File soursePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(soursePath);
		scenario.attach(fileContent,"image/png","image");
	}
	
}

}
