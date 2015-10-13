package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

import junit.framework.Assert;

public class EnrollPage extends BasePageObject
{

	public EnrollPage(WebDriver driver) 
	{
		super(driver);		
		
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	/**********Elements on this page*********************/
	By enroll_form=By.id("ctl00_ContentPlaceHolder1_lblFormTitle");
	By enroll_text1_ele=By.id("ctl00_ContentPlaceHolder1_lblFirstInstruction");
	By enroll_text2_ele=By.id("ctl00_ContentPlaceHolder1_lblSecondInstruction");
	
	
	/**********************************************************/
	String Title=null;
	/**************************************************************************************************************************************************/
	/**
	 * @author MRamadurga
	 * @return
	 * @throws Exception 
	 */
	public void verifyEnrollPageDisplay(String expTit) throws Exception
	{
		try
		{
			String actTit=uiDriver.findElement(enroll_form).getText();
			Assert.assertEquals(expTit.trim(), actTit.trim(),"Enroll page form Title does not match");
			
		}
		catch(Exception e)
		{
			throw new Exception("error in loading enroll page..."+e.getLocalizedMessage());
		}
	}
	
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * description: Verifies all the text present in Enroll page
	 */
	
	public void verifyAllEnrollPageText() throws Exception
	{
		try
		{
			verifyTextPresent(NKConstants.EnrollPage_Text1, enroll_text1_ele);
			verifyTextPresent(NKConstants.EnrollPage_text2, enroll_text2_ele);
			
		}
		catch(Exception e)
		{
			throw new Exception("error in verifying all the text of EnrollPage..."+e.getLocalizedMessage());
		}
		
	}
	/************************************************************************************************************************************************/
	/**
	 * @author MRamadurga
	 * Desc: Verifying the display of radio buttons in a page
	 * @throws Exception 
	 * 
	 */
	public boolean verifyEnrollPageRadioButtons(By radio_ele,String radio_text) throws Exception
	{
		Log.info("Verifying the display of  "+radio_text+" radio button");
		try
		{
			boolean flag=isElementPresent(radio_ele);
			String radio_act_txt=uiDriver.findElement(radio_ele).getText();
			org.testng.Assert.assertEquals(radio_act_txt.trim(), radio_text.trim(),"Radio button text does not match..");
			
			return flag;
		}
		catch(Exception e)
		{
			throw new Exception("Radio button"+radio_text+" not displayed"+e.getLocalizedMessage());
			
		}
	}
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * Desc: verifies the display of buttons in the Enrool page
	 */
	
	public boolean verifyEnrollPageButtons(By Btn_ele,String Btn_desc) throws Exception
	{
		try
		{
			boolean flag=isElementPresent(Btn_ele);
			String exp_btn_text=uiDriver.findElement(Btn_ele).getAttribute("value");
			org.testng.Assert.assertEquals(Btn_desc.trim(), exp_btn_text.trim(),"Button description doesnot match..");
			return flag;
		}
		catch(Exception e)
		{
			throw new Exception(Btn_desc+" Button is not displayed"+e.getLocalizedMessage());
		}
	}
	
	/************************************************************************************************************************************************/
	
	/**
	 * @author MRamadurga
	 * @throws Exception 
	 * Desc: verifies the Fraud text
	 */
	
	public void verifyFraud_Text_Display(String exp_fraud_txt,By fraud_ele) throws Exception
	{
		try
		{
			verifyTextPresent(exp_fraud_txt, fraud_ele);
			
		}
		catch(Exception e)
		{
			throw new Exception("Fraud text not displayed"+e.getLocalizedMessage());
		}
	}

	/************************************************************************************************************************************************/
	
}
