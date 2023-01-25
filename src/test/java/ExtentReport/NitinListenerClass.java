package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NitinListenerClass implements ITestListener
{

	public ExtentReports extent = new ExtentReports();
    
    public ExtentTest test;
@Override
public void onTestStart(ITestResult result) {
	 test = extent.createTest(result.getMethod().getMethodName());
	 
	 System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Start");
}

@Override
public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Test passed");
	
	System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Success");
}

@Override
public void onTestFailure(ITestResult result) {
	 test.log(Status.FAIL, "Test failed");
	 
	 System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Failure");
}

@Override
public void onTestSkipped(ITestResult result) {
	  test.log(Status.SKIP, "Test skipped");
	  
	  System.out.println("Test Case : "+result.getMethod().getMethodName()+" has been Skipped");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	
}

@Override
public void onStart(ITestContext context) {
	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	 
        extent.attachReporter(htmlReporter);
        
        System.out.println("Test Case : "+context.getName()+" has been Start");
}

@Override
public void onFinish(ITestContext context) {
	 extent.flush();
	 
	 System.out.println("Test Case : "+context.getName()+" has been Finish");
}



}


