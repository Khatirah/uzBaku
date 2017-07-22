package com.fourstay.utilities;

public class TestInputsM {

/*this is a regular class, not a Junit. because we wont run anything in this class, we will use its variables/methods
	
	- I dont want to instantiate/create object to read those variables /call it by class(make it static)
	- I want to make sure that these are visible for all classes in the project (public)
	- I want to make sure they cannot be modified (final)*/
	
	
	public static final String CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_PATH = "C:\\Users\\lnar\\Documents\\Libraries\\selenium-java-3.0.1\\chromedriver.exe";
	//./src/test/resources/browsers/chromedriver.exe”; - path since its in our browsers folder under resources
	public static final String BASE_URL = "http://4stay.com/";
	// base url -- will take us to homepage
	
	public static final String GUEST_FIRST_NAME="Kamila";
	public static final String GUEST_LAST_NAME="Nyla";
	public static final String GUEST_USER_ID= "khato.lalu@me.com";
	public static final String GUEST_USER_PWD= "Kamila1";
	
	public static final String HOST_FIRST_NAME="Khatirah";
	public static final String HOST_LAST_NAME="Mansori";
	public static final String HOST_USER_ID="khato.lalu@gmail.com";
	public static final String HOST_USER_PWD= "Khatirah10";
	
}
