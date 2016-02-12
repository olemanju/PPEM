package com.pp.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pp.util.BasePageObject;

public class GenericAppointmentRequestPage extends BasePageObject
{

	public GenericAppointmentRequestPage(WebDriver driver) 
	{
		super(driver);		
		
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
	
	By HomeButton=By.id("ctl00_ucHeader_lnkHomeMenuItem");
	
	By PracticeSelectDrop=By.id("ctl00_ContentPlaceHolder1_PracticePersonSelector1_ddlPractices");
	
	By SelectProviderDrop=By.id("ctl00_ContentPlaceHolder1_ddlProviders");
	
	By SelectCategoryDrop=By.id("ctl00_ContentPlaceHolder1_ddlCategories");
	By selectLocationsDrop=By.id("ctl00_ContentPlaceHolder1_ddlLocation");
	
	
	By ResonforApptment=By.id("ctl00_ContentPlaceHolder1_txtReason");
	By priorityDrop=By.id("ctl00_ContentPlaceHolder1_ddlUrgency");
	By MakeApptmentforDrop=By.id("ctl00_ContentPlaceHolder1_ddlAppointmentFor");
	By StartdateTextbox=By.id("ctl00_ContentPlaceHolder1_txtStartDate");
	
	By Startdate=By.id("ctl00_ContentPlaceHolder1_imgStartDate");
	
	By startDateTable=By.id("ctl00_ContentPlaceHolder1_imgStartDate");
	By EndDateTextbox=By.id("ctl00_ContentPlaceHolder1_txtEndDate");
	
	By Enddate=By.id("ctl00_ContentPlaceHolder1_imgEndDate");
	By PrefferedTimeFromdrop=By.id("ctl00_ContentPlaceHolder1_ddlStartTimes");
	By PreferredToTimeDrop=By.id("ctl00_ContentPlaceHolder1_ddlEndTimes");
	By DaysCheckboxesmul=By.id("//table[@id='ctl00_ContentPlaceHolder1_chkFirstPreferredDays']//tr/td/input");
	
	By SubmitButton=By.id("ctl00_ContentPlaceHolder1_btnSubmit");
	
	
/* Variables*/
	
	String PageTitle=null;
	boolean flag=false;
	String Parent_window=null;
	String Child_window=null;
	String actual_Result=null;
	String expected_Result=null;
	
	/********************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public AccountSummaryNewpage clickOnHomeButtonOnGenericApptRequest() throws Exception
	{
		Log.info("Clicking on Home button from clickOnHomeButtonOnGenericApptRequest  screen");
		
		try {
			uiDriver.findElement(HomeButton).click();
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON THE HOMEPAGE BUTTON FROM clickOnHomeButtonOnGenericApptRequest  " + "\n clickOnHomeButtonOnGenericApptRequest " +e.getLocalizedMessage());
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
	public void selectPracticeDropdown(String practicename) throws Exception
	{
		Log.info("Verification of Practice dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(PracticeSelectDrop)).selectByValue(practicename);
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
	public void selectProviderDropdown(String Providername) throws Exception
	{
		Log.info("Verification of Provider Name  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(SelectProviderDrop)).selectByValue(Providername);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE PROVIDER NAME DROPDOWN" +"\n selectProviderDropdown" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectCategoryDropdown(String Categoryrname) throws Exception
	{
		Log.info("Verification of Category Name  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(SelectCategoryDrop)).selectByValue(Categoryrname);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE CATEGORY NAME DROPDOWN" +"\n selectCategoryDropdown" + e.getLocalizedMessage());
		}
	}
	

	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectLocationDropdown(String Locationrname) throws Exception
	{
		Log.info("Verification of Location Name  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(selectLocationsDrop)).selectByValue(Locationrname);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE LOCATION NAME DROPDOWN" +"\n selectLocationDropdown" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void enterReasonForAppointment(String appoint) throws Exception
	
	{
		Log.info("Enter Reason for Appointment Text box");
		try {
			uiDriver.findElement(ResonforApptment).sendKeys(appoint);
		} catch (Exception e) {
			throw new Exception(	"FAILED WHILE ENTERING REASON FOR APPOINTMENT TEXTBOX " +"\n enterReasonForAppointment " + e.getLocalizedMessage());
		}
	}
	

	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectProrityDropdown(String Priorityrname) throws Exception
	{
		Log.info("Verification of Priority Name  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(priorityDrop)).selectByValue(Priorityrname);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE PRIORITY NAME DROPDOWN" +"\n selectProrityDropdown" + e.getLocalizedMessage());
		}
	}
	

	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectMakeAppointmentForDropdown(String AppointmentFor) throws Exception
	{
		Log.info("Verification of Appointment For  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(MakeApptmentforDrop)).selectByValue(AppointmentFor);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE MAKE APPOINTMENT FOR DROPDOWN" +"\n selectMakeAppointmentForDropdown" + e.getLocalizedMessage());
		}
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void EnterStartDate() throws Exception
	{
		Log.info("Clicking on EnterStartDate button");
		try 
		{
			
			uiDriver.findElement(startDateTable).click();
			Thread.sleep(2000);
			List<WebElement> Dates= uiDriver.findElements(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_CalExtStartDate_popupDiv']/div[2]//table[@id='ctl00_ContentPlaceHolder1_CalExtStartDate_daysTable']/tbody/tr/td"));
			
			int count= Dates.size();
			
			for(int i=0; i<=Dates.size(); i++)
			{
				
				String date=Dates.get(i).getText();
				
				if(date.equalsIgnoreCase("14"))
				{
					Dates.get(i).click();
					break;
				}
				
		} 
		}
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE ENTERING START DATE " +"\n EnterStartDate" + e.getLocalizedMessage());
		}
		
	}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public void EnterEndDate() throws Exception
	{
		Log.info("Clicking on EnterEndDate button");
		try 
		{
			
			uiDriver.findElement(Enddate).click();
			Thread.sleep(2000);
			List<WebElement> EndDates= uiDriver.findElements(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_CalExtEndDate_popupDiv']/div[2]//table[@id='ctl00_ContentPlaceHolder1_CalExtEndDate_daysTable']/tbody/tr/td"));
			
			int count= EndDates.size();
			
			for(int i=0; i<=EndDates.size(); i++)
			{
				
				String enddate=EndDates.get(i).getText();
				
				if(enddate.equalsIgnoreCase("15"))
				{
					EndDates.get(i).click();
					break;
				}
				
		} 
		}
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE ENTERING END DATE " +"\n EnterEndDate" + e.getLocalizedMessage());
		}
		
	}
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	public void selectPreferredTimeFrom(String FromTime) throws Exception
	{
		Log.info("Verification of selectPreferredTimeFrom For  dropdown");
		
		try
		{
		//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
			
			new Select(uiDriver.findElement(PrefferedTimeFromdrop)).selectByValue(FromTime);
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE MAKE APPOINTMENT FROM TIME DROPDOWN" +"\n selectPreferredTimeFrom" + e.getLocalizedMessage());
		}
	
	
	}
		/**********************************************************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return flag
		 * @throws Exception
		 * This method will check whether DashBoard message is displayed on page.
		 */
		public void  selectPreferredTimeTo(String ToTime) throws Exception
		{
			Log.info("Verification of Appointment For  dropdown");
			
			try
			{
			//selectDropDown(Practicedropdown, "7c46a640-d4f4-4987-bbc1-cfd0c446b552");
				
				new Select(uiDriver.findElement(PreferredToTimeDrop)).selectByValue(ToTime);
			} 
			catch (Exception e) 
			{
				throw new Exception("FAILED WHILE SELECTING THE MAKE APPOINTMENT TO DROPDOWN" +"\n selectPreferredTimeTo" + e.getLocalizedMessage());
			}
	
	
		}
	
	/**********************************************************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check whether DashBoard message is displayed on page.
	 */
	
	public AppointmentRenewalSubmittedPage clickonSubmitButtonOfAppointment() throws Exception
	{
		Log.info("Clicking on submit button");
		try {
			uiDriver.findElement(SubmitButton).click();
		} catch (Exception e) {
			throw new Exception("FAILED WHILE CLICKING ON SUBMIT BUTTON " +"\n clickonSubmitButtonOfAppointment" + e.getLocalizedMessage());
		}
		return new AppointmentRenewalSubmittedPage(uiDriver);
	}
}
