package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	
	public static void main(String[] args) {
		
		//1. to set a system property in which I will specified key and value
		
		// use this path for Chrome from mac (/ 1 slash  and no .exe extension)
		
		// for windows we have to add .exe
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/drysa/eclipse-workspace/SeleniumJavaBatch7/drivers/chromedriver.exe");
		
		// 2. we create an object of webdriver type
		
		WebDriver driver =new ChromeDriver();
		
		//3. navigate to Syntax application. Anytime navigating to website we use .get
		
		driver.get("https://syntaxtechs.com");
		
	}

}
