package com.pp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pp.util.BasePageObject;

public class MyAppointmentsPage extends BasePageObject
{

	public MyAppointmentsPage(WebDriver driver) 
	{
		super(driver);		
		
	}
	public static Logger Log= Logger.getLogger(Logger.class.getName());
}
