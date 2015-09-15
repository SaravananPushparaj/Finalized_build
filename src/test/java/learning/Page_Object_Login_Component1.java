package learning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Page_Object_Login_Component1 {
	
	WebDriver browser;
	Utility_class c1= new Utility_class();
	
	public void SetBrowser() throws IOException
	{
		
		String btype = c1.Reading_Properties("Browser_type");
		
		if(btype.equals("ff"))
		{
			browser= new FirefoxDriver();
		}
		
		else if(btype.equals("ch"))
		{
			System.setProperty("webdriver.chrome.driver",c1.Reading_Properties("Chrome_Path") );
			browser= new ChromeDriver();
		}
		
		else if(btype.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",c1.Reading_Properties("IE_Path") );
			browser= new InternetExplorerDriver();
		}
		
		
		browser.get(c1.Reading_Properties("URL"));
		browser.manage().window().maximize();
		
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void Click_Signin()
	{
		browser.findElement(By.linkText("Sign In")).click();
	}
	
	public void Enter_Uname(String Value)
	{
		browser.findElement(By.name("logid")).sendKeys(Value);
	}
	
	public void Enter_Pwd(String Value)
	{
		browser.findElement(By.name("pswd")).sendKeys(Value);
	}
	
	public void Click_login()
	{
		browser.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
	}
	
	public String getInvalidResult()
	{
		return browser.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td table tbody tr td font b")).getText();
	}
	
	public String getValidResult()
	{
		return browser.findElement(By.linkText("qtpworld2008 g")).getText();
	}
	
	public void Click_signout()
	{
		browser.findElement(By.linkText("Sign Out")).click();
	}
	
	public void Close_browser()
	{
		browser.close();
	}

}
