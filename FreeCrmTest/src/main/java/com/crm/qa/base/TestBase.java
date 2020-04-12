package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.Testutil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException{ //constructor
		try{
			prop=new Properties();
		FileInputStream ip =new FileInputStream("C:/Users/Yogesh Tyagi/workspace/FreeCrmTest/src/main/java/com/crm/qa/config/config.properties");
		
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	
	}
		
public static void intitialization(){
	
	String browserName=  prop.getProperty("browser");
	if(browserName.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Yogesh Tyagi/Downloads/chromedriver_win32" );
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Yogesh Tyagi/Downloads");
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.Page_Load_TimeOut,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.Implicit_Wait,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}



}


