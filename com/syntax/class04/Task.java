package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify Syntax Logo is displayed.
	
	public class Task {	
		
		public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(url);
	
	WebElement usernameBox = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	usernameBox.sendKeys("Admin");
	
	WebElement passwordBox = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	passwordBox.sendKeys("Hum@nhrm123");
	
	WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
	loginBtn.click();
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM']"));
	
	if (logo.isDisplayed()) {
		
			System.out.println("The logo is displayed");
		} else {
			System.out.println("The logo is NOT displayed");
		}
	}
}

