package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{

   public ContactPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//td[contains(text(),'Contacts')]")
   WebElement contactlable;
   
  // @FindBy(xpath="//td[conatins(text(),'Contacts')]")
 //  WebElement usercheckbox;

// initialize the page object
   

    public void verifyContactLavel(){
    	
    	
    }
   

}
