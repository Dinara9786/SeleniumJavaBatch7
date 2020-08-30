package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Dinara");
		driver.findElement(By.id("customer.lastName")).sendKeys("Rysalieva");
		driver.findElement(By.id("customer.address.street")).sendKeys("River Place");		
		driver.findElement(By.name("customer.address.city")).sendKeys("Washington D.C.");		
		driver.findElement(By.id("customer.address.state")).sendKeys("Maryland");		
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("219786");		
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("97-86-21-18");		
		driver.findElement(By.id("customer.ssn")).sendKeys("97-86-21-18-21");		
		driver.findElement(By.id("customer.username")).sendKeys("drysalieva");		
		driver.findElement(By.id("customer.password")).sendKeys("drysalieva21");
		driver.findElement(By.name("repeatedPassword")).sendKeys("drysalieva21");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("username")).sendKeys("drysalieva");
		driver.findElement(By.name("password")).sendKeys("drysalieva21");
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
