package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;

public class OutboxPage extends BasePageObject
{

	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	public OutboxPage(WebDriver driver) 
	{
		super(driver);
	}
	
	boolean flag=false;
	
	By deletebuttonoutbox=By.id("ctl00_ContentPlaceHolder1_InboxOutboxGrid1_gridMessage_ctl11_btnDeleteMessages");
	By HomeButton=By.id("ctl00_ucHeader_lnkHomeMenuItem");
	By countorrecords=By.id("ctl00_ContentPlaceHolder1_InboxOutboxGrid1_gridMessage_ctl18_lblItemTotal");
	
	/********************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	
	public boolean verifyDeleteButtonOnOutbox() throws Exception
	{
		Log.info("Verification of Delete button on outbox");
		try 
		{
			flag=isElementPresent(deletebuttonoutbox);
			Assert.assertTrue(flag, "Delete button Element is missing");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING DELETE BUTTON ON OUTBOX SCREEN  " +"\n verifyDeleteButtonOnOutbox " + e.getLocalizedMessage());
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
	public AccountSummaryNewpage clickOnHomeButtonOnOutBoxScreen() throws Exception
	{
		Log.info("Clicking on Home button from out box screen");
		
		try {
			uiDriver.findElement(HomeButton).click();
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON THE HOMEPAGE BUTTON FROM OUTBOX SCREEN " + "\n clickOnHomeButtonOnOutBoxScreen " +e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
		
	}
	/********************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public String gettextofCount() throws Exception
	{
		Log.info("Clicking on Home button from out box screen");
		
		try {
		String name=getText(countorrecords);
		System.out.println(name);
			
		return name;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON THE HOMEPAGE BUTTON FROM OUTBOX SCREEN " + "\n clickOnHomeButtonOnOutBoxScreen " +e.getLocalizedMessage());
		}
		
		
	}
}
