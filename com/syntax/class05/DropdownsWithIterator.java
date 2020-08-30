package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsWithIterator {
	
public static String url = "http://amazon.com";
	
	public static void main(String[] args)  {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
	
	Select select = new Select(categoriesDD);
	
	List<WebElement> options = select.getOptions();
	
	// Iterator is an Interface
	System.out.println("=======using Iterator=============");
	
	Iterator <WebElement> it = options.iterator();
	while(it.hasNext()) {
		WebElement option = it.next();
		// we need to get text first
		String optionText = option.getText();
		System.out.println(optionText);
		
	}
	 
	// we try to identify different condition. we need to know if multiple or single select. isMultiple() = returns boolean
	
	boolean isMultiple = select.isMultiple();
	System.out.println(isMultiple);
		
	}
	
	}


	


