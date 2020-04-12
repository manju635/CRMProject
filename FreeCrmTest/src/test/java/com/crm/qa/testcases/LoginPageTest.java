package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage ;
	HomePage homepage;
	
	public LoginPageTest() throws IOException{
		super();
	}
  
	@BeforeClass
	public void setUp() throws IOException{
		
		intitialization();
		loginPage  = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
	String title = loginPage.validateloginPageTitle();
	Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
		
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
	boolean flag = loginPage.validateCRMImage();
	Assert.assertTrue(flag);
		
		}
	
	@Test(priority=3)
	public void loginTest() throws IOException{
		homepage =	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	 @AfterClass
	 public void tearDown(){
		 driver.quit();
	 }
}
