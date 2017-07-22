package com.fourstay.utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserM extends Base {


	public static void verifyText(String text){
		
		if(text.isEmpty()){
			fail("Empty text was passed to VerifyText method");
		}
				
		try{
		  assertTrue("Text is not displayed: "+text,
			driver.findElement(By.xpath("//*[.='" +text+ "']")).isDisplayed());
		}catch(Exception e){
			fail("Text is not displayed: "+text+"->Element not found");
		}	
	}
	
	public static void verifyPartialText(String text){
			
			if(text.isEmpty()){
				fail("Empty text was passed to verifyPartialText method");
			}
				
			try{
				String xpath="//*[contains(text(),'"+text+"')]";
			
				waitFor(By.xpath(xpath));
				
				assertTrue("Partial text is not displayed: "+text,
					driver.findElement(By.xpath(xpath)).isDisplayed());
			}catch(Exception e){
				fail("Partial text is not displayed: "+text+"->Element not found");
			}	
		}
	
	
		public static void waitFor(By locator){		
			 WebDriverWait wait=new WebDriverWait(driver,5);
			 ExpectedCondition<WebElement>con =ExpectedConditions.visibilityOfElementLocated(locator);
			 wait.until(con);
		}
		
	}
