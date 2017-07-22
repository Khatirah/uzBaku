package com.fourstay.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fourstay.utilities.TestInputsM;

public class Xpath_Css {

	public static void main(String[] args) {
		
		System.setProperty(TestInputsM.CHROME_DRIVER, TestInputsM.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.xpath("//*[@id='rentoutfrom2']")).sendKeys("05/29/2017");
		
//List<WebElement> radio = driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
		
		
//	driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).click();
	
	List<WebElement> radio = driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));

	for (int i = 0; i < radio.size(); i++) {

	WebElement local_radio = radio.get(i);
	String value = local_radio.getAttribute("option");
	System.out.println("Printing all the values:"+value);

	}
}
}