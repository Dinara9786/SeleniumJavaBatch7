package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
	
		public static String url = "http://166.62.36.207/syntaxpractice/basic-checkbox-demo.html";
		
		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get(url);
			
			List<WebElement> optionsCheckBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
			int options = optionsCheckBoxes.size();
			System.out.println("The number of check boxes is " + options);
			
			for (WebElement checkBoxOption : optionsCheckBoxes) {
				if(checkBoxOption.isEnabled()) {
					String checkBox = checkBoxOption.getAttribute("value");
					if (checkBox.equals("Option-2")) {
					checkBoxOption.click();
					Thread.sleep(1000);
					break;// I want to stop execution
					
				}
			}	
	}	
		}
}

