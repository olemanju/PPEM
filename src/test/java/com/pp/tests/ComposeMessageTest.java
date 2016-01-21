package com.pp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.pp.common.NKConstants;
import com.pp.pages.AccountSummaryNewpage;
import com.pp.pages.ComposeMessagePage;
import com.pp.pages.InboxPage;
import com.pp.pages.LoginPage;
import com.pp.pages.OutboxPage;
import com.pp.pages.RequestSubmitted1Page;
import com.pp.pages.SecurityQuestion;
import com.pp.pages.SurveyOptInPage;
import com.pp.pages.TermsAndConditionsPage;
import com.pp.pages.UsernamePasswordFindPage;
import com.pp.util.BaseTestObject;
import com.pp.util.ExcelutilObject;

public class ComposeMessageTest extends BaseTestObject

{
private static Logger Log= Logger.getLogger(Logger.class.getName());
	
	LoginPage objLoginPage;
	TermsAndConditionsPage objTermsAndConditionsPage;
	UsernamePasswordFindPage objUsernamePasswordFindPage;
	SecurityQuestion objSecurityQuestion;
	AccountSummaryNewpage objAccountSummaryNew;
	SurveyOptInPage objSurveyOptInPage;
	ComposeMessagePage objComposeMessagePage;
	RequestSubmitted1Page objRequestSubmitted1Page;
	InboxPage objInboxPage;
	OutboxPage objoutboxPage;
	
	
	boolean flag;
	String actual_Result=null;
	String parent_window=null;
	
	@Test(priority=1, enabled=true)
	public void LoginAndClickonComposeMessage() throws Exception
	{
		
		try 
		{
			objLoginPage = new LoginPage(uiDriver);
			objLoginPage.verifyUsernameLabel();
			objLoginPage.verifyPasswordlabel();
			objLoginPage.verifyUsernameTextbox();
			
			String Username=getExcelTest(1, 1);
			System.out.println(Username);
			objLoginPage.enterUsername(Username);
			
			String Password=getExcelTest(1, 2);
			System.out.println(Password);
			objLoginPage.enterPassword(Password);
			
			
			objSecurityQuestion	=objLoginPage.clickOnLoginButton();
			objSecurityQuestion.verifyFruadWarning();
			objSecurityQuestion.verifyFavTeachernameTextbox();
			
			String FavText=getExcelTest(1, 3);
			System.out.println(FavText);
			objSecurityQuestion.EnterFavTextbox(FavText);
			
		objAccountSummaryNew=	objSecurityQuestion.clickOnSubmitButton();
		objAccountSummaryNew.verifyDashBoardMessage();
		objAccountSummaryNew.verifyWelcomeMessage();
		
		objAccountSummaryNew.verifyComposeAnEmail();
		objComposeMessagePage=objAccountSummaryNew.clickOnComposeEmailClick();
		Thread.sleep(2000);
		objComposeMessagePage.practiceLabel();
		objComposeMessagePage.selectPracticeDropdown("7c46a640-d4f4-4987-bbc1-cfd0c446b552");
		Thread.sleep(2000);
		objComposeMessagePage.verifyCategoryElement();
		objComposeMessagePage.verifyCategoryDropdown();
		objComposeMessagePage.selectValueFromCategoryDropdown("Private questions (for only a doctor)");
		Thread.sleep(2000);
		objComposeMessagePage.selectValuefromToDropDown(1);
		objComposeMessagePage.verifySubjectLabel();
		objComposeMessagePage.verifySubjectTextbox();
		objComposeMessagePage.enterSubjectTextEntry("Sample Test Ole");
		objComposeMessagePage.verifyMessageBoxLabel();
		objComposeMessagePage.enterMessageText("Sandy, Pramod, Nanda");
		objRequestSubmitted1Page=objComposeMessagePage.clickonSubmitButtonOfComposeMessage();
		objRequestSubmitted1Page.getTextofconfirmationMessage();
		
		
		objAccountSummaryNew.verifySignOutButton();
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		
		
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithValidCredentials" +e.getLocalizedMessage());
		}
		}
	
	public String getExcelTest(int row,int column) throws Exception
	{
		ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "Login");
		return ExcelutilObject.getCellData(row, column);
}
}