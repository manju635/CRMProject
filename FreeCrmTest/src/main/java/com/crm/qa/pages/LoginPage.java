package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory or object repository
	@FindBy(name="username")
		WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@href='https://register.freecrm.com/register/']")
	WebElement signuplink;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;
	
	// Initialize the page objects
	public LoginPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateloginPageTitle(){
		
	return	driver.getTitle();
	
	}
	 public boolean validateCRMImage(){
		 
	return crmLogo.isDisplayed();
		 
	 }
	 public HomePage login(String un, String pwd) throws IOException{
		 
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	 }
	
	
	
	
	
	
}
