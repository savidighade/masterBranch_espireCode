package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassTest 
{
	public static void setUpConfig()
	{
		System.setProperty("wendriver.chrome.driver", "C:\\Users\\savita.dighade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
	
	}

}
