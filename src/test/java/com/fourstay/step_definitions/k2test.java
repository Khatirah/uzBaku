package com.fourstay.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fourstay.utilities.TestInputsM;

public class k2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty(TestInputsM.CHROME_DRIVER, TestInputsM.CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// print out all the options 
		List <WebElement> allDepartments = driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));      
        for (WebElement department : allDepartments)
     
        {
        
        	System.out.println(department.getText());

        }

	}

}
