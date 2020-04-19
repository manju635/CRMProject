package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{

   @FindBy(xpath="//td[contains(text(),'Contacts')]")
   WebElement contactlable;
   
  // @FindBy(xpath="//td[conatins(text(),'Contacts')]")
 //  WebElement usercheckbox;

// initialize the page object
   
   public ContactPage(){
	   
	   PageFactory.initElements(driver, this);
   }
    public void verifyContactLavel(){
    	
    	
    }
   

}
