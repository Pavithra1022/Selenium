package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.Driveractory;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.ConstantUtils;

public class basetest {
	
	public Driveractory driverFactory;
	public WebDriver driver;
	public LoginPage loginpage;
	public Properties prop;
	
	@BeforeTest
	public void setup() {
		driverFactory = new Driveractory();
		driver = driverFactory.init_driver();
		prop = driverFactory.init_prop();
		loginpage =new LoginPage(driver);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}

}
