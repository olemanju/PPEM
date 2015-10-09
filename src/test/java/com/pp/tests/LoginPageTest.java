package com.pp.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.pp.pages.LoginPage;
import com.pp.pages.TermsAndConditionsPage;
import com.pp.util.BaseTestObject;

public class LoginPageTest extends BaseTestObject
{
	
	private static Logger Log= Logger.getLogger(Logger.class.getName());
	
	
	LoginPage objLoginPage;
	TermsAndConditionsPage objTermsAndConditionsPage;
	
	
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
	
	
	

}
