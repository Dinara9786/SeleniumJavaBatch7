package com.syntax.SeleniumReview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRecap {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com/");
		
		WebElement departments = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		
		
		//SYNTAX oif id, className, name, tagName, linkText, partialLinkText
		
//		driver.findElement(By.id("value"));
//		driver.findElement(By.className("value"));
//		driver.findElement(By.name("value"));
//		driver.findElement(By.tagName("value"));
//		driver.findElement(By.linkText("text"));
//		driver.findElement(By.partialLinkText("partial link text"));
		
		departments.click();
		
		Thread.sleep(2000);
		
		//driver.close();// close tab
		driver.quit(); //close browser
		
		
	
	
}
}
