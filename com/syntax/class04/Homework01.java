package com.syntax.class04;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
	
//	Go to http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html
//		Select any radiobutton and the age group ---> use List and loop
//		Click on get values
//		Verify the text in the page -- do not hardcode the values and compare

	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		List <WebElement> radioButton = driver.findElements(By.xpath("//input[@name='gender']"));
		for (WebElement radioBtn : radioButton) {
			if (radioBtn.isDisplayed()) {
			String femaleBtn = radioBtn.getAttribute("value");
			if (femaleBtn.equals("Female")) {
				radioBtn.click();
				Thread.sleep(2000);
				break;
			}
			}
		}
	
		
		List <WebElement> ageRadioButton = driver.findElements(By.xpath("//input[@name='ageGroup']"));
		for (WebElement ageRbutton : ageRadioButton) {
			if (ageRbutton.isDisplayed() || ageRbutton.isEnabled()) {
				String ageButton = ageRbutton.getAttribute("value");
				if(ageButton.equals("0 - 5")) {
					ageRbutton.click();
					Thread.sleep(2000);
					break;
					
				}
			}
		}
		
		WebElement getValue = driver.findElement(By.xpath("//button[@onclick='getValues();']"));
		getValue.click();
		
		WebElement checkValue = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
		if(checkValue.isDisplayed()) {
			
			System.out.println("Value female is displayed");
			
			String value = checkValue.getText();
			
			if (value.contains("Female") && value.contains("0 - 5")) {
				
				System.out.println("Displayed values are right");
			} else {
				System.out.println("Displayed values are NOT right");
			}
		}else {
			System.out.println("Values are not displayed");
		}
		Thread.sleep(2000);
	
	driver.quit();
	
	}
	}
	
