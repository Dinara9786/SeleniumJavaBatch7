package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='btn_inter_example']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Form with Validations']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name^='first_name']")).sendKeys("Dinara");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Rysalieva");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dsr@gmail.com");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("(929)288-8888");
		driver.findElement(By.cssSelector("input[name='address']")).sendKeys("1280 East, Apt 6");
		driver.findElement(By.cssSelector("input[data-bv-field='city']")).sendKeys("Brooklyn");
		//driver.findElement(By.cssSelector("input[data-bv-field='state']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("11230");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.dsr.org");
		driver.findElement(By.cssSelector("textarea")).sendKeys("This is Syntax project");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
