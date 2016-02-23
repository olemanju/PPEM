package com.pp.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pp.common.NKConstants;
import com.pp.pages.AccountSummaryNewpage;
import com.pp.pages.ComposeMessagePage;
import com.pp.pages.GenericAppointmentRequestPage;
import com.pp.pages.InboxPage;
import com.pp.pages.LoginPage;
import com.pp.pages.MyAppointmentsPage;
import com.pp.pages.OutboxPage;
import com.pp.pages.RequestSubmitted1Page;
import com.pp.pages.SecurityQuestion;
import com.pp.pages.SurveyOptInPage;
import com.pp.pages.TermsAndConditionsPage;
import com.pp.pages.UsernamePasswordFindPage;
import com.pp.util.BasePageObject;
import com.pp.util.BaseTestObject;
import com.pp.util.ExcelutilObject;

public class AccountSummaryTest  extends BaseTestObject
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
	GenericAppointmentRequestPage objGenericAppointmentRequestPage;
	MyAppointmentsPage objMyAppointmentsPage;
	
	
	boolean flag;
	String actual_Result=null;
	String parent_window=null;
	
	
	

	@Test(priority=1, enabled=true)
	public void verifyMailMenuOptions() throws Exception
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
		objAccountSummaryNew.verifyMailMenu();
		objAccountSummaryNew.MovetoMailMenu();
		String parent=objAccountSummaryNew.Parentwindow();
	     System.out.println(parent);
		objInboxPage=objAccountSummaryNew.clickonInBoxMenu();
		Thread.sleep(4000);
		objInboxPage.verifyDeletebutton();
		//objInboxPage.switchToParentWindow(parent);
		objInboxPage.verifyHomebutton();
		objAccountSummaryNew=objInboxPage.clickOnHomeButton();
		Thread.sleep(5000);
		objAccountSummaryNew.verifySignOutButton();
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		
		}
		catch (Exception e)
		{
			throw new Exception(" Verify Mail Menu Test case Failed" +e.getLocalizedMessage());
		}
		}

	@Test(priority=2, enabled=true)
	public void verifyMailMenuSentItems() throws Exception
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
		objAccountSummaryNew.verifyMailMenu();
		objAccountSummaryNew.MovetoMailMenu();
		String parent=objAccountSummaryNew.Parentwindow();
	    System.out.println(parent);
//		objAccountSummaryNew.verifySentItem();
		objoutboxPage=objAccountSummaryNew.clickOnSentItemsMenu();
		
		objoutboxPage.gettextofCount();
		objAccountSummaryNew=objoutboxPage.clickOnHomeButtonOnOutBoxScreen();
		

		Thread.sleep(5000);
		objAccountSummaryNew.verifySignOutButton();
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		}
		catch (Exception e)
		{
			throw new Exception(" Verify Mail Menu Test case Failed" +e.getLocalizedMessage());
		}
		}

	@Test(priority=3, enabled=true)
	public void verifyMailMenuComposeMessage() throws Exception
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
		objAccountSummaryNew.verifyMailMenu();
		objAccountSummaryNew.Parentwindow();
		objAccountSummaryNew.MovetoMailMenu();
		
	     objAccountSummaryNew.verifyComposeMessageele();
		objComposeMessagePage=objAccountSummaryNew.clickOnComposeEmailClick();
		//
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
		objComposeMessagePage.enterMessageText("Manjunath, Olemanju, Nanda");
		objRequestSubmitted1Page=objComposeMessagePage.clickonSubmitButtonOfComposeMessage();
		objRequestSubmitted1Page.getTextofconfirmationMessage();
		
		//
		
		objRequestSubmitted1Page.verifyHomeButtonOnOutBox();
		objAccountSummaryNew=objRequestSubmitted1Page.clickOnHomeButtonOnComposeMessage();
		
		Thread.sleep(3000);
		objAccountSummaryNew.verifySignOutButton();
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		}
		catch (Exception e)
		{
			throw new Exception(" Verify Mail Menu Test case Failed" +e.getLocalizedMessage());
		}
		}

	@Test(priority=4, enabled=true)
	public void CheckwithViewProfile() throws Exception
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
		
		objAccountSummaryNew.verifyViewProfileLink();
		objAccountSummaryNew.clickonViewProfileLink();
		objAccountSummaryNew.getTextofPracticeName();
		objAccountSummaryNew.ClickonCloseButton();
		Thread.sleep(4000);
		objAccountSummaryNew.verifySignOutButton();
		Thread.sleep(4000);
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		Thread.sleep(4000);
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED THE TEST CASE OF CLICK ON VIEW PROFILE LINK" + "\n CheckwithViewProfile " +e.getLocalizedMessage());
		}
		}
	
	@Test(priority=5, enabled=true)
	public void CheckwithViewProfileAndGettheSlots() throws Exception
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
		
		objAccountSummaryNew.verifyViewProfileLink();
		objAccountSummaryNew.clickonViewProfileLink();
		objAccountSummaryNew.getTextofPracticeName();
		objAccountSummaryNew.verifyClickonHourone();
		objAccountSummaryNew.clickOnToSeeHours1();
		Thread.sleep(3000);
		objAccountSummaryNew.getHours1List();	
		
		objAccountSummaryNew.verifyClickonHourTwo();
		objAccountSummaryNew.clickOnToSeeHours2();
		objAccountSummaryNew.getHours2List();
		
		objAccountSummaryNew.verifyClickonHourThree();
		objAccountSummaryNew.clickOnToSeeHours3();
		//objAccountSummaryNew.getHours3List();
		
		objAccountSummaryNew.ClickonCloseButton();
		objAccountSummaryNew.verifySignOutButton();
		Thread.sleep(4000);
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		Thread.sleep(4000);
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED THE TEST CASE OF CLICK ON VIEW PROFILE LINK" + "\n CheckwithViewProfile " +e.getLocalizedMessage());
		}
		}
	
	@Test(priority=6, enabled=true)
	public void verifyScheduleMenu() throws Exception
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
		objAccountSummaryNew.MovetoSchedule();
		String parent=objAccountSummaryNew.Parentwindow();
	    System.out.println(parent);
//		objAccountSummaryNew.verifySentItem();
		objGenericAppointmentRequestPage=objAccountSummaryNew.clickOnRequestforAppointment();
		
		Thread.sleep(5000);
		objAccountSummaryNew=objGenericAppointmentRequestPage.clickOnHomeButtonOnGenericApptRequest();
		objAccountSummaryNew.MovetoSchedule();
		objMyAppointmentsPage=objAccountSummaryNew.clickOnMyAppointments();
		
		Thread.sleep(5000);
		
		objAccountSummaryNew.verifySignOutButton();
		objSurveyOptInPage=objAccountSummaryNew.clickOnSignOutButton();
		objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();
		}
		catch (Exception e)
		{
			throw new Exception(" Verify Mail Menu Test case Failed" +e.getLocalizedMessage());
		}
		}
	public String getExcelTest(int row,int column) throws Exception
	{
		ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "Login");
		return ExcelutilObject.getCellData(row, column);
}
	
}
