package Stepdefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Pratice1 {
	@Given("User is on login page")
	public void User_is_on_login_page()
{
		System.out.println("Given statement got executed");
}
	 @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void User_login_into_application_with_something_and_password_something(String username, String password)
	{
		System.out.println("when statement got executed");
		System.out.println("username is   " +username);
		System.out.println("username is  "+password);
		
	}
	@Then("^Home page is displayed$")
	public void Home_page_is_displayed()
	{
		System.out.println("Then statement got executed");
	}
	 @And("^All card details are displayed \"([^\"]*)\"$")
	public void All_card_details_are_displayed_something(String Condition)
	{
		System.out.println("And statement got executed");
		System.out.println("Card details are displayed   "+Condition);
	}//Using the Datatable method
	 @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) {
		 List<List<String>>  list = data.asLists();
		String name = list.get(0).get(0);
		String password = list.get(0).get(1);
		String Address = list.get(0).get(2);
		String emailid = list.get(0).get(3);
		 System.out.println("Name of the candidate "+name);
		 System.out.println("password of the candidate "+password);
		 System.out.println("Address of the candidate "+Address);
		 System.out.println("emailid of the candidate "+emailid);
		 System.out.println("This is the Git Example from the cloning project");
		 
	 }


}
