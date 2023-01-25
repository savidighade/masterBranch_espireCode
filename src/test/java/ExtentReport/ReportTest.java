package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ReportTest
{

	/*static ExtentTest test;
	static ExtentReports report;
	
	@BeforeTest
	public static void startTest()
	{
		report=new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport.html");
		test=report.startTest("ExtentTest");
		
	}
	
	@Test
	public static void VerifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savita.dighade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		String actualTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String expectedTitle=dr.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		if(actualTitle.equals(expectedTitle))
		
		{
			dr.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")).click();
			dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[9]/span/a/span")).click();
			dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[6]/span/a/span")).click();
			dr.findElement(By
					.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/span/div/a/div/div"))
					.click();
			
			test.log(LogStatus.PASS, "Test Pass");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}
		@AfterTest
		public static void endTest()
		{
			report.endTest(test);
			report.flush();
		}*/
	}
	

