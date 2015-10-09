package com.pp.pages;

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
	
	
	boolean flag;
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
}
