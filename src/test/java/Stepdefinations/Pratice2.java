package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Pratice2 {
	
	/*some if we execute different type of pre requisite to every scenario that  time we need Hooks concept in cuccumber
	@Before(tagname)
	@After(tagname)
	*/

	@Given("User on login page")
	public void User_on_login_page()
{
		System.out.println("Given statement got executed");
}
	@When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String arg1, String arg2) {
		System.out.println(arg1);
		System.out.println(arg2);
	}
		@Then("^page is displayed$")
		public void page_is_displayed()
		{
			System.out.println("Then statement got executed");
		}
		 @And("^card details are displayed \"([^\"]*)\"$")
		public void card_details_are_displayed_something(String Condition)
		{
			System.out.println("And statement got executed");
			System.out.println("Card details are displayed   "+Condition);
}
		 @Given("^Validate the browser$")
		    public void validate_the_browser() throws Throwable {
			 System.out.println("Validated the browser");
		      
		    }

		    @When("^browser is triggered$")
		    public void browser_is_triggered() throws Throwable {
		    	System.out.println("Browser got Triggered");
		        
		    }

		    @Then("^Check if browser is started$")
		    public void check_if_browbser_is_started() throws Throwable {
		    	System.out.println("Browser got Started");
		       
		    }

}
