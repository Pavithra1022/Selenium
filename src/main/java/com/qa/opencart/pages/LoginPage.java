package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class LoginPage {

	private By usernme = By.id("input-email");
	private By password = By.id("input-password ");
	private By login = By.xpath("//*[@type='submit']");
	private By forgottenpwdlink = By.xpath("//*[text()='Forgotten Password']");
	
	
}
