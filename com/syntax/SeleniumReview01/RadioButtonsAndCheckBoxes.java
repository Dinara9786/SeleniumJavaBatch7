package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonsAndCheckBoxes extends CommonMethods {
	
	/*
	 * 1. radio uttons and check boxes
	 * 2. Dropdowns adn mutliple selections
	 * 3. Handling Alert in Selenium
	 * 4. Handling frames and windows in selenium
	 * 5. Wait in Selenium (Synchronization in Selenium)
	 */
	
	
	public static void main(String[] args) {
		
		// it is a button or buttons in which we can select only one option // single selection
		// check box -- > webelement that we can perform multiple selection // multiple selection
		// 
		
	setUp("chrome", SyntaxPrctice_URL);	
	
	// Navigate to radio button practice page
	
	driver.findElement(By.linkText("Input Forms")).click();
	driver.findElement(By.linkText("Radio Buttons Demo")).click();
	
	// how we can achieve???? what to achieve?
	
	// 1. Find the locator of requested button and click on it
	// 2. use findElements() to save all options and select requested option by iterating list
	
	// Find the locator of requested button and click on it
	
	WebElement femaleBtn = driver.findElement(By.xpath("//input[@value-='Female' and @name ='optradio']"));
	
	//System.out.println("Is female button selected : " + femaleBtn.isSelected());
	
	//Thread.sleep(2000);
	
	//femaleBtn.click();
	
	WebElement checkBtn=driver.findElement(By.id("buttoncheck"));
	checkBtn.click();
	
	//String msgText = msg.getText();
	
	if(msgText.contains("Female")) {
		System.out.println("Femal button selecton test PASS");
	} else {
		System.out.println("Femal button selecton test FAILED");
	}
	
	// 2 way -- > use findElements and save Web Elements of all options
	
	List <WebElement> genderBtns = driver.findElements(By.xpath("//input[@name='optradio']"));
	// for each loop
	
	for (WebElement btn: genderBtns) {
		btn.click();
		checkBtn.click();
		String msgText=msg.getText();
		String buttonText = btn.getAttribute("value");
		
		if (msgText.contains.(buttonText)) {
			System.out.println(buttonText+ "Selection test PASS");
		} else {
			System.out.println(buttonText+ "Selection test FAIL");
		}
		
		Thread.sleep(200);
		
	}
	
	
	
	//p[class='radiobutton']
	//p[@class='radiobutton']
	//p.radiobutton   . (dot) stands for class
	
	
	

	driver.quit();
		
		
	}
	
}
