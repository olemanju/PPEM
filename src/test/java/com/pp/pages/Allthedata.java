




/*package com.pp.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.red.pages.SelectBusPage;
import com.red.util.BasePageObject;
import com.red.util.ReadConfigFile;

public class Allthedata 
{
	browser=FF
			url=https://www.redbus.in/
			sorucename=bangalore
			destination=hydrabad
			dateofjourney=3
			month=may
		
					public class ReadConfigFile 
					{

						
						public static String readcon(String property) throws IOException
						{
							FileInputStream fileinpt= new FileInputStream(".\\config.Properties");
							
							Properties prop= new Properties();
							
								prop.load(fileinpt);
							
								String prpvalue= prop.getProperty(property);
							
								System.out.println(prpvalue);
									
								return prpvalue;
						}
					}
	public class BaseTestObject
	{
		
		public static WebDriver uidriver;
		
		@BeforeTest
		public void setup() throws Exception
		{
			String browser= ReadConfigFile.readcon("browser");
			String url= ReadConfigFile.readcon("url");
			
			
			if(browser.equalsIgnoreCase("FF"))
			{
				uidriver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("GC"))
			{
				uidriver= new ChromeDriver();
			}
			uidriver.get(url);
			uidriver.manage().window().maximize();
			uidriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void teardown() throws Exception
		{
			uidriver.quit();
		}

	}
	public class BasePageObject 
	{
	public WebDriver uidriver;

	public BasePageObject( WebDriver driver) 
	{
		uidriver=driver;
	}

	public boolean iselementPresent(By Ele) throws Exception
	{
			uidriver.findElement(Ele);
			return true;
			}

	public  String getPageTitle()
	{
			return uidriver.getTitle().trim();
	}

	public void EnterTextValue(By Ele, String Value)
	{
		uidriver.findElement(Ele).sendKeys(Value);
	}

	public void clickOnSubmit(By Ele)
	{
		uidriver.findElement(Ele).click();
	}
	}

	
	public class RedPage extends BasePageObject
	{

		public RedPage(WebDriver driver) 
		{
		super(driver);
		}
		
		*//*********************UI Elements******************//*
		By srcfield=By.id("txtSource");
		By destfield=By.id("txtDestination");
		By datefield=By.id("txtOnwardCalendar");
		By SearchBtn=By.id("searchBtn");
		
		public void enterSrcPlace(String srcname) throws Exception
		{
			try
			{
				EnterTextValue(srcfield, srcname);
			}
			catch(Exception e)
			{
				throw new Exception("unable to type srcname...e.printStackTrace()");
			}
			
		}
		
		
		public void enterDestPlace(String destname) throws Exception
		{
			try
			{
				EnterTextValue(destfield, destname);
			}
			catch(Exception e)
			{
				throw new Exception("unable to type srcname...e.printStackTrace()");
			}
			
		}
		
		public void enterDate(String datevalue, String monthval) throws Exception
		{
			By dateele=By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table[@class='monthTable first']//td[contains(text(),'"+datevalue+"')]");
			int count=0;
			try
			{
				
				clickOnSubmit(datefield);
				
				
				switch (monthval)
				{
				case "january":
					count=1;
					break;
					
				case "february":
					count=2;
					break;

				case "march":
					count=3;
					break;
				case "april":
					count=4;
					break;
				case "may":
					count=5;
					break;
				case "june":
					count=6;
					break;
					
				case "july":
					count=7;
					break;
				case "august":
					count=8;
					break;
				case "september":
					count=9;
					break;
				case "october":
					count=10;
					break;
				case "november":
					count=11;
					break;
				case "december":
					count=12;
					break;

				default:
					break;
				}
				
				System.out.println(count);
				
				if(count>3)
				{
					while((count-3)!=0)
					{
						uidriver.findElement(By.xpath("//div[@id='rbcal_txtOnwardCalendar']//table[@class='monthTable last']//td[@class='next']")).click();
						count--;
					}
				}
				
				clickOnSubmit(dateele);
			}
			catch(Exception e)
			{
				throw new Exception("unable to enter Date value..."+e.getMessage());
				
			}
			
		}
		
		
		public SelectBusPage clickSearchBtn() throws Exception
		{
			try
			{
				clickOnSubmit(SearchBtn);
			}
			catch(Exception e)
			{
				throw new Exception("unable to click on Search Button..."+e.getLocalizedMessage());
			}
			return new SelectBusPage(uidriver);
		}

	}
	
	public class SelectBusPage extends BasePageObject
	{

		public SelectBusPage(WebDriver driver) 
		{
			super(driver);
		}
		
		*//****************************************//*
		By fareLink=By.partialLinkText("Fare");
		By farefield=By.xpath("(//div[@class='busItem clearfix'])[1]//div[@class='fareBlock busDataBlock']/div/span[2]");
		
		public void clickOnFare() throws Exception
		{
			try
			{
				clickOnSubmit(fareLink);
			
			}
			catch(Exception e)
			{
				throw new Exception("unable to type srcname...e.printStackTrace()");
			}
		}
		
		
		public void getMaxFare() throws Exception
		{
			try
			{
				clickOnFare();
				
				WebElement ele=uidriver.findElement(farefield);
				
				
				String MaxFare=ele.getText();
				System.out.println("Maxium Fare is "+MaxFare);
				
				
				
			}
			catch(Exception e)
			{
				System.out.println("Fare Values are not dislayed...");
//				throw new Exception("unable to type srcname...e.printStackTrace()");
			}
		}

	}
	
<suite name="RedBus Suite">
    
    <test name="Smoke Test">
        
        <classes>
            <class name="com.red.tests.FareTest">
                
            </class>
        </classes>
    </test>
</suite>

public class SelectBusesPage  extends BasePageObject
{

	public SelectBusesPage(WebDriver driver)
	{
		super(driver);
	}
	
	By pricexpath=By.xpath("//div/div/span[2]/span");
	
	
	public void getPrice() throws Exception
	{
		try {
			
			List<WebElement> prices= uidriver.findElements(pricexpath);
			
	System.out.println("Total Count" + prices.size());
	
	ArrayList<String> pr= new ArrayList<String>();
	
	for(int i=0; i<prices.size(); i++)
	{
		pr.add(prices.get(i).getText());
	}
			
	System.out.println("List please" + pr);
	
	
	List<Integer> ltprice= new ArrayList<Integer>();
	
	for(String str: pr)
	{
		ltprice.add(Integer.valueOf(str));
	}
	
	
	TreeSet<Integer> highst= new TreeSet<Integer>(ltprice);
	
	System.out.println("Highest Value Is " + highst.last());
	
	
		} catch (Exception e) {
			throw new Exception(e.getLocalizedMessage());
		}
	}
	
	
	
}

}
*/