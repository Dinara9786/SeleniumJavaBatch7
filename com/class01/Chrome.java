package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.amazon.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle(); // or syso (driver.get.currentUrl());
		System.out.println(title);        // or syso (driver.get.Title());
		
		/*
		 * 1. launch the chrome browser
		 * 2. navigate to amazon.com
		 * 3. print out the title and the url i the console
		 * 
		 * 
		 */
	}

}
