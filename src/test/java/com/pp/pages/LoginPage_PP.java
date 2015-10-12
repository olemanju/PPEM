package com.pp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

public class LoginPage_PP extends BasePageObject
{

	public LoginPage_PP(WebDriver driver) {
		super(driver);
	}
	
	By welcome_text=By.className("fontMarketing");
	By patent_text1=By.id("ctl00_ContentPlaceHolder1_PrivacyPolicy2_lblPrivacyPolicyTitle");
	
	
	
	//Variables
	String actTit=null;
	
	
	public void verifyLoginPageTitle(String expTit) throws Exception 
	{
		try
		{
			actTit=uiDriver.getTitle();
			Assert.assertEquals(actTit.trim(), expTit.trim(),"Page title does not match failed to load loginpage");
		}
		catch(Exception e)
		{
			throw new Exception("FAILED GETING THE HOMEPAGE TITLE  " + "\n verifyHomePageTitle " +e.getLocalizedMessage());
		}
		
	}
	
	public void verifytextPresent(String expText) throws Exception
	{
		try
		{
			String actText=getText(welcome_text);
			Assert.assertEquals(actText.trim(), expText.trim(),"actual text and expected text did not match....");
		}
		catch(Exception e)
		{
			throw new Exception("text is not displayed in the homepage"+"\n VerifytextPresent"+e.getLocalizedMessage());
		}
		
	}

	
}
