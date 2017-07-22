package com.fourstay.step_definitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fourstay.pages.HomePageM;
import com.fourstay.utilities.Base;
import com.fourstay.utilities.UserModel;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class HomePageStepDefs extends Base {

	HomePageM homePage = new HomePageM();

	@When("^I click on the beds dropdown list$")
	public void i_click_on_the_beds_dropdown_list() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.bedOptions.click();
	}

	@Then("^I should see the following dep options:$")
	public void i_should_see_the_following_dep_options(List<String> options) throws Throwable {

		 String css = "#theoption > li";
		 List<WebElement> elList=driver.findElements(By.cssSelector(css));

		//List<WebElement> elList = driver.findElements(By.xpath("//*[@id='themates']"));

		ArrayList<String> actualOption = new ArrayList<String>();
		// get the text from each element and save in the string list
		for (WebElement element : elList) {
			actualOption.add(element.getText());
		}

		for (int i = 0; i < options.size(); i++) {
			assertEquals(options.get(i), actualOption.get(i));
		}
	}


@When("^I enter user information:$")
public void i_enter_user_information(List<UserModel> users) throws Throwable {
   
	
	for (UserModel user: users){
		System.out.println("First name:"+ user.getFirstName());
		System.out.println("Last name: "+ user.getLastName());
		System.out.println("Email: "+ user.getEmail());
		System.out.println("Password: "+ user.getPassword());
		
	}
	
	
	
	
	
	
	
	// Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

	
	
}

// Write code here that turns the phrase above into concrete actions
// For automatic transformation, change DataTable to one of
// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
// E,K,V must be a scalar (String, Integer, Date, enum etc)
