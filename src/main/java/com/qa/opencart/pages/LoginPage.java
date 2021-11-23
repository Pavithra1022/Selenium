package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class LoginPage {

	private By usernme = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//*[@type='submit']");
	private By forgottenpwdlink = By.xpath("//*[text()='Forgotten Password']");
	private By loginlink = By.xpath("(//li/a[text()='Login'])[2]");
	
	private WebDriver driver;
	private ElementUtils elementutils;
	
	public LoginPage(WebDriver driver)
	 {
		 this.driver =driver;
		 elementutils = new ElementUtils(this.driver);
	 }
	public String getLoginPageTitle() {
		return elementutils.LoginpageTitle();
	}
	public void loginopencart(String uname, String pswd)
	{
	elementutils.doSendkeys(usernme,uname);
	elementutils.doSendkeys(password,pswd);
	elementutils.clickanElement(login);
	}
	
	public boolean loginlinkexist()
	{
		return elementutils.isElementDisplayed(loginlink);
	}
	
	public boolean forgottenpswdlink()
	{
		return elementutils.isElementDisplayed(forgottenpwdlink);
	}
}
