package com.syntax.class10;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {
	
public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver(); //upcasting // Chrome is a child and we are referring to a parent 
		//upcasting is automatically, downcasting is manually
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("txtUsername")); 
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		password.sendKeys("Hum@nhrm123");
		loginButton.click();
		
		TakesScreenshot ts =  (TakesScreenshot) driver; // we are referring to take a screenshot// this is downcasting
		File sourceFile = ts.getScreenshotAs(OutputType.FILE); // the screenshot is taken 
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/adminLogin.png")); // png is a file type// a picture extension 
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		Thread.sleep(2000);
		driver.quit();
		
	}

}
