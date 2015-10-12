package com.pp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pp.common.NKConstants;
import com.pp.pages.LoginPage_PP;
import com.pp.util.BaseTestObject;

public class LoginPage_PPTest extends BaseTestObject
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	@Parameters({"browserType","url"})
	@Test(priority=1, enabled=true)
	public void verifyLoginPageTitle() throws Exception
	{
		Log.info("Verifying the page Title...");
		try
		{
		LoginPage_PP obj=new LoginPage_PP(uiDriver);
		//obj.verifyLoginPageTitle(NKConstants.Loginpage_Title);
		}
		catch(Exception e)
		{
			throw new Exception("Failed to execute verifyLoginPageTitle testcase"+e.getLocalizedMessage());
		}
	}
	
	@Test
	public void verifyTextOnLoginPage() throws Exception
	
	{
		Log.info("Verifying the display of text on loginpage...");
		try
		{
			LoginPage_PP obj2=new LoginPage_PP(uiDriver);
		//	obj2.verifytextPresent(NKConstants.LoginPage_Welcome_Text);
			
		}
		catch(Exception e)
		{
			throw new Exception("Failed to verify the text value on Login page.."+e.getLocalizedMessage());
		}
	}
	
}
