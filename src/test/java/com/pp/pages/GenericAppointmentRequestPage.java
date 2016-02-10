package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pp.util.BasePageObject;

public class GenericAppointmentRequestPage extends BasePageObject
{

	public GenericAppointmentRequestPage(WebDriver driver) 
	{
		super(driver);		
		
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	By HomeButton=By.id("ctl00_ucHeader_lnkHomeMenuItem");
	
	/********************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public AccountSummaryNewpage clickOnHomeButtonOnGenericApptRequest() throws Exception
	{
		Log.info("Clicking on Home button from clickOnHomeButtonOnGenericApptRequest  screen");
		
		try {
			uiDriver.findElement(HomeButton).click();
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON THE HOMEPAGE BUTTON FROM clickOnHomeButtonOnGenericApptRequest  " + "\n clickOnHomeButtonOnGenericApptRequest " +e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
}
}
