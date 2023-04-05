package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features",
		glue = "Stepdefinations",stepNotifications=true, tags ="@SmokeTest",dryRun=true, monochrome = true,
         plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json","junit: target/cucumbner.xml"}	
		)
//plugn: html means  format and folder in which folder we want to add 
/*if we want o execute two type test like Reg or smoke that time we need to use "or "
meanes if any smoke or reg test execute those type of tests


tags ="@SmokeTest or @smokeTest

Some times we need to execcute onlt all tests other than "smoke"

tags= "not @SmokeTest"

*some times we might be tag two tags to only one scenario that time 
*
*tags ="@SmokeTest" and "@RegTest"
*if we want to execute only one test simply we can write
*tags = "@Smoketest"
*/
//dryRun
/*dryrun executes alla the feature files if any of the feature 
file not defined it will give the step defination in the output*/


//MonoChrome
/*for the detail and neat format of the code will use monochrome
 */
 /*
  these are all cucumber attributes
  tags ="@SmokeTest",dryRun=true, monochrome = true,
  */

public class TestRunner2 {

}
