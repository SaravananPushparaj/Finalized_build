package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Page_Object_Login_Component {
	
	
	WebDriver browser;
	
	Utility_class c1=new Utility_class();
	public void SetBrowser() throws IOException
	{
		String btype = c1.Reading_properties("Browser_type");
		
		if(btype.equals("ff"))
		{
			browser= new FirefoxDriver();
			System.out.println("Firefox started");
		}
		else if(btype.equals("ch"))
		{
			System.setProperty("webdriver.chrome.driver", c1.Reading_properties("Chrome_Path"));
			browser= new ChromeDriver();
		}
		
		else if(btype.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", c1.Reading_properties("IE_Path"));
			browser= new InternetExplorerDriver();
			
		}
		
		
		
		browser.manage().deleteAllCookies();
		browser.get(c1.Reading_properties("URL"));
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	public void Click_sign_in()
	{
		browser.findElement(By.linkText("Sign In")).click();
	}
	
	
	public void Enter_username(String Value)
	{
		
		browser.findElement(By.name("logid")).sendKeys(Value);
	}
	
	
	
	public void Enter_Pwd(String Value)
	{
		
		browser.findElement(By.name("pswd")).sendKeys(Value);
	}
	
	
	public void Click_login()
	{
		browser.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td.sb2 table tbody tr td.sb1 input")).click();
	}
	
	
	public String getResult_Invalid()
	{
		return browser.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td table tbody tr td font b")).getText();
	}
	
	
	public String getValidResult()
	{
		return browser.findElement(By.cssSelector("html body div#wrap div#header.topborder.relative div.floatR.extra_gap div.floatL div span#username.bold a.proper")).getText();
		
	}
	
	public void Click_Signout()
	{
		browser.findElement(By.linkText("Sign Out")).click();
		
	}
	
	public void Close_Browser()
	{
		browser.close();
		
	}
	
	
	
	
	

}
