package gg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Page_Object_Book_Search1 {
	
	WebDriver browser;
	Utility_Class1 c1= new Utility_Class1();
	
	public void SetBrowser() throws IOException
	{
		String btype = c1.Reading_properties("Browser_type");
		
		if(btype.equals("ff"))
		{
			browser= new FirefoxDriver();
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
		
		
		browser.get(c1.Reading_properties("URL"));
		
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	public void Enter_Searchbook(String Value)
	{
		browser.findElement(By.id("srchword")).sendKeys(Value);
	}
	
	public void Click_Search_btn()
	{
		browser.findElement(By.className("newsrchbtn")).click();
	}
	
	public String getValid_Search()
	{
		return browser.findElement(By.id("find")).getText();
	}
	
	public String getInvalidSearch()
	{
		return browser.findElement(By.cssSelector("html body div#wrap div#myDataDiv.hide center div#notify.div_notify p.sorrymsg")).getText();
	}
	
	public void Close_Browser()
	{
		browser.close();
	}
	
	public void SetBrowser( WebDriver browser)
	{
		this.browser=browser;
		
	}
	
	public WebDriver getBrowser()
	{
		return browser;
	}
	
	

}
