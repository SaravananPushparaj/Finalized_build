package lp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLogin {
	WebDriver browser;
	
	@FindBy(linkText="Sign In")
	WebElement lk_SignIn;
	
	@FindBy(name="logid")
	WebElement txt_Uname;
	
	@FindBy(name="pswd")
	WebElement txt_Pwd;
	
	@FindBy(css="html body table tbody tr td table tbody tr td table tbody tr td.sb2 table tbody tr td.sb1 input")
	WebElement bt_Login;
	
	@FindBy(css="html body table tbody tr td table tbody tr td table tbody tr td table tbody tr td font b")
	WebElement msg_InvalidResult;
	
	@FindBy(css="html body div#wrap div#header.topborder.relative div.floatR.extra_gap div.floatL div span#username.bold a.proper")
	WebElement msg_ValidResult;
	
	@FindBy(linkText="Sign Out")
	WebElement lk_SignOut;
	
	
	
//	Utility_Class c1=new Utility_Class();
//	
	public PageObjectLogin(WebDriver Dbrowser) throws IOException
	{
//		String btype = c1.reading_properties("Browser_type");
//		
//		if(btype.equals("ff"))
//		{
//			this.browser= new FirefoxDriver();
//			System.out.println("Firefox started");
//		}
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
//		
		this.browser=Dbrowser;
		PageFactory.initElements(browser, this);
		
		
		//browser.manage().deleteAllCookies();
//		browser.get(c1.reading_properties("URL"));		
				
	}
	
	public void Click_sign_in()
	{
		lk_SignIn.click();
	}
	
	
	public void Enter_username(String Value)
	{
		txt_Uname.sendKeys(Value);
	}
	
	
	public void Enter_Pwd(String Value)
	{		
		txt_Pwd.sendKeys(Value);
	}
	
	
	public void Click_login()
	{
		bt_Login.click();
	}
	
	
	public String getResult_Invalid()
	{
		return msg_InvalidResult.getText();
	}
	
	
	public String getValidResult()
	{
		return msg_ValidResult.getText();
		
	}
	
	public void Click_Signout()
	{
		lk_SignOut.click();		
	}
	
	public WebDriver getbrowser()
	
	{
		return browser;		
	}
	
//	public void Close_Browser()
//	{
//		browser.close();
//		
//	}
	
	public void Common_process_Login_Component(String TC_ID,String Uname,String Pwd) throws IOException
	{
		
		this.Click_sign_in();
		this.Enter_username(Uname);
		this.Enter_Pwd(Pwd);
		this.Click_login();				
	}
	
	

}
