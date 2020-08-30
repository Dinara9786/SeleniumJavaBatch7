package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
							// id is attribute "email" is attribute value	
		driver.findElement(By.id("email")).sendKeys("syntax"); // we located element inside Facebook page
		driver.findElement(By.name("pass")).sendKeys ("syntax123");
		driver.findElement(By.id("loginbutton")).click(); // when we need just to click
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click(); // case sensitive
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
