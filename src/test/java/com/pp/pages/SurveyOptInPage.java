package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;

public class SurveyOptInPage extends BasePageObject
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	public SurveyOptInPage(WebDriver driver)
	{
		super(driver);
	}
	
	boolean flag;
	
	By iwilldecidelaterbutton=By.id("ctl00_ContentPlaceHolder1_btnDecideLater");
	
	/************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return
	 * @throws
	 */
	public void verifyDecideLaterbutton() throws Exception
	{
		Log.info("Verification of decide later button");
		
		try 
		{
			flag=isElementPresent(iwilldecidelaterbutton);
			Assert.assertTrue(flag, "I will decide Later element is Missing");
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE DECIDE LATER BUTTON" +"\n verifyDecideLaterbutton" +e.getLocalizedMessage());
		}
	}
	/************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return
	 * @throws
	 */
	
	public LoginPage clickOnIwillDecideLaterButton() throws Exception
	{
		Log.info("Clicking on i will decide later button");
		
		try {
			uiDriver.findElement(iwilldecidelaterbutton).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON DECIDE LATER BUTTON" +"\n clickOnIwillDecideLaterButton" +e.getLocalizedMessage());
		}
		return new LoginPage(uiDriver);
	}
	
}
