package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Testutil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	Testutil testutil;
	ContactPage contactpage;
	
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setUp() throws IOException{
		
		intitialization();
		testutil=new Testutil();
		contactpage=new ContactPage();
		loginPage  = new LoginPage();
	homepage =	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homepagetitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "CRMPRO", "Home Page Title not matched");
		
	}
	@Test(priority=2)
	public void verifyUserNameTest(){
		testutil.switchToFrame();
		Assert.assertTrue(homepage.verifyHomePageUserName());
	
	}
	
	@Test(priority=3)
	public void verifyContactLinkTest() throws IOException{
		testutil.switchToFrame();
	    contactpage =	homepage.clickOnContactsLink();
		
	}
	
	 @AfterClass
	 public void tearDown(){
		 driver.quit();
	 }
}
