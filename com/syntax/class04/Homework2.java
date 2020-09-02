package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW 2
//HRMS Application Negative Login:
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.
//166.62.36.207166.62.36.207
//Demo website with simple radio buttons to automate using Selenium webdriver

public class Homework2 {
	
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get(url);
			
			WebElement usernameBox = driver.findElement(By.xpath("//input[@name = 'txtUsername']"));
			usernameBox.sendKeys("Admin");
			
			WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
			loginBtn.click();
			
			//WebElement textPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
			
			WebElement passwordError = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
			String password = passwordError.getText();
					//if (password.equals("Password cannot be empty")) {
			
			if (passwordError.isDisplayed()) {// another option to check if displayed
						System.out.println(password + " is displayed") ;
		} else {
			System.out.println(password + " is NOT displayed");
		}	
			Thread.sleep(2000);
			driver.quit();
		}
			
	}


