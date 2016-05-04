package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;

import org.openqa.selenium.support.ui.Select;

public class ComposeMessagePage extends BasePageObject
{

	public ComposeMessagePage(WebDriver driver) 
	{
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	/* Elements */
	
	By composeMessagelbl=By.id("ctl00_ContentPlaceHolder1_lblFormHeader");
	By selectpracticeandpatientlabel=By.id("ctl00_ContentPlaceHolder1_lblPracticeToRenewMedHeader");
	By Practicelabel=By.id("ctl00_ContentPlaceHolder1_PracticePersonSelector1_lblPracticeCaption");
	By Practicedropdown=By.id("ctl00_ContentPlaceHolder1_PracticePersonSelector1_ddlPractices");
	By BehalfDrop=By.id("ctl00_ContentPlaceHolder1_PracticePersonSelector1_ddlPersons");
	By selectMessageCategoryandRecipient=By.id("ctl00_ContentPlaceHolder1_Label2");
	By instructionMessageLabel=By.id("ctl00_ContentPlaceHolder1_lblInstructions");
	By categorylabel=By.id("ctl00_ContentPlaceHolder1_OnlineCommunicationNavigator1_lblCategoryCaption");
	By categorydropdownselection=By.id("ctl00_ContentPlaceHolder1_OnlineCommunicationNavigator1_ddlMsgSubCategories");
	By To=By.id("ctl00_ContentPlaceHolder1_OnlineCommunicationNavigator1_lblIdentityCaption");
	By Todropdown=By.id("ctl00_ContentPlaceHolder1_OnlineCommunicationNavigator1_ddlOnlineIdentity");
	By subjectlabel=By.id("ctl00_ContentPlaceHolder1_lblSubject");
	By subjectText=By.id("ctl00_ContentPlaceHolder1_txtSubject");
	By Messagelabel=By.id("ctl00_ContentPlaceHolder1_lblMessage");
	By MessageTextBox=By.id("ctl00_ContentPlaceHolder1_txtMessage");
	By DisclaimerMessage=By.id("ctl00_ContentPlaceHolder1_Disclaimer1_lblDisclaimer");
	By SubmitButton=By.id("ctl00_ContentPlaceHolder1_btnSend");
	By Homebtn=By.id("ctl00_ucHeader_lnkHomeMenuItem");
	

	/* Variables*/
	
	String PageTitle=null;
	boolean flag=false;
	String Parent_window=null;
	String Child_window=null;
	String actual_Result=null;
	String expected_Result=null;
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public boolean verifyComposeMessage() throws Exception
	{
		Log.info("Verification of Compose Message");
		try {
			flag=uiDriver.findElement(composeMessagelbl).isDisplayed();
			Assert.assertTrue(flag, "Compose Message Label is not displaying");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED VERIFYING THE COMPOSE MESSAGE TEXT " + "\n verifyComposeMessage " + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifySelectPracticeandPatientLabel() throws Exception
	{
		Log.info("Verification of Select Practice and Patient label");
		try 
		{
			flag=uiDriver.findElement(selectpracticeandpatientlabel).isDisplayed();
			Assert.assertTrue(flag, "Select Practice and Patient Label is Missing");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SELECT PRACTICE AND PATIENT LABEL" + "\n verifySelectPracticeandPatientLabel " +e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean practiceLabel() throws Exception
	{
		Log.info("Verification of Practice label");
		try 
		{
			flag=uiDriver.findElement(Practicelabel).isDisplayed();
			Assert.assertTrue(flag, "Practice Label is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE PRACTICE LABEL" + "\n practiceLabel" + e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectPracticeDropdown(String practicename) throws Exception
	{
		Log.info("Verification of Practice dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(Practicedropdown)).selectByValue(practicename);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE PRACTICE DROPDOWN" +"\n selectPracticeDropdown" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectSendBehalfOfDropdown(String SelecDrop) throws Exception
	{
		Log.info("Verification of Practice dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(BehalfDrop)).selectByValue(SelecDrop);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE PRACTICE DROPDOWN" +"\n selectPracticeDropdown" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifySelectMessageCategoryandRecipientTextisPresent() throws Exception
	{
		Log.info("Verification of SelectMessageCategoryandRecipientTextisPresent on Page" );
		try 
		{
			flag=isTextPresent(NKConstants.selectMessageCategoryText);
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE TEXT OF  " + "\n verifySelectMessageCategoryandRecipientTextisPresent" + e.getLocalizedMessage());
		}
		
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyCategoryElement() throws Exception
	{
		Log.info("verification of category element or label on the page");
		try {
			
			flag= isElementPresent(categorylabel);
			Assert.assertTrue(flag, "Category Label is Missing on the Page");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE CATEGORY LABEL" +" \n verifyCategoryElement()" + e.getMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyCategoryDropdown() throws Exception
	{
		Log.info("Verification of Category Dropdown Present on the Page");
		
		try {
			flag=isElementPresent(categorydropdownselection);
			Assert.assertTrue(flag, "Category Dropdwon box is Missing");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE CATEGORY DROPDOWN ELEMENT" +"\n verifyCategoryDropdown "+ e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectValueFromCategoryDropdown(String categorySelect) throws Exception
	{
		Log.info("Category Drop down selection");
		try
		{
			//selectDropDown(categorydropdownselection, "9a983f9f-0cad-4751-8988-c93707a54ddf");
			new Select(uiDriver.findElement(categorydropdownselection)).selectByVisibleText(categorySelect);
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE SELECTING THE VALUE FROM THE CATEGORY DROPDOWN " + "\n selectValueFromCategoryDropdown" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectValuefromToDropDown(int ToProvider) throws Exception
	{
		Log.info("Selection of dropdown value from To Box");
		
		try {
			//selectDropDown(Todropdown, "d7b924f1-c28f-4bd2-96d5-08a6ede37ed2");
			new Select(uiDriver.findElement(Todropdown)).selectByIndex(ToProvider);
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE SELECTING THE VALUE FROM TO DROPDOWN " +"\n selectValuefromToDropDown"  + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public boolean verifySubjectLabel() throws Exception
	{
		Log.info("Verification of Subject Label");
		
		try {
			flag=isElementPresent(subjectlabel);
			
			Assert.assertTrue(flag, "Subject Label IS Missing");
			return flag;
		} 
		catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE SUBJECT LABEL" + " \n verifySubjectLabel" + e.getMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifySubjectTextbox() throws Exception
	{
		Log.info("Verification of subject Textbox");
		try {
			flag=isElementPresent(subjectText);
			Assert.assertTrue(flag, "Subject Textbox Element is missing");
			return flag;
			
		} catch (Exception e) {
		throw new Exception("FAILED WHILE VERIFYING THE SUBJECT TEXT BOX" +"\n verifySubjectTextbox" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void enterSubjectTextEntry(String subject) throws Exception
	{
		Log.info("User Entering Subject Text entry");
		try {
			uiDriver.findElement(subjectText).sendKeys(subject);
		} catch (Exception e) {
			throw new Exception("FAILED WHILE ENTERING THE SUBJECT TEXT BOX "+"\n  enterSubjectTextEntry" + e.getLocalizedMessage());
		}
	}

	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public boolean verifyMessageBoxLabel() throws Exception
	{
		Log.info("Verification of MessageBox label");
		try {
			flag=isElementPresent(Messagelabel);
			Assert.assertTrue(flag, "Message Label is Missing on the screen");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE SUBJECT LABEL" + "\n verifyMessageBoxLabel" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void enterMessageText(String msg) throws Exception
	
	{
		Log.info("Enter Message box text box");
		try {
			uiDriver.findElement(MessageTextBox).sendKeys(msg);
		} catch (Exception e) {
			throw new Exception(	"FAILED WHILE ENTERING SUBJECT TEXTBOX " +"\n enterMessageText " + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public RequestSubmitted1Page clickonSubmitButtonOfComposeMessage() throws Exception
	{
		Log.info("Clicking on submit button");
		try {
			uiDriver.findElement(SubmitButton).click();
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON SUBMIT BUTTON " +"\n clickonSubmitButtonOfComposeMessage" + e.getLocalizedMessage());
		}
		return new RequestSubmitted1Page(uiDriver);
	}
	
}

