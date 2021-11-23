package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	private WebDriver driver;
	private ElementUtils elementUtils;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver = driver;
		//elementUtils = new ElementUtils(this.driver);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getAllElements(By locator)
	{
		
		return driver.findElements(locator);
	}

	public void doSendkeys(By locator, String data)
	{
		getElement(locator).sendKeys(data);
	}
	
	public void clickButton(By locator)
	{
		getElement(locator).click();
	}
	public String getElementText(By locator)
	{
		return getElement(locator).getText();
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void clickanElement(By locator)
	{
		getElement(locator).click();
	}
	
	public boolean isElementDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	public List<String> getAllElementText(By locator)
	{
		List<String> alllabels = new ArrayList<>();
		List<WebElement> elements = getElements(locator);
		for(WebElement ele :elements)
		{
			alllabels.add(ele.getText());
		}
		return alllabels;
	}
	
	public String LoginpageTitle()
	{
		return driver.getTitle();
	}

}
