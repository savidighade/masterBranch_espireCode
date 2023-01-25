package ExtentReport;

import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerNewClass extends ITestReportTest implements ITestListener
{

	public static ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void ConfigReport()
	{
		htmlReporter=new ExtentSparkReporter("ExtentDemo.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		//reports.attachReporter(htmlReporter);
		
		//system config
		reports.setSystemInfo("Machin", "Machin1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("broweser", "Chrome");
		reports.setSystemInfo("Host", "QA");
		
		//change look and feel
		htmlReporter.config().setDocumentTitle("Listener Report");
		htmlReporter.config().setReportName("First Listener report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		
	}
	@Override
	public void onTestStart(ITestResult result) 
	{
		
		System.out.println("Test case execution will start"+" "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("It will exceute for pass test case"+ " "+result.getName());

		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Pass TC Name: "+result.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("It will exceute for fail test case"+ " "+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Failed TC Name: "+result.getName(), ExtentColor.RED));
		
		try
		{
			TakesScreenshot ts=(TakesScreenshot) dr;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String path=System.getProperty("user.dir")+"\\Screenshot.png";
			File destination=new File(path);
			org.openqa.selenium.io.FileHandler.copy(source, destination);
		}
		catch(IOException e)
		{
			System.out.println("Exception arrived catch in executing");
			
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("It will exceute for skip test case"+" "+ result.getName());
 
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Skip TC Name: "+result.getName(), ExtentColor.AMBER));

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		ConfigReport();
		System.out.println("It will start prog execution"+" "+ context.getName());

		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("End of execution"+ " "+context.getName());

		reports.flush();
		
	}

}
