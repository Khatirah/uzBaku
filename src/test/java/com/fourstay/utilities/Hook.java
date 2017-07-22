package com.fourstay.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fourstay.pages.HomePageM;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	// encapsulation -- getters n setters
	// if driver is null = it means theres no active driver

	private static WebDriver driver;

	@Before // it will run for each scenario
	public void setDriver() {

		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lnar\\Documents\\Libraries\\selenium-java-3.0.1\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // upto//
																				// 15//
																				// seconds
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		}

		Base.driver = driver; // its not good to extend hook class(@before
								// @after class), this is why we are assigning
								// base.driver
		// here we are assigning the driver from Base class to the driver here,
		// so its all the same driver

	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void tearDown(Scenario scenario) { // it will ask to import scenario
												// from cucumber
		// take a screenshot if scenario failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);// downcasting
			scenario.embed(screenshot, "image/png");
		}
		
		if (driver!=null){
		driver.quit();
	}

}
}
