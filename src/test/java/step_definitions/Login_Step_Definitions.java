package step_definitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SigninPage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class Login_Step_Definitions {
	SigninPage signinPage = new SigninPage();
	String email;

@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
//	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//	new HomePage().signin.click();
	System.out.println("am on first step def ");
}

@When("the user logs in using username {string} and password {string}")
public void the_user_logs_in_using_username_and_password(String username, String password) {
	 signinPage.loginEmail.sendKeys(username);
	    signinPage.password.sendKeys(password);
	    signinPage.submitLogin.click();
}

@Then("users full name {string} {string} should be displayed")
public void users_full_name_should_be_displayed(String firstName, String lastName) {
//	 String expected = firstName + " " + lastName;
//	    String actual = new MyAccountPage().fullName.getText();
//	    assertEquals(expected, actual);
}

	
	
	
//	SigninPage signinPage = new SigninPage();
//	String email;
//	
//	
//	@Given("the user is on the login page")
//	public void the_user_is_on_the_login_page() {
//	   
//	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//	    // go to login page
//	    new HomePage().signin.click();
//	}
//
//	@When("I login using username {string} and password {string}")
//	public void i_login_using_username_and_password(String username, String password) {
//	
//	    signinPage.loginEmail.sendKeys(username);
//	    signinPage.password.sendKeys(password);
//	    signinPage.submitLogin.click();
//	}
//
//	@Then("users full name {string} {string} should be displayed")
//	public void users_full_name_should_be_displayed(String firstName, String lastName) {
//	  
//	    String expected = firstName + " " + lastName;
//	    String actual = new MyAccountPage().fullName.getText();
//	    assertEquals(expected, actual);
//	}


	
	
	
	
}
