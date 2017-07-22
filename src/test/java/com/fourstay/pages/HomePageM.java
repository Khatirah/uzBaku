package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Base;

public class HomePageM extends Base {
// extends -- inheritting from parent class (Base)
	// @before @after classes do not extend

	// this is the POM page, where we store our elements / or methods
	
	public HomePageM(){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//img[@alt='HStay Logo']")
	public WebElement fourStayLogo;
	
	@FindBy(xpath="//li[@data-target='#modal-login']")
	public WebElement loginLink;
	
	@FindBy(id="btn-login")
	public WebElement loginButton;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(id="iLocName")
	public WebElement school;
	
	@FindBy(name="move_in")
	public WebElement moveinDate;
	
	@FindBy(name="move_out")
	public WebElement moveoutDate;
	
	@FindBy(name="no_of_beds")
	public WebElement numberofBeds;
	
	@FindBy(id="search")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[.='Something went wrong']")
	public WebElement wentWrongError;
	
	
	@FindBy(id = "themates")
	public WebElement bedOptions;
	
	
	
	
	
	
	
	public void enterCredentials(String emailVal, String passwordVal){
		email.sendKeys(emailVal);
		password.sendKeys(passwordVal);
	}
	
	public void login(String emailVal, String passwordVal){
		email.sendKeys(emailVal);
		
		password.sendKeys(passwordVal);
		loginButton.click();
	}
	
	public boolean loginButtonEnabled(){
		return loginButton.isEnabled();
	}
	
	//I'm changing homepage file.
}
