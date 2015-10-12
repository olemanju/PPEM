package com.pp.pages;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pp.util.BasePageObject;

public class TermsAndConditionsPage extends BasePageObject
{

	public TermsAndConditionsPage(WebDriver driver) 
	{
		super(driver);
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	By TermsAndConditions= By.id("ctl00_ContentPlaceHolder1_lblFormTitle");
	By IdonotAccept=By.id("ctl00_ContentPlaceHolder1_btnDontAccept");
	
	boolean flag;
	
	/******************************************************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * 
	 */
	
	
	
	public boolean verifyTermsAndConditonsText() throws Exception
	{
		Log.info("verify Terms and conditions Text");
		
		try {
			flag=isElementPresent(TermsAndConditions);
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED VERIFYING THE TERMS AND CONDITIONS TEXT " +"\n verifyTermsAndConditonsText " +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 */
	public boolean verifyIdonotAcceptbutton() throws Exception
	{
		Log.info("Verification of i do not accept button");
		try {
			flag=isElementPresent(IdonotAccept);
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE I DO NOT ACCEPT TEXT " +"\n verifyIdonotAcceptbutton " +e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return 
	 */
	
	public LoginPage clickonIdonotAcceptButton() throws Exception
	{
		Log.info("Clicking on I do not accept button");
		try {
			
			uiDriver.findElement(IdonotAccept).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON I DO NOT ACCEPT BUTTON " +"\n clickonIdonotAcceptButton " +e.getLocalizedMessage());		
			}
		return new LoginPage(uiDriver);
	}
	/******************************************************************************************************************************************************************************************/
}
