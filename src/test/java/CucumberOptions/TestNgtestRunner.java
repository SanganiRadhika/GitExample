package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/test/resources/features",
		glue = "Stepdefinations"
		)

public class TestNgtestRunner extends AbstractTestNGCucumberTests {

}
