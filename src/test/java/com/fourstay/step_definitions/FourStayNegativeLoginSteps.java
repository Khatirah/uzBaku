package com.fourstay.step_definitions;

import com.fourstay.pages.HomePageM;
import com.fourstay.utilities.Base;
import com.fourstay.utilities.BrowserM;
import com.fourstay.utilities.TestInputsM;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FourStayNegativeLoginSteps extends Base {

	
	HomePageM homePage = new HomePageM();
	
	@When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_enter_invalid_email_and_valid_password(String email, String password) throws Throwable {
	   // \"([^\"]*)\ - regular expression
		homePage.enterCredentials(email, password); // methods is being called from homePage class
		
	}

	@Then("^Login button should be disabled$")
	public void login_button_disabled() throws Throwable {
		assertFalse("Login Button is Enabled",homePage.loginButtonEnabled());
	}
	
	

@When("^I login with email \"([^\"]*)\" and password \"([^\"]*)\"$")
public void i_login_with_email_and_password(String email, String password) throws Throwable {

	homePage.email.sendKeys(email);
	Thread.sleep(2000);
	homePage.password.sendKeys(password);
	Thread.sleep(2000);
    homePage.loginButton.click();
}
}
