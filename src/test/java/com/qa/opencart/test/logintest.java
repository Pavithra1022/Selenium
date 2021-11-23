package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.utils.ConstantUtils;


public class logintest  extends basetest{
	
	@Test
	public void loginPageTitleTest() {
		
		String LoginPageTitle=loginpage.getLoginPageTitle();
		System.out.println("LogiPageTitle isn"+LoginPageTitle);
		Assert.assertEquals(LoginPageTitle, ConstantUtils.LOGIN_PAGE_TITLE);
		
	}
	
	@Test
	public void forgottenpswdLinkTest()
	{
		Assert.assertTrue(loginpage.forgottenpswdlink());
	}
	@Test
	public void loginLinkTest() {
		Assert.assertTrue(loginpage.loginlinkexist());
	}
	
	@Test
	public void LoginAppTest()
	{
		loginpage.loginopencart(prop.getProperty("username"),prop.getProperty("password"));
	}

}
