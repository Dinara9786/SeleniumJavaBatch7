package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();

				driver.get("http://jqueryui.com/droppable");
				
				driver.switchTo().frame(0);
				
				WebElement draggable = driver.findElement(By.id("draggable"));
				
				WebElement droppable = driver.findElement(By.id("droppable"));
				
				// we need to switch frames 3 methods
//				by index
//				by webelement
//				by name or id (but no class name)
				
				Actions action = new Actions(driver);
				
				action.clickAndHold(draggable).moveToElement(droppable).release().build().perform(); // building all the methods chained
				
				action.dragAndDrop(draggable, droppable).perform();
				Thread.sleep(2000);
				
				// how do I refresh Selenium Script
				
				driver.navigate().refresh();
				
				
				
				
				
				
				
				
				
	
}
}
