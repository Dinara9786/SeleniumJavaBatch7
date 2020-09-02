package com.syntax.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	/**
	 * this method navigates to hrms website
	 * @return <-- driver
	 * @author Syntax
	 */
		// we should use javadoc on top of each method
	
	
	public static WebDriver setUp() { 
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// we need to create an Object
		
		driver = new ChromeDriver(); // will launch the browser, it will open the blank browser 
		driver.manage().window().maximize();
		
		// we will add wait implicit, because implicit is our global and we use only once and applies to the whole session
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // we will add wait implicit, because implicit is our global 
																		//and we use only once and applies to the whole session
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
	    
		return driver;
	}
	
	/**
	 * this method will quit the browser
	 */
	public static void tearDown () {
		
		if(driver!= null) { // only if our browser is open (not null) we quit the browser
		driver.quit();
		
		
		}		
				
	}

}
