package com.fourstay.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.fourstay.pages.HomePageM;
import com.fourstay.pages.SearchResultsPage;
import com.fourstay.utilities.Base;
import com.fourstay.utilities.BrowserM;
import com.fourstay.utilities.TestInputsM;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FourStayLogin_Steps extends Base{

	HomePageM homePage = new HomePageM();
	SearchResultsPage searchResultsPage = new SearchResultsPage();


	@Given("^I am on FourStay homepage$")
	public void i_am_on_FourStay_homepage() throws Throwable {
		driver.get(TestInputsM.BASE_URL);
		try {
			assertTrue("Home Page was not loaded", homePage.fourStayLogo.isDisplayed());
		} catch (Exception e) {
			fail("Home Page was not loaded");
		}

	}

	@Then("^I click Login Link$")
	public void i_click_Login_Link() throws Throwable {
		homePage.loginLink.click();
	}

	@Then("^I enter \"([^\"]*)\" credentials$") // regular expression
	public void i_enter_credentials(String role) throws Throwable {

		String userID ="";
		String pwd ="";

		if (role.equalsIgnoreCase("guest")) {
			userID = TestInputsM.GUEST_USER_ID;
			pwd = TestInputsM.GUEST_USER_PWD;
		} else if (role.equalsIgnoreCase("host")) {
			userID = TestInputsM.HOST_USER_ID;
			pwd = TestInputsM.HOST_USER_PWD;
		} else {
			fail("User role is not valid: " + role);

		}

		homePage.email.sendKeys(userID);
		//Thread.sleep(2000);
		homePage.password.sendKeys(pwd);
		//Thread.sleep(2000);
		homePage.loginButton.click();

	}



	@Then("^I should see \"([^\"]*)\" message$")
	public void i_should_see_message(String text) throws Throwable {
		BrowserM.verifyPartialText(text);
	}

//	@Then("^I should see Listing Reserved by message$")
//	public void i_should_see_Listing_Reserved_by_message() throws Throwable {
//		
//		//BrowserM.verifyText("Listing Reserved by "+TestInputsM.GUEST_FIRST_NAME+" "+TestInputsM.GUEST_LAST_NAME);	
//	}
}
