package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {
	
		public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";
		
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement daysDD = driver.findElement(By.id("select-demo")); // assigning ..
		Select select = new Select (daysDD);// storing element inside constructor
		//select.selectByIndex(2);
		// please select is index 0
		// sunday is index 1
		// monday is index 2
		
//		Thread.sleep(1000);
//		select.selectByVisibleText("Wednesday");
//		Thread.sleep(1000);
//		select.selectByValue("Sunday");
//		
		// we can store it in a list
		// we can all the options is select.getOptions();
		
		List <WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		// if I want to select each and every option value 
		
		for (int i = 0; i<size; i++) {
			// I want to select by index
			select.selectByIndex(i);
			Thread.sleep(3000);
			
			// there are total 8 options including Please select + 7 days of the week
			
			
		}
		
		
		
		
		
		
		
	}

}
