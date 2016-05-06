/**
 * 
 */
package com.pp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.pp.common.NKConstants;
import com.pp.pages.AccountSummaryNewpage;
import com.pp.pages.AppointmentRenewalSubmittedPage;
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
import com.pp.util.BaseTestObject;
import com.pp.util.ExcelutilObject;

/**
 * @author manjunathr
 *
 */
public class GenericAppointmentRequestTest  extends BaseTestObject
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
	AppointmentRenewalSubmittedPage objAppointmentRenewalSubmittedPage;
	
	
	boolean flag;
	String actual_Result=null;
	String parent_window=null;
	
	@Test(priority=1, enabled=true)
	public void LoginAndRequestForAppointment() throws Exception
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
		objAccountSummaryNew.MovetoSchedule();
		objGenericAppointmentRequestPage=objAccountSummaryNew.clickOnRequestforAppointment();
			
		objGenericAppointmentRequestPage.selectPracticeDropdown("cc9821c7-f6bf-42c5-8178-18b73ec8d02a");
		Thread.sleep(1000);
		//objGenericAppointmentRequestPage.selectPatientDropdown("7e473d74-7310-433b-b42b-2c17ca917662");
		//Thread.sleep(1000);
		objGenericAppointmentRequestPage.selectProviderDropdown("b73a66c2-52e1-48e1-9698-4729ccfe4cb1");
		Thread.sleep(1000);
		objGenericAppointmentRequestPage.selectCategoryDropdown("9569c583-f127-4a27-afc2-0c8e3f67ed4a");
		Thread.sleep(1000);
		objGenericAppointmentRequestPage.selectLocationDropdown("40749c87-c7d9-4cf6-92e7-eda513f7ecd1");
		Thread.sleep(1000);
		
		objGenericAppointmentRequestPage.enterReasonForAppointment("Fever");
		
		objGenericAppointmentRequestPage.selectProrityDropdown("1");
		Thread.sleep(1000);
		
		objGenericAppointmentRequestPage.selectMakeAppointmentForDropdown("1");
		Thread.sleep(1000);
	
		
		String DateVa=getExcelMonth(27, 2);
		System.out.println(DateVa + "DateValue");
		//objGenericAppointmentRequestPage.EnterStartDate(datevalue, monthval);
		
		String monthva=getExcelMonth(3, 2);
		System.out.println(monthva + " Month");
		objGenericAppointmentRequestPage.EnterStartDate(DateVa, monthva);
		
		String EndDateVa=getExcelGetDatet(20, 0);
		System.out.println(EndDateVa + "Value");
		
		String Endmonthva=getExcelMonth(3, 4);
		System.out.println(Endmonthva + " Month");
		objGenericAppointmentRequestPage.EnterEndDate(EndDateVa, Endmonthva);
		
		objGenericAppointmentRequestPage.selectPreferredTimeFrom("11:00 AM");
		Thread.sleep(1000);
		
		objGenericAppointmentRequestPage.selectPreferredTimeTo("11:30 AM");
		Thread.sleep(1000);

		objAppointmentRenewalSubmittedPage=objGenericAppointmentRequestPage.clickonSubmitButtonOfAppointment();
		objAppointmentRenewalSubmittedPage.verifyAppointmentSentTextMessage();
		objAppointmentRenewalSubmittedPage.CheckProperMessageGetDisplayedforAppitConfirmation();
		
		objAccountSummaryNew.verifySignOutButton();
		objLoginPage=objAccountSummaryNew.clickOnSignOutButton();
	/*	objSurveyOptInPage.verifyDecideLaterbutton();
		objLoginPage=objSurveyOptInPage.clickOnIwillDecideLaterButton();
		objLoginPage.compareSighOutMessage();*/
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED THE TEST CASE OF CLICK ON LOGIN BUTTON" + "\n clickOnLoginWithValidCredentials  " +e.getLocalizedMessage());
		}
		}
	
	public String getExcelTest(int row,int column) throws Exception
	{
		ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "Login");
		return ExcelutilObject.getCellData(row, column);
}
	
	public String getExcelGetDatet(int row,int column) throws Exception
	{
		ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "DateSelect");
		return ExcelutilObject.getCellData(row, column);
}
	public String getExcelMonth(int row, int column) throws Exception
	{
		ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "ApptStartDate");
		return ExcelutilObject.getCellData(row, column);
	}
}
