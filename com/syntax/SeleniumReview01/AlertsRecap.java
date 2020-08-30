package com.syntax.SeleniumReview01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertsRecap extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//why to handle alerts in Seleneioum -- > Execution will stop and we will get UnhandledAlertException 
		
		// how to handle alert -- > We are using Alert interface
		
		setUp("chrome", SyntaxPrctice_URL);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Javascreipt Alerts")).click();
		
		//1. switch to the alert box
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
//		Methods used for Alerts
//		accept();
//		dismiss();
//		getText();
//		sendKeys();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}
	
	
	

}
