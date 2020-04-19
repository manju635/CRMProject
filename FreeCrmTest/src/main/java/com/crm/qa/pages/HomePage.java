package com.crm.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {



	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement username;
	
	@FindBy(xpath = "//a[@title='Contacts']")
	WebElement contactlink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement deallink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks']")
	WebElement tasklink;
	
	public HomePage() throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle(){
		return  driver.getTitle();
	}
	
	public boolean verifyHomePageUserName(){
	return	username.isDisplayed();
		
	}
	public ContactPage clickOnContactsLink() throws IOException{
		
		contactlink.click();
		return new ContactPage();
	}
	
 public DealPage clickOnDealLink() throws IOException{
		
	deallink.click();
		return new DealPage();
	}

 public TaskPage clickOnDealLink1() throws IOException{
	
	tasklink.click();
		return new TaskPage();
	
	}




 
}
