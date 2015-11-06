package Day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import lp.Utility_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Class {
	
Utility_Class c1=new Utility_Class();
private FirefoxDriver browser1;
	
//WebDriver browser;
	public void launch_browser() throws IOException
	{
		String btype = c1.reading_properties("Browser_type");
		
		if(btype.equals("ff"))
		{
			browser1= new FirefoxDriver();
			System.out.println("Firefox started");
		}
//		else if(btype.equals("ch"))
//		{
//			System.setProperty("webdriver.chrome.driver", c1.reading_properties("Chrome_Path"));
//			this.browser= new ChromeDriver();
//		}
//		
//		else if(btype.equals("ie"))
//		{
//			System.setProperty("webdriver.ie.driver", c1.reading_properties("IE_Path"));
//			this.browser= new InternetExplorerDriver();
//			
//		}
		
		
		
		//browser.manage().deleteAllCookies();
		browser1.get(c1.reading_properties("URL"));		
//		browser.manage().window().maximize();
//		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	public void Close_Browser()
	{
		browser1.close();
		
	}

}
