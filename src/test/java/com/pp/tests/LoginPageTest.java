package com.pp.tests;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
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

public class LoginPageTest extends BaseTestObject
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
	
	//@Parameters({"browserType","url"})
	
	@Test(priority=1, enabled=true)
	
	public void verifyIamNewHereTestCase() throws Exception
	{

		Log.info("----> Verifying the verifyIamNewHereTestCase <------------");
	try 
	{
		
		objLoginPage= new LoginPage(uiDriver);
		objLoginPage.verifyIamNewHereText();
		objLoginPage.getIamNewHereText();
		objLoginPage.verifyHaveYouBeenProvidedText();
		objLoginPage.getHaveYouBeenProvidedText();
		objLoginPage.verifyTemporaryUsernamePasswordText();
		objLoginPage.getDoYouHaveTempText();
		objLoginPage.verifyIamNewHereButton();
		objTermsAndConditionsPage=objLoginPage.clickOnIamNewHereButton();
		objTermsAndConditionsPage.verifyTermsAndConditonsText();
		objTermsAndConditionsPage.verifyIdonotAcceptbutton();
		objLoginPage=objTermsAndConditionsPage.clickonIdonotAcceptButton();
		objLoginPage.verifyIamNewHereText();
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED VERIFYING THE I AM NEW HERE  TESTCASE" + "\n verifyIamNewHereTestCase" +e.getLocalizedMessage());
	}
		
	}
	
	@Test(priority=2,enabled=true)
	
	public void verifyAllReadyMembersElements() throws Exception
	{
		
		Log.info("Verifying the elements of All ready member Box");
		
		try {
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyUsernameLabel();
			objLoginPage.verifyUsernameTextbox();
			objLoginPage.verifyPasswordlabel();
			objLoginPage.verifyPasswordTextbox();
			objLoginPage.verifyquestionMarkimage();
			objLoginPage.verifyNeedHelpwithUsernamePwdLink();
			objLoginPage.verifyLoginbutton();
		} catch (Exception e)
		{
			throw new Exception("FAILED THE TEST CASE OF VERIFY ALL READY MEMBERS ELEMENTS " + "\n verifyAllReadyMembersElements" +e.getLocalizedMessage());
		}
	}
	
	@Test(priority=3,enabled=true)
	
	public void clickOnLoginWithInvalidUsernameAndPassword() throws Exception
	{
		Log.info("Clicking on Login button with Invalid Username and Password");
		try {
			
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyUsernameLabel();
			objLoginPage.verifyUsernameTextbox();
			
			String invalidusername=getExcelTestInvalid(1, 1);
			System.out.println(invalidusername);
			objLoginPage.enterUsername(invalidusername);
			
			objLoginPage.verifyPasswordlabel();
			objLoginPage.verifyPasswordTextbox();
			
			String invalidPassword=getExcelTestInvalid(1, 2);
			System.out.println(invalidPassword);
			objLoginPage.enterPassword(invalidPassword);
			
			objLoginPage.clickOnLoginButton();
			Thread.sleep(4000);
			objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
			
			
		} catch (Exception e) {
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
		}
	}
	
@Test(priority=4,enabled=true)
	
	public void clickOnNeedHelpWithyourUsernamePassLink() throws Exception
	{
		Log.info("Clicking on clickOnNeedHelpWithyourUsernamePass Link ");
		try {
			
			objLoginPage= new LoginPage(uiDriver);
			objLoginPage.verifyquestionMarkimage();
			objLoginPage.verifyNeedHelpwithUsernamePwdLink();
			objUsernamePasswordFindPage	=objLoginPage.clickOnNeedHelpwithUsernamePwdLink();
			objUsernamePasswordFindPage.verifyCancelButton();
			objLoginPage=objUsernamePasswordFindPage.clickOnCancelButton();
		
			
		} catch (Exception e) {
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
		}
	}
/*@Test(priority=0,enabled=false)

public void clickOnLoginWithvalidUsernameAndInvalidPasswordAndVerifyWarningMessage() throws Exception
{
	Log.info("Clicking on Login button with Invalid Username and Password");
	try {
		
		objLoginPage= new LoginPage(uiDriver);
		objLoginPage.verifyUsernameLabel();
		objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		//objLoginPage.verifyUsernameTextbox();
		objLoginPage.verifyPasswordlabel();
		objLoginPage.verifyPasswordTextbox();
		objLoginPage.enterUsername("shruthi1");
		//soumya1,dshetty1,umashree1,jcotton1,olemnji1,shruthi1,
		objLoginPage.enterPassword("asdasd1");
		objLoginPage.clickOnLoginButton();
		Thread.sleep(4000);
		objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
		objLoginPage.enterPassword("asdasd1");
		Thread.sleep(2000);
		objLoginPage.clickOnLoginButton();
		objLoginPage.verifyWarningMessageHeader();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTextContent();
		objLoginPage.verifyWaringCloseButton();
		objLoginPage.verifyWarningClickHereResetLink();
		objUsernamePasswordFindPage=objLoginPage.clickOnWaringClickHereRestPasswordUsernameLink();
		objUsernamePasswordFindPage.verifyCancelButton();
		objLoginPage=objUsernamePasswordFindPage.clickOnCancelButton();
		objLoginPage.verifyUsernameLabel();
		objLoginPage.verifyUsernameTextbox();
		objLoginPage.verifyPasswordlabel();
		objLoginPage.verifyPasswordTextbox();
		objLoginPage.enterUsername("olemnji1");
		//soumya1,dshetty1,umashree1
		objLoginPage.enterPassword("asdasd1");
		objLoginPage.clickOnLoginButton();
		Thread.sleep(4000);
		objLoginPage.verifyGetErrorMessageforInvalidUsernameAndPassword();
		objLoginPage.enterPassword("asdasd1");
		Thread.sleep(2000);
		objLoginPage.clickOnLoginButton();
		objLoginPage.verifyWarningMessageHeader();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTex();
		objLoginPage.verifyWarningTextContent();
		objLoginPage.verifyWaringCloseButton();
		objLoginPage.clickOnWarningCloseButton();
		
	} catch (Exception e) {
		throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithInvalidUsernameAndPassword" +e.getLocalizedMessage());
	}
}*/

@Test(priority=6, enabled=true)
public void clickOnLoginWithValidCredentials() throws Exception
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
	objAccountSummaryNew.verifySignOutButton();
	objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
	objSurveyOptInPage.verifyDecideLaterbutton();
	objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
	objLoginPage.compareSighOutMessage();
	//String txt = "";
	//ExcelutilObject.writeDataToExcel(sheetName, row, column, txt, path);
	
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

public String getExcelTestInvalid(int row, int column) throws Exception
{
ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "InvalidLoginDetails");	
return ExcelutilObject.getCellData(row, column);
}






}
