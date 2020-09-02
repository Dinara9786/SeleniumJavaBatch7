package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='btn_inter_example']")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Input Form with Validations']")).click();
		
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Dinara");
		
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Rysalieva");
		
		driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("adb@adb.org");
		
		driver.findElement(By.cssSelector("input[placeholder='(845)555-1212']")).sendKeys("(654)321-1222");
		
		driver.findElement(By.cssSelector("input[data-bv-field='address']")).sendKeys("River Place");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Washington, D.C.");
				
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("11177");
		
		driver.findElement(By.xpath("//input[@placeholder='Website or domain name']")).sendKeys("www.syntax.com");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys("Syntax delivers excellent training.");
		
		driver.findElement(By.xpath("//button[@onclick='resetForm();']")).click();
		
	}

}