package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
//		String title = driver.getTitle();
//		System.out.println(title);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");// we cannot use clas
		//driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		driver.findElement(By.className("button")).click(); // by class name possible too in this case
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Web Orders";
		
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
				System.out.println("This is the right title"); 
		} else {
			System.out.println("This is the wrong title");
		}
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click(); // here we go by linkText
		
		//driver.findElement(By.id("ctl00_logout")).click();
//		Thread.sleep(3000);
		driver.quit();
		}
	
	}
	

// partialLinkText = refer to link?




