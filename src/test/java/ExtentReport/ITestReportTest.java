package ExtentReport;

import java.util.logging.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ITestReportTest 
{
	public static WebDriver dr;
	
	
	@Test
	public static void method1()
	{
		/*System.out.println("Method1....Pass");
		Assert.assertTrue(true);*/
		
		System.setProperty("wendriver.chrome.driver", "C:\\Users\\savita.dighade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		
		dr.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")).click();
		dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[9]/span/a/span")).click();
		dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[6]/span/a/span")).click();
		dr.findElement(By
				.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/span/div/a/div/div"))
				.click();
		
	}
	@Test
	public static void method2()
	{
		System.out.println("Method2...Fail");
		Assert.assertTrue(false);
		
	}
	@Test
	public static void method3()
	{
		System.out.println("Method3....Skip");
		throw new SkipException("This is skip method");
	}
	@Test
	public static void method4()
	{
		System.out.println("Method4....Pass");
		Assert.assertTrue(true);
	}
	@Test
	public static void method5()
	{
		System.out.println("Method5....Fail");
		Assert.assertTrue(false);
	}
}

