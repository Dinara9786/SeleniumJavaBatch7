package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlerts {
	
	public static String url = "http://www.uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {
		
		//Interface i = new Interface();// we cannot create an object of Interface. But we can refer to Interface!!!!
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();

	WebElement simpleAlertButton = driver.findElement(By.id("alert"));
	simpleAlertButton.click();
	
	Alert alert = driver.switchTo().alert();// this is SYNTAX		
	Thread.sleep(2000);
	
	// handling simple alert
	alert.accept();
	
	WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
	confirmAlertButton.click();
	Thread.sleep(5000);
	
//	Alert confirmAlert = driver.switchTo().alert(); // Syntax
//	confirmAlert.dismiss();
	
	//Alert alert = driver.switchTo().alert();
	String confirmAlertText = alert.getText();
	System.out.println(confirmAlertText); 
	
	// handling confirmation alert
	alert.dismiss();
	WebElement promtAlertButton = driver.findElement(By.id("prompt"));
	promtAlertButton.click();
	Thread.sleep(2000);
	
	alert.sendKeys("Syntax");
	Thread.sleep(5000);
	alert.accept();


	
	}

}
