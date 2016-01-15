package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

	public class RequestSubmitted1Page extends BasePageObject
	{
		public static Logger Log= Logger.getLogger(Logger.class.getName());
		
		public RequestSubmitted1Page(WebDriver driver) {
			super(driver);
		}
		By SignOutButton= By.id("ctl00_SignOutButton");
		By confirmMessage=By.id("ctl00_ContentPlaceHolder1_lblMessageSent");
		By HomeButton=By.id("ctl00_ucHeader_lnkHomeMenuItem");
		
		String ActualResult=null;
		String ExpectedResult=null;
		boolean flag=false;
		/************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return surveyoptinPage
		 * @throws Exception
		 * This method will check whether Welcome  message is displayed on page.
		 */
		
		public SurveyOptInPage clickOnSignOutButton() throws Exception
		{
			Log.info("Clicking on Signout button");
			try
			{
				uiDriver.findElement(SignOutButton).click();
			}
			catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING SIGN OUT BUTTON" +"\n clickOnSignOutButton " +e.getLocalizedMessage());
			}
			return new SurveyOptInPage(uiDriver);
			
		}
		
		/************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 * This method will check whether Welcome  message is displayed on page.
		 */
		public boolean verifyConfirmationMessage() throws Exception
		{
			Log.info("Verification of Confirmation Message Element");
			try {
				flag=uiDriver.findElement(confirmMessage).isDisplayed();
				Assert.assertTrue(flag, "Confirmation Message is Missing");
				return flag;
			} 
			catch (Exception e)
			{
				throw new Exception("FAILED WHILE ELEMENT IDENTIFICATION OF CONFIRMATION MESSAGE " + "\n verifyConfirmationMessage" +e.getLocalizedMessage());
			}
			
		}
		/************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 * This method will check whether Welcome  message is displayed on page.
		 */
		
		public String getTextofconfirmationMessage() throws Exception
		{
			Log.info("Comparing confirmation text message");
			try {
				
				ActualResult=getText(confirmMessage);
				Assert.assertEquals(ActualResult, NKConstants.ConfrmationMessageSent,"Both the Confirmation Messages are not Matching");
				return ActualResult;
			} 
			catch (Exception e) 
			{
				throw new Exception("FAILED WHILE COMAPARING BOTH THE TEXT i MEAN BOTHE TEXT ARE NOT EQUAL " + "\n verifyConfirmationMessage" +e.getLocalizedMessage());
			}
			
		}
		/********************************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 */
		public boolean verifyHomeButtonOnOutBox() throws Exception
		{
			Log.info("Verification of Home button on out box screen");
			try {
				
				flag=isElementPresent(HomeButton);
				return flag;
			} catch (Exception e) {
				throw new Exception("FAILED WHILE VERFYING THE HOME BUTTON ON OUTBOX SCREEN  " +  "\n verifyHomeButtonOnOutBox "+e.getLocalizedMessage());
			}
		}
		
		/********************************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 */
		public AccountSummaryNewpage clickOnHomeButtonOnComposeMessage() throws Exception
		{
			Log.info("Clicking on Home button from out box screen");
			
			try {
				uiDriver.findElement(HomeButton).click();
				
			} catch (Exception e) {
				throw new Exception("FAILED WHILE CLICKING ON THE HOMEPAGE BUTTON FROM OUTBOX SCREEN " + "\n clickOnHomeButtonOnOutBoxScreen " +e.getLocalizedMessage());
			}
			return new AccountSummaryNewpage(uiDriver);
			
		}
	}

