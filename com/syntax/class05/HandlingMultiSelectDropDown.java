package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropDown {
	
public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";
	
	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	WebElement multiSelectDD = driver.findElement(By.id("multi-select"));
	Select select = new Select (multiSelectDD);
	
	boolean isMultiple = select.isMultiple();
	System.out.println(isMultiple); // true or false
	
	// we want to check if this particular dropdown is multiple and then i want perfom selection
	
//	if(isMultiple) {
//		select.selectByIndex(1);
//		select.selectByVisibleText("New York");
	// how i determine the visible text/ most of the time visible text  on webpage  = visible text = Florida, New Jersey
		// i want to make selection with one shot ==> for loop = all selection options
		
	List<WebElement> options = select.getOptions(); // stored everything in the list
	
	for (WebElement option: options) {
		String text = option.getText();
		select.selectByVisibleText(text);
		Thread.sleep(1000);
	}
	
	//select.deselectAll();
	select.deselectByIndex(5);
	
	}
	}


