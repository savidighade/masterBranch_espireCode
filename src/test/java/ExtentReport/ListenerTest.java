package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




public class ListenerTest implements ITestListener
{
	/*public static ExtentReports extent;
	static ExtentTest extenttest;
	static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	  
	
	@BeforeTest
	public void beforeSuite()
	{
		extent=new ExtentReports(System.setProperty("test.html","xyz"));
		
		extenttest=extent.startTest("DemoExtentReport");
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		
		/*test.set(extent.startTest((result.getMethod().getMethodName())));*/
		//System.out.println(("Test Case : "+result.getMethod().getMethodName()+" has been Start"));
	}


//@Override
/*public void onTestSuccess(ITestResult result) 
{
	
	System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Success");
	
	 test.get().log(LogStatus.PASS, "Test passed");
}

/*@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Failure");
	
	test.get().log(LogStatus.FAIL, "Test failed: " + result.getThrowable());
}*/

//@Override
/*public void onTestSkipped(ITestResult result) 
{
	System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Skipped");
	
	 test.get().log(LogStatus.SKIP, "Test skipped");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
{
}

@Override
public void onTestFailedWithTimeout(ITestResult result)
{	
}

@Override
public void onStart(ITestContext context) 
{
	System.out.println("Test Case : "+context.getName()+" has been Start");
}

@Override
public void onFinish(ITestContext context)
{
	System.out.println("Test Case : "+context.getName()+" has been Finish");
	
}

 @AfterSuite
 
 public void aftersuite()
 {
	 extent.flush();
 }*/
 

//}
