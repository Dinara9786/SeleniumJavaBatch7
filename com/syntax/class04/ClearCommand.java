package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {
	
	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement userNameTextBox = driver.findElement(By.id("ctl00_MainContent_username"));
		userNameTextBox.sendKeys("Tester");// we should give meaningful name for every method and for every variable
		
		WebElement passwordTextBox = driver.findElement(By.name("ctl00$MainContent$password"));
		passwordTextBox.sendKeys("test");
		
		userNameTextBox.clear();
		passwordTextBox.clear();
		Thread.sleep(2000);

//		WebElement loginButton = driver.findElement(By.className("button"));
//		loginButton.click();
//		//driver.findElement(By.name("ctl00$MainContent$login_button")).click();
//		Thread.sleep(2000);
//		
//		//passwordTextBox.clear();
//		//userNameTextBox.clear();
//		//driver.findElement(By.name("ctl00$MainContent$login_button")).click();
//		WebElement logo = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
//		
//		if(logo.isDisplayed()) {
//			String logoText = logo.getText();
//			if (logoText.equals("Web Orders")) {
//				System.out.println("This is the right logo");
//			}else {
//				System.out.println("This is the wrong logo");
			}
		
}

