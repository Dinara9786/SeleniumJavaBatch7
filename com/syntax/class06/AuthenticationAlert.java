package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
	
public static String url = "http://test:test@abcdatabase.com/basicauth"; 
					// after double slash // type username and following : we type password and then @ sign
					//  //username:password@
	
	public static void main(String[] args) throws InterruptedException {
		
		//Interface i = new Interface();// we cannot create an object of Interface. But we can refer to Interface!!!!
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	
	
	
	}
	

}
