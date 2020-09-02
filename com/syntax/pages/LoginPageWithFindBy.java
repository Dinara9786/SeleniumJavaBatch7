package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.Utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {
	
	@FindBy(id = "txtUsername") // FindBy it is like find element. it is given in the form of annotation. FindBy replaces findElement(s)
	public WebElement userNameTextBox;
	
	@FindBy (xpath = "//input[@id = 'txtPassword']")
	public WebElement passwordTextBox;
	
	@FindBy (css ="input#btnLogin")
	public WebElement loginBtn;
	
//	@FindBy (xpath = "//table[@id='resultTable']/tbody/tr") 
//	public List<WebElement> table;
			// we do not use LIST in this class because it does not belong to the current Page
	
	public LoginPageWithFindBy () {// initialize and use method initElements to initialize elements
		PageFactory.initElements(driver, this); // this --> gives access to my current page
		// we use constructor only in page class only to initialize elements?
		
	}
}
