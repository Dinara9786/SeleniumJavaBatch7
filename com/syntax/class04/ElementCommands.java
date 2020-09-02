package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
	
	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html"; 
					// we CAN STORE outside the main method 
					// make it static and in this case we do not need to create an object
	
	public static void main(String[] args) throws InterruptedException {
		
//		we store inside the webelement	// we are locating the weblement, and no actions made
//		WebElement ageRadioBtn = driver.findElement(By.xpath("//input[@value = '0-5']")); // whenever we get a title, 
//		it returns a webelement
//								// WebElement is interface // ageRadioBtn is 0-5		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		String title = driver.getTitle();
		
		WebElement ageRadioBtn = driver.findElement(By.xpath("//input[@value = '0 - 5']"));
		
		boolean isEnabled = ageRadioBtn.isEnabled();
		boolean isDisplayed = ageRadioBtn.isDisplayed();
		System.out.println(isEnabled);
		System.out.println(isDisplayed);
		
		System.out.println("Before clicking " + ageRadioBtn.isSelected());
		
		ageRadioBtn.click();
		//Thread.sleep(2000);
		System.out.println("After clicking " + ageRadioBtn.isSelected());
			
		
	}

}
