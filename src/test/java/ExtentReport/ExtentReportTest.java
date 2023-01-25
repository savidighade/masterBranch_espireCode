package ExtentReport;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ExtentReportTest {
	/*static ExtentTest test;
	static ExtentReports report;

	@BeforeTest
	public static void startTest() {
		// String currentDir=System.getProperty("user.dir");
		// System.out.println("Current dir:"+currentDir);
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("Testing");

	}

	@Test
	public void LoginToApplication() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\savita.dighade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();

		dr.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")).click();
		dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[9]/span/a/span")).click();
		dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[6]/span/a/span")).click();
		dr.findElement(By
				.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/span/div/a/div/div"))
				.click();
				
	   /*WebElement Oneplusmob=dr.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71AvQd3VzqL._AC._SR360,460.jpg']"));
	   Oneplusmob.click();*/

		//test.log(LogStatus.PASS, "Test Pass");

		//report.flush();
		//report.endTest(test);

	}


