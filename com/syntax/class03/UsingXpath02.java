package com.syntax.class03;

import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		
		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']")).sendKeys("Tester");
		
		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$password']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@id='ctl00_logout']")).click();
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();// another way using text()
		
		//driver.quit();	
	}
}
