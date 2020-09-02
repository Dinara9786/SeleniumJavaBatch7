package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCssAndXpath {

		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
					
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://166.62.36.207/syntaxpractice/index.html");
			
			//driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("a#btn_basic_example")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[3]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[placeholder^='Please enter']")).sendKeys("Batch7 Rock!!!");
			
			driver.findElement(By.xpath("//button[text()='Show Message']")).click();
			
			driver.findElement(By.cssSelector("input[id$='sum1']")).sendKeys("57");
			
			driver.findElement(By.cssSelector("input[id$='sum2']")).sendKeys("44");
			
			driver.findElement(By.xpath("//button[text()='Get Total']")).click();
			
			Thread.sleep(3000);
			driver.close();
			

		}
	}
// get -- > will wait until the page loads
// navigate -- > will not