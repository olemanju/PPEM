package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;

public class InboxPage extends BasePageObject
{
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	public InboxPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		super(driver);
	}

	
	By deleteButton= By.id("ctl00_ContentPlaceHolder1_NextMDMessageGrid1_gridMessage_ctl20_btnDeleteMessages");
	By Home=By.id("ctl00_ucHeader_lnkHomeMenuItem");
	
	boolean flag;
	/***************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyDeletebutton() throws Exception
	{
		Log.info("Verification of delete button");
		
		try {
			flag=uiDriver.findElement(deleteButton).isDisplayed();
			Assert.assertTrue(flag, "Delete button is Not Present");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE DELETE BUTTON " +"\n verifyDeletebutton " +e.getMessage());
		}
		
	}
	
	/***************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyHomebutton() throws Exception
	{
		Log.info("verification of Home button Present on the Page");
		try {
			
			flag=isElementPresent(Home);
			Assert.assertTrue(flag, "Home Button is Missing on the screen");
			return flag;
			
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE HOME BUTTON  " + "\n verifyHomebutton" + e.getLocalizedMessage());
		}
	}
	/***************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public AccountSummaryNewpage clickOnHomeButton() throws Exception
	{
		Log.info("Clicking Home button");
		try 
		{
			uiDriver.findElement(Home).click();
		} 
		
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE HOME BUTTON " + "\n clickOnHomeButton " + e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
	}
}
