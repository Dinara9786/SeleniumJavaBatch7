package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("http://smartbearsoftware.com/samples/TestComplete11/WebOrders.default.aspx");
				
				driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB);
				driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB);
				
				
	
	}
	
}
