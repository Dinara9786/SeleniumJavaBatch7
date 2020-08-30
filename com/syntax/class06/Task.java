package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
//	go to http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
//		verify the logo is displayed on the first frame
//		verify the button is enabled on the second frame
	
	public static String url = " http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	driver.switchTo().frame("FrameOne"); // whenever we switch to frame we just put the name in quotes
	WebElement logo = driver.findElement(By.id("hide"));
	boolean isLogoDisplayed = logo.isDisplayed();
	System.out.println("Is Logo Displayed? " + isLogoDisplayed);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	WebElement enrollTodayButton = driver.findElement(By.cssSelector("a[class = 'enroll-btn']"));
	boolean isButtonEnabled = enrollTodayButton.isEnabled();
	System.out.println("Is enroll today button enabled? " + isButtonEnabled);
	
	
	
	
//	driver.switchTo().frame("FrameOne");
//	WebElement logo = driver.findElement(By.xpath("//img[@src='img/Syntax.png']"));
//	System.out.println(logo.isDisplayed() ? "Logo Displayed" : "Logo not Displayed");
//	driver.switchTo().defaultContent();
//	driver.switchTo().frame(1);
//	WebElement button = driver.findElement(By.xpath("//a[@class='enroll-btn']"));
//	System.out.println(button.isEnabled() ? "Button is Enabled" : "Button is Disabled");

}
}
