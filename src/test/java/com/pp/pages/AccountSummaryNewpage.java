package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.pp.util.BasePageObject;



public class AccountSummaryNewpage extends BasePageObject
{

	public  AccountSummaryNewpage(WebDriver driver)
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
	By composeanEmail=By.linkText("Compose an Email");
	
	By MailMenu=By.id("ctl00_ucHeader_lnkMailMenuItem");
	By inBox=By.id("ctl00_ucHeader_mailRepeater_ctl00_lnkSubMenuItem");
	By SentItems=By.id("ctl00_ucHeader_mailRepeater_ctl01_lnkSubMenuItem");
	By ComposeMessageElement=By.id("ctl00_ucHeader_mailRepeater_ctl02_lnkSubMenuItem");
	
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
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyViewProfilePageLink() throws Exception
	{
		Log.info("Verification of View Profile page Link");
		try 
		{
			flag=uiDriver.findElement(ViewProfilePage).isDisplayed();
			Assert.assertTrue(flag, "View Profile Page Link is Missing");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW PROFILE PAGE " +"\n verifyViewProfilePageLink" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return this
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public AccountSummaryNewpage clickOnViewProfilePageLink() throws Exception
	{
		Log.info("Clicking on View Profile Page Link");
		try 
		{
			uiDriver.findElement(ViewProfilePage).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW PROFILE PAGE LINK " + "\n clickOnViewProfilePageLink" + e.getLocalizedMessage());
		}
		return this;
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyComposeAnEmail() throws Exception
	{
		Log.info("Verifying the Compose An Email");
		try 
		{
			flag=uiDriver.findElement(composeanEmail).isDisplayed();
			return flag;
		}
		catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE COMPOSE AN EMAIL" + "\n verifyComposeAnEmail" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public ComposeMessagePage clickOnComposeEmailClick() throws Exception
	{
		Log.info("Clicking on Compose Email Link");
		try 
		{
			uiDriver.findElement(composeanEmail).click();
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON COMPOSE EMAIL LINK" + "\n clickOnComposeEmailClick " +e.getLocalizedMessage());
		}
		return new ComposeMessagePage(uiDriver);
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyMailMenu() throws Exception
	{
		Log.info("Verification of Mail Menu");
		try 
		{
			flag=uiDriver.findElement(MailMenu).isDisplayed();
			Assert.assertTrue(flag, "Mail Menu is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE MAIL MENU"+ "\n verifyMailMenu"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public void MovetoMailMenu() throws Exception
	{
		Log.info("Moving to mail Menu" );
		try {
			
			mouseover(MailMenu);
			//String Parentwindow=uiDriver.getWindowHandle();
			//System.out.println(Parentwindow);
	//Actions avt=new Actions(uiDriver);
//	avt.moveToElement(uiDriver.findElement(MailMenu)).build().perform();
			
		} catch (Exception e) {
			Log.info("I am not able to move to mail Menu" );
			throw new Exception("FAILED WHILE MOVING  to THE MAIL MENU "  + "\n MovetoMailMenu"+e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyInbox() throws Exception
	{
		Log.info("Verification of inBox Menu");
		try 
		{
			flag=isElementPresent(inBox);
			Assert.assertTrue(flag, "inbox  Menu is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE INBOX MENU"+ "\n verifyInbox"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifySentItem() throws Exception
	{
		Log.info("Verification of SentItem Menu");
		try 
		{
			flag=isElementPresent(SentItems);
			Assert.assertTrue(flag, "Sent Item  Menu is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE Sent item MENU"+ "\n verifySentItem"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyComposeMessage() throws Exception
	{
		Log.info("Verification of Compose Message");
		try 
		{
			flag=isElementPresent(ComposeMessageElement);
			Assert.assertTrue(flag, "Compose Message Element  Menu is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE Compose Message MENU"+ "\n verifyComposeMessage"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public InboxPage clickonInBoxMenu() throws Exception
	{
		try 
		{
			mouseoverAndClick(Inboxlnk);
			//MovetoMailMenu();
			//Actions acti= new Actions(uiDriver);
			//acti.moveToElement(uiDriver.findElement(inBox)).click().build().perform();
			Thread.sleep(2000);
			switchToNewWindow();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE Clicking on  clickonInBoxMenu"+ "\n clickonInBoxMenu"+e.getLocalizedMessage());
		}
		return new InboxPage(uiDriver);
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public String  Parentwindow() throws Exception
	{
		Log.info("Selection of Parent window");
		
		try {
			
			Parent_window=getWindowName();
			return Parent_window;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE Clicking on  selectParentwindow"+ "\n selectParentwindow"+e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public void getChildWindowsofInbox() throws Exception
	{
Log.info("Selection of getChildWindowsofInbox");
		
		try {
			
			switchToNewWindow();
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE Clicking on  getChildWindowsofInbox"+ "\n getChildWindowsofInbox"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public void switchtoParentInbox(String parentwin) throws Exception
	{
		try {
			switchToParentWindow(parentwin);
		} catch (Exception e) {
			throw new Exception("FAILED WHILE Clicking on  switchtoParentInbox"+ "\n switchtoParentInbox"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public OutboxPage clickOnSentItemsMenu() throws Exception
	{
		Log.info("Clicking on Sent Items menu");
		
		try {
			
			mouseoverAndClick(SentItems);
			Thread.sleep(3000);
			switchToNewWindow();
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE SENT ITEMS MENU " +"\n clickOnSentItemsMenu" + e.getLocalizedMessage());
		}
		return new OutboxPage(uiDriver);
	}
}
