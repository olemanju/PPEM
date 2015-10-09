package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
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
	By IamNewHerebutton=By.id("ctl00_ContentPlaceHolder1_Login2_btnEnroll1");
	
	
	//Variables
	
	boolean flag;
	String PageTitle=null;
	String Parent_Window=null;
	String actual_Result=null;
	String expected_Result=null;
	String Child_Window=null;
	
	/******************************************************************************************************************************************************************************************/	
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
	
	/******************************************************************************************************************************************************************************************/
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
				flag=isElementPresent(IamHereText);
				Assert.assertTrue(flag, "I am New Here text is Missing");
				return flag;
				
			}
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE TEXT" + "\n verifyIamNewHereText  " + e.getLocalizedMessage());
		}
		
	}
/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return  actual_Result
	 * 
	 */
	public String getIamNewHereText() throws Exception
	{
		Log.info("Getting the Text of I am new here and comparing with actual value");
		
		try {
			
			actual_Result=getText(IamHereText).trim();
			Assert.assertEquals(actual_Result, NKConstants.IAMNEWHERE,"I am New Here Text is Not Matching");
			return actual_Result;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE COMPARING  THE I AM NEW HERE TEXT" + "\n getIamNewHereText  " + e.getLocalizedMessage());
		}
	}
	

	/******************************************************************************************************************************************************************************************/
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
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual_Result
	 */
	
	public String getHaveYouBeenProvidedText() throws Exception
	{
		Log.info("Getting the Text of Have you been provided an enrollment token");
		try {
			
			actual_Result=getText(HaveYouBeenProvidedEnrolled).trim();
			Assert.assertEquals(actual_Result, NKConstants.HaveYouBeenProvided,"Have You Been Text is Not Matching ");
			return actual_Result;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE  HAVE YOU BEEN HERE PROVIDED AN ENROLLEMENT TOKEN TEXT" + "\n getHaveYouBeenProvidedText" +e.getLocalizedMessage());
		}
	}
	
	/******************************************************************************************************************************************************************************************/
	
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
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual_Result
	 */
	public String getDoYouHaveTempText() throws Exception
	{
		Log.info("getting the Text of do you have temporary username and Password?");
		
		try {
			actual_Result=getText(DoYouTempPasswordText).trim();
			Assert.assertEquals(actual_Result, NKConstants.DoyouhaveTempPassword,"Do you Have Temparary Password is not Matching");
			return actual_Result;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE COMPARING THE TEXT OF DO YOU HAVE A TEMPARARY USERNAME AND PASSWORD TEXT  " +"\n getDoYouHaveTempText  " + e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
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
			flag=isElementPresent(IamNewHerebutton);
			Assert.assertTrue(flag, "I am New Here text is Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED VERIFYING THE I AM NEW HERE BUTTON "+ "\n verifyIamNewHereButton " + e.getLocalizedMessage());
		}
	}
	/******************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * 
	 */
	public TermsAndConditionsPage clickOnIamNewHereButton() throws Exception
	{
		Log.info("Clicking on I am new here button");
		try 
		{
			uiDriver.findElement(IamNewHerebutton).click();
			
			
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON I AM NEW HERE BUTTON" + "\n clickOnIamNewHereButton" +e.getLocalizedMessage());
		}
		return new TermsAndConditionsPage(uiDriver);
	}
	/******************************************************************************************************************************************************************************************/
}
