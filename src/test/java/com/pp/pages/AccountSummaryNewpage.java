package com.pp.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.pp.common.NKConstants;
import com.pp.util.BasePageObject;
import com.pp.util.ExcelutilObject;



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
	By SentitemsLink=By.partialLinkText("Sent Items");
	By ComposeMessageElement=By.id("ctl00_ucHeader_mailRepeater_ctl02_lnkSubMenuItem");
	
	
By viewProfileLink=By.id("ctl00_ContentPlaceHolder1_dashboardPractices_hplViewPractice");
By ppPracticeName=By.xpath("//div/div[@class='modalContent']/div[1]/div[1]");

By ClickToseeHour1=By.id("linkSeeHours0");
By listofhrs1_xpath=By.xpath("//div[@id='xxx0']/div[4]/div");

By ClickToSeeHours2=By.id("linkSeeHours1");
By listofhrs2_xpath=By.xpath("//div[@id='xxx1']/div[4]/div");


By ClickToseeHours3=By.id("linkSeeHours2");
By listofhrs3_xpath=By.xpath("//div[@id='xxx2']/div[4]/div");
By accClosebutton=By.xpath("//div[@id='modalWindow']/a");


By ScheduleMenu=By.id("ctl00_ucHeader_lnkScheduleMenuItem");
By RequestAppt=By.id("ctl00_ucHeader_scheduleRepeater_ctl00_lnkSubMenuItem");
By MyAppts=By.id("ctl00_ucHeader_scheduleRepeater_ctl01_lnkSubMenuItem");

	
	/* Variables*/
	
	String PageTitle=null;
	boolean flag=false;
	String Parent_window=null;
	String Child_window=null;
	String actual_Result=null;
	String expected_Result=null;
	String Ref_value=null;
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
		catch (NoSuchElementException e) 
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
	
	public LoginPage clickOnSignOutButton() throws Exception
	{
		Log.info("Clicking on Signout button");
		try
		{
			waitForAnElement(SignOutButton, 20);
			uiDriver.findElement(SignOutButton).click();
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING SIGN OUT BUTTON" +"\n clickOnSignOutButton " +e.getLocalizedMessage());
		}
		return new LoginPage(uiDriver);
		
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
			flag=isElementPresent(MailMenu);
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
			flag=isElementPresent(SentitemsLink);
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
			
			mouseoverAndClick(SentitemsLink);
				} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE SENT ITEMS MENU " +"\n clickOnSentItemsMenu" + e.getLocalizedMessage());
		}
		return new OutboxPage(uiDriver);
	}
	
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyComposeMessageele() throws Exception
	{
		Log.info("Verification Compose Message element");
		try {
			flag=isElementPresent(ComposeMessageElement);
			Assert.assertTrue(flag, "Compose Message Element is missing on the screen");
			return flag;
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE COMPOSE MESSAGE ELEMENT " +"\n verifyComposeMessage" +e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public ComposeMessagePage clickOnComposeMessageMenu() throws Exception
	{
		Log.info("Clicking on Compose message button");
		
		try {
			mouseoverAndClick(ComposeMessageElement);
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICCKING ON THE COMPOSE MESSAGE BUTTON  " +"\n clickOnComposeMessageMenu "+e.getLocalizedMessage());
		}
		return new ComposeMessagePage(uiDriver);
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyViewProfileLink() throws Exception
	{
		Log.info("Verifying the view profile link is displyed on the Page");
		try 
		{
			flag=isElementPresent(viewProfileLink);
			Assert.assertTrue(flag, "View Profile link  Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW PROFILE LINK MESSAGE LABEL " + " \n verifyViewProfileLink "+ e.getLocalizedMessage() );
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public AccountSummaryNewpage clickonViewProfileLink() throws Exception
	{
		Log.info("Verifying the view profile link is displyed on the Page");
		try 
		{
			uiDriver.findElement(viewProfileLink).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW PROFILE LINK MESSAGE LABEL " + " \n verifyViewProfileLink "+ e.getLocalizedMessage() );
		}
		return new AccountSummaryNewpage(uiDriver);
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public AccountSummaryNewpage ClickonCloseButton() throws Exception
	{
		Log.info("Verifying the close button is displyed on the Page");
		try 
		{
			uiDriver.findElement(accClosebutton).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE ClickonCloseButton " + " \n ClickonCloseButton "+ e.getLocalizedMessage() );
		}
		return new AccountSummaryNewpage(uiDriver);
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void getTextofPracticeName() throws Exception
	{
		try {
			getText(ppPracticeName);
			String Expected="Patient Portal Team Practice2";
			Assert.assertEquals(getText(ppPracticeName), Expected.toUpperCase()," Practice Name values are not Matching");
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE COMPAREING TEXT VALUE OF POPUP SCREEN " + "\n getTextofPracticeName" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyClickonHourone() throws Exception
	{
		Log.info("Verifying the Click on Hours 1st  link is displyed on the Page");
		try 
		{
			flag=isElementPresent(ClickToseeHour1);
			Assert.assertTrue(flag, "Click Hours 1  Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON HOURS 1 LINK MESSAGE LABEL " + " \n verifyClickonHourone "+ e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public AccountSummaryNewpage clickOnToSeeHours1() throws Exception
	{
		try 
		{
			uiDriver.findElement(ClickToseeHour1).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON TO SEE HOURS1 LINK " + "\n clickOnToSeeHours1" + e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void getHours1List() throws Exception
	{
		try
		{
			List<WebElement> hrlist1= uiDriver.findElements(listofhrs1_xpath);
				
			for (WebElement list1 : hrlist1) 
			{
				System.out.println(list1.getText());
				Ref_value=list1.getText();
				ExcelutilObject.writeDataToExcel("Nanda", 1, 2, Ref_value, NKConstants.Path_Write_TestData);
			}
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LIST DETAILS OF HOURS1" + "\n getHours1List" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyClickonHourTwo() throws Exception
	{
		Log.info("Verifying the Click on Hours 2nd  link is displyed on the Page");
		try 
		{
			flag=isElementPresent(ClickToSeeHours2);
			Assert.assertTrue(flag, "Click Hours 2  Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON HOURS 2 LINK MESSAGE LABEL " + " \n verifyClickonHourTwo "+ e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public AccountSummaryNewpage clickOnToSeeHours2() throws Exception
	{
		try 
		{
			uiDriver.findElement(ClickToSeeHours2).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON TO SEE HOURS2 LINK " + "\n clickOnToSeeHours2" + e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void getHours2List() throws Exception
	{
		try
		{
			List<WebElement> HoursList2= uiDriver.findElements(listofhrs2_xpath);
				
			for (WebElement list2 : HoursList2) 
			{
				System.out.println(list2.getText());
				Ref_value=list2.getText();
				ExcelutilObject.writeDataToExcel("Hour2", 1, 2, Ref_value, NKConstants.Path_Write_TestData);
			}
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LIST DETAILS OF HOURS2" + "\n getHours2List" + e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public boolean verifyClickonHourThree() throws Exception
	{
		Log.info("Verifying the Click on Hours 3nd  link is displyed on the Page");
		try 
		{
			flag=isElementPresent(ClickToseeHours3);
			Assert.assertTrue(flag, "Click Hours 3  Element Is Missing on the sreen");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON HOURS 3 LINK MESSAGE LABEL " + " \n verifyClickonHourThree "+ e.getLocalizedMessage() );
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public AccountSummaryNewpage clickOnToSeeHours3() throws Exception
	{
		try 
		{
			uiDriver.findElement(ClickToseeHours3).click();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON TO SEE HOURS3 LINK " + "\n clickOnToSeeHours3" + e.getLocalizedMessage());
		}
		return new AccountSummaryNewpage(uiDriver);
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void getHours3List() throws Exception
	{
		try
		{
			List<WebElement> HoursList3= uiDriver.findElements(listofhrs3_xpath);
				
			for (WebElement list3 : HoursList3) 
			{
				System.out.println(list3.getText());
				Ref_value=list3.getText();
				ExcelutilObject.writeDataToExcel("Hour3", 1, 2, Ref_value, NKConstants.Path_Write_TestData);
			}
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LIST DETAILS OF HOURS3" + "\n getHours3List" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	
	public void MovetoSchedule() throws Exception
	{
		Log.info("Moving to Schedule  Menu" );
		try {
			
			mouseover(ScheduleMenu);
					
		} catch (Exception e) {
			Log.info("I am not able to move to Schedule  Menu" );
			throw new Exception("FAILED WHILE MOVING  to THE Schedule  MENU "  + "\n MovetoSchedule"+e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyRequestAppointment() throws Exception
	{
		Log.info("Verification of Request appointment");
		try 
		{
			flag=isElementPresent(RequestAppt);
			Assert.assertTrue(flag, "Request Appoointment is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE Request Appointment"+ "\n verifyRequestAppointment"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public boolean verifyMyAppointments() throws Exception
	{
		Log.info("Verification of My Appointments ");
		try 
		{
			flag=isElementPresent(MyAppts);
			Assert.assertTrue(flag, "My appointments is not  displayed");
			return flag;
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE VERIFYING THE MY APPOINTMENTS "+ "\n verifyMyAppointments"+e.getLocalizedMessage());
		}
	}
	/**********************************************************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public GenericAppointmentRequestPage clickOnRequestforAppointment() throws Exception
	{
		Log.info("Clicking on clickOnRequestforAppointment menu");
		
		try {
			
			mouseoverAndClick(RequestAppt);
				} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE REQUEST APPOINTMENT MENU " +"\n clickOnRequestforAppointment" + e.getLocalizedMessage());
		}
		return new GenericAppointmentRequestPage(uiDriver);
	}
	
	
	/**********************************************************************************************************************************************************************************************/
	
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether Welcome  message is displayed on page.
	 */
	public MyAppointmentsPage clickOnMyAppointments() throws Exception
	{
		Log.info("Clicking on clickOnMyAppointments menu");
		
		try {
			
			mouseoverAndClick(MyAppts);
				} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE MY APPOINTMENTS " +"\n clickOnMyAppointments" + e.getLocalizedMessage());
		}
		return new MyAppointmentsPage(uiDriver);
	}
	
	
	/**********************************************************************************************************************************************************************************************/	
}
