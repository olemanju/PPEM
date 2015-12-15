package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pp.util.BasePageObject;



public class AccountSummaryNew extends BasePageObject
{

	public  AccountSummaryNew(WebDriver driver)
	{
		super(driver);
	}
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By DashBoardMessage= By.id("ctl00_ContentPlaceHolder1_lblAccSumHeadTxt");
	By LoginMessage=By.id("ctl00_lblPatientName");
	By SignOutButton= By.id("ctl00_SignOutButton");
	By PatientEducationLbl= By.id("ctl00_lblPatEduSearch");
	By PatientEducationTxt=By.id("ctl00_txtPatEduSearch");
	By patientEducationSearch=By.id("ctl00_btnPatEduSearch");
	By ViewProfilePage=By.linkText("View Profile Page");
	By Patient_informationLbl=By.id("ctl00_ContentPlaceHolder1_dashboardPractices_lblPracticeInformation");
	By Inboxlnk=By.linkText("Inbox");
	By UpcomingAppointmentslnk=By.linkText("Upcoming Appointments");
	By ScheduleApptLnk=By.linkText("Schedule an Appointment");
	By Reminders=By.id("ctl00_ContentPlaceHolder1_AlertsWidget2_lblNotificationHeader");
	By results=By.id("ctl00_ContentPlaceHolder1_ucLabResults_lblLabHeader");
	By Medicationslbl=By.id("ctl00_ContentPlaceHolder1_ucMedications_lblMedHeader");
	
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
	public boolean verifyDashBoardMessage() throws Exception
	{
		Log.info("Verifying the DashBoard Message box is displyed on the Page");
		try 
		{
			flag=isElementPresent(DashBoardMessage);
			Assert.assertTrue(flag, "DashBoardmessage Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE DASHBOARD MESSAGE LABEL " + " \nverifyDashBoardMessage "+ e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyWelcomeMessage() throws Exception
	{
		Log.info("Verification of Welcome Message");
		try 
		{
			flag=isElementPresent(LoginMessage);
			Assert.assertTrue(flag, "Welcome Message is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE WELCOME MESSAGE"+ "\n verifyWelcomeMessage"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public boolean verifySignOutButton() throws Exception
	{
		Log.info("Verification of Signout button");
		try 
		{
			flag=isElementPresent(SignOutButton);
			Assert.assertTrue(flag, "Signout Button is not displayed");
			return flag;
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED VERIFYING THE SIGNOUT ELEMENT" + "\n verifySignOutButton" + e.getLocalizedMessage());
		}
		
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return surveyoptinPage
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public SurveyOptInPage clickOnSignOutButton() throws Exception
	{
		Log.info("Clicking on Signout button");
		try
		{
			uiDriver.findElement(SignOutButton).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING SIGN OUT BUTTON" +"\n clickOnSignOutButton " +e.getLocalizedMessage());
		}
		return new SurveyOptInPage(uiDriver);
		
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyPatientEducation() throws Exception
	{
		Log.info("Verification of Patient Education Label");
		try {
			
			flag=uiDriver.findElement(PatientEducationLbl).isDisplayed();
			Assert.assertTrue(flag, "Patient Eductaion Label is Not Existing on the Page");
			
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE PATIENT  EDUCATION lABEL " + "\n verifyPatientEducation" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyPatientEducationTextBox() throws Exception
	{
		Log.info("Verification of Patient Education Text Box");
		try
		{
			flag=uiDriver.findElement(PatientEducationTxt).isDisplayed();
			Assert.assertTrue(flag, "Patient Education Text box is Missing");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE PATIENT EDUCATION TEXTBOX" + "\n verifyPatientEducationTextBox  " + e.getMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifySearchButton() throws Exception
	{
		Log.info("Verification of Search button");
		try
		{
			flag=uiDriver.findElement(patientEducationSearch).isDisplayed();
			Assert.assertTrue(flag, "Patient Education Search Button  is Missing on the Page");
			return flag;
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH BUTTON " + "\n verifySearchButton "  + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyPatientInformation() throws Exception
	{
		Log.info("Verification of  Patient information Label");
		try {
			flag=uiDriver.findElement(Patient_informationLbl).isDisplayed();
			Assert.assertTrue(flag, "Patient Information Label is Missing on the Page");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE PATIENT INFORMATION LABEL " + "\n verifyPatientInformation" + e.getLocalizedMessage());
		}
	}
}
