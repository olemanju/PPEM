package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

public class AppointmentRenewalSubmittedPage extends BasePageObject
{

	public AppointmentRenewalSubmittedPage( WebDriver driver) 
	{
		super(driver);
	}
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By ApptSentConfirm=By.id("ctl00_ContentPlaceHolder1_lblMessageSent");
	
	
	boolean flag=false;
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public boolean verifyAppointmentSentTextMessage() throws Exception
	{
		Log.info("Verification of AppointmentSentTextMessage");
		
		try {
			flag=isElementPresent(ApptSentConfirm);
			
			Assert.assertTrue(flag, "Appointment Sent Text Label IS Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE APPOINTMENT SENT CONFIRMATION MESSAGE" + " \n verifyAppointmentSentTextMessage" + e.getMessage());
		}
	}
		/**********************************************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 * This method will check whether DashBoard message is displayed on page.
		 */
		
		public void CheckProperMessageGetDisplayedforAppitConfirmation() throws Exception
		{
		try {
			compareTwoStrings(getText(ApptSentConfirm), NKConstants.AppointmentSentConfirmationText, "Both Appointment Confirmation Message are Not Matching");

		} catch (Exception e) {
			throw new Exception("FAILED WHILE COMPARING THE APPOINTMENT SENT CONFIRMATION MESSAGE" + " \n CheckProperMessageGetDisplayedforAppitConfirmation" + e.getMessage());
		}
					}
	
	
}
