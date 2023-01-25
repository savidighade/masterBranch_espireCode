package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public void SetExtent()
	{
		htmlReporter=new ExtentHtmlReporter("user.dir"+"\\ExtentReportTest.html");
		htmlReporter.config().setDocumentTitle("AutomationTest");
		htmlReporter.config().setReportName("DemoTest");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "API_Automation");
		
	}
public static void endReport()
{
	extent.flush();
}

}
