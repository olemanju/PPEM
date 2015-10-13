package com.pp.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.pp.common.NKConstants;
import com.pp.pages.EnrollPage;
import com.pp.pages.LoginPage;
import com.pp.pages.TermsAndConditionsPage;
import com.pp.util.BaseTestObject;

public class EnrollPageTest extends BaseTestObject
{
	private static Logger log=Logger.getLogger(Logger.class.getName()); 
	
	/**********************************************************************************************************************************************/
	
	LoginPage objLoginPage;
	TermsAndConditionsPage objTermsCondition;
	EnrollPage objEnrollPage;
	
	/***********************************UI elements*************************************************************************************************/
	By EnrollPage_Text1_element=By.id("ctl00_ContentPlaceHolder1_lblFirstInstruction");
	By EnrollPage_Text2_element=By.id("ctl00_ContentPlaceHolder1_lblSecondInstruction");
	By EnrollPage_Radio1_element=By.xpath("//td[input[@id='ctl00_ContentPlaceHolder1_radEnroll']]/label");
	By EnrollPage_Radio2_element=By.xpath("//td[input[@id='ctl00_ContentPlaceHolder1_radTempLogin']]/label");
	
	
	@Test
	public void verifyEnrollPageElements() throws Exception
	{
		objLoginPage=new LoginPage(uiDriver);
		objTermsCondition=objLoginPage.clickOnIamNewHereButton();
		objEnrollPage=objTermsCondition.clickOnIAcceptButton();
		objEnrollPage.verifyEnrollPageDisplay(NKConstants.Enroll_Form_title);
		objEnrollPage.verifyTextPresent(NKConstants.EnrollPage_Text1, EnrollPage_Text1_element);
		objEnrollPage.verifyTextPresent(NKConstants.EnrollPage_text2, EnrollPage_Text2_element);
		objEnrollPage.verifyEnrollPageRadioButtons(EnrollPage_Radio1_element, NKConstants.EnrollPage_radio_text1);
		objEnrollPage.verifyEnrollPageRadioButtons(EnrollPage_Radio2_element, NKConstants.EnrollPage_radio_text2);
		
		
	}

}
