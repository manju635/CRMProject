package com.crm.qa.util;

import java.io.IOException;

import com.crm.qa.base.TestBase;

public class Testutil extends TestBase {
	
	public Testutil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long Page_Load_TimeOut=30;
	public static long Implicit_Wait=20;
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
		
	}

}
