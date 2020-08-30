package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // driver launches the website?
		
		driver.get("http://google.com");
		Thread.sleep(5000);// stops for 5 seconds
	//	driver.navigate().to("http://facebook.com");// the second is overriding the first one
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
//		driver.manage().window().fullscreen();
		driver.close(); // will close a tab
//		driver.quit();// quit will exit the browser
		
		// 1 object for 1 browser
		
		
	}

}
