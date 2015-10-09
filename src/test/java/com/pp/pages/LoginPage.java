package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;

public class LoginPage extends BasePageObject
{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	
	//UI ELEMENTS
	
	By SiteLogo=By.id("ctl00_Header1_headerlink");
	By IamHereText=By.id("ctl00_ContentPlaceHolder1_Login2_lblNewHere");
	By HaveYouBeenProvidedEnrolled=By.id("ctl00_ContentPlaceHolder1_Login2_lblNewPatientPortal");
	By DoYouTempPasswordText=By.id("ctl00_ContentPlaceHolder1_Login2_lblHaveEnrollmentToken");
	By IamNewHere=By.id("ctl00_ContentPlaceHolder1_Login2_btnEnroll1");
	
	
	//Variables
	
	boolean flag;
	String PageTitle=null;
	String Parent_Window=null;
	String actual_Result=null;
	String expected_Result=null;
	String Child_Window=null;
	
	
	/**
	 * @author manjunathr
	 * @throws exception
	 * @RETURN boolean
	 * This Method will Verify 
	 * 
	 */
	
	public boolean verifySiteLogo() throws Exception
	{
		Log.info("Verifying Site Log of Login Page");
		try 
		{
			flag=isElementPresent(SiteLogo);
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE SITE LOGO" + "\n verifySiteLogo " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * @author manjunathr
	 * @return  flag
	 * 
	 */
	public boolean verifyIamNewHereText() throws Exception
	{
		Log.info("Verify I am new here Text ");
		try {
			{
				flag=isElementPresent(IamNewHere);
				Assert.assertTrue(flag, "I am New Here text is Missing");
				return flag;
				
			}
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE TEXT" + "\n verifyIamNewHereText  " + e.getLocalizedMessage());
		}
		
	}
	
	/**
	 * @author manjunathr
	 * @return flag
	 * 
	 */
	public boolean verifyHaveYouBeenProvidedText() throws Exception
	{
		Log.info("Verifiy Have you been provided an enrollment token Text");
		
		try {
			
		flag= isElementPresent(HaveYouBeenProvidedEnrolled);
		Assert.assertTrue(flag, "Have you been provided an enrollment token Text is Missing");
		return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE HAVE YOU BEEN HERE PROVIDED AN ENROLLEMENT TOKEN TEXT" + "\n verifyHaveYouBeenProvidedText" +e.getLocalizedMessage());
		}
	}
	
	/**
	 * @author manjunathr
	 * @return flag
	 */
	
	public boolean verifyTemporaryUsernamePasswordText() throws Exception
	{
		Log.info("Verify Do you have a temporary username and password? Text");
		try 
		{
			flag= isElementPresent(DoYouTempPasswordText);
			Assert.assertTrue(flag, "Do you have a temporary username and password? Text is Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE DO YOU HAVE A TEMPARARY USERNAME AND PASSWORD TEXT  " +"\n verifyTemporaryUsernamePasswordText  " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * @author manjunathr
	 * 
	 * 
	 */
	public boolean verifyIamNewHereButton() throws Exception
	{
		Log.info("Verify I am New Here button Text");
		try
		{
			flag=isElementPresent(IamNewHere);
			Assert.assertTrue(flag, "I am New Here text is Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE BUTTON "+ "\n verifyIamNewHereButton " + e.getLocalizedMessage());
		}
	}
	
	/**
	 * @author manjunathr
	 * 
	 */
	public void clickOnIamNewHereButton() throws Exception
	{
		Log.info("Clicking on I am new here button");
		try 
		{
			uiDriver.findElement(IamNewHere).click();
			
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON I AM NEW HERE BUTTON" + "\n clickOnIamNewHereButton" +e.getLocalizedMessage());
		}
	}
}
