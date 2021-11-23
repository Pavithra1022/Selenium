package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class AccountPage {

	private By accountpageheader = By.xpath("");
	private By accountpagelink = By.xpath("");
	private By accountpagefooter = By.xpath("");
	private By logoutlink = By.xpath("");
	private By SearchText = By.xpath("");
	private By SearchButton = By.xpath("");
	
	WebDriver driver;
	ElementUtils elementutils;
	
	public AccountPage()
	{
		 driver=this.driver;
		elementutils = new ElementUtils(this.driver);
			
	}
	
	public List<String> getAccountPageHeader()
	{
		return elementutils.getAllElementText(accountpageheader);
	}
	public List<String> getAccountPagefooterlist()
	{
		return elementutils.getAllElementText(SearchButton);
	}
	
	public List<String> getAccountPageList()
	{
		return elementutils.getAllElementText(SearchButton);
	}
}
