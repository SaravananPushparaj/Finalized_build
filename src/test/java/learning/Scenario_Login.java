package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_Login {
	
	@Test(dataProvider="dp_InValid_Login",dataProviderClass=learning.DataProvider_Login_Component.class)
	
	public void InValidLogintest(String Uname,String Pwd,String Exp_Res,String TC_ID)
	{
		WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://books.rediff.com/");
		
		//Impicit wait
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Sign_lnk = browser.findElement(By.linkText("Sign In"));
		Sign_lnk.click();
		
		WebElement Uname_txtbox = browser.findElement(By.name("logid"));
		Uname_txtbox.sendKeys(Uname);
		
		WebElement Pwd_txtbox = browser.findElement(By.name("pswd"));
		Pwd_txtbox.sendKeys(Pwd);
		
		WebElement Login_btn = browser.findElement(By.cssSelector("input[type='submit'][value='Login']"));
		Login_btn.click();
		
		WebElement Result_text = browser.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td table tbody tr td font b"));
		String Actual_Res = Result_text.getText();
		
		Assert.assertEquals(Actual_Res, Exp_Res);
		
		browser.close();
		
	}
	
	@Test(dataProvider="dp_ValidLogin",dataProviderClass=learning.DataProvider_Login_Component.class)
	
	public static void Valid_Login(String Uname,String Pwd,String Exp_Res,String TC_ID)
	{
		WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://books.rediff.com/");
		
		//Impicit wait
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Sign_lnk = browser.findElement(By.linkText("Sign In"));
		Sign_lnk.click();
		
		WebElement Uname_txtbox = browser.findElement(By.name("logid"));
		Uname_txtbox.sendKeys(Uname);
		
		WebElement Pwd_txtbox = browser.findElement(By.name("pswd"));
		Pwd_txtbox.sendKeys(Pwd);
		
		WebElement Login_btn = browser.findElement(By.cssSelector("input[type='submit'][value='Login']"));
		Login_btn.click();
		
		WebElement User_lnk = browser.findElement(By.linkText("qtpworld2008 g"));
		String Actual_res = User_lnk.getText();
		
		Assert.assertEquals(Actual_res, Exp_Res);
		
		WebElement Signout_lnk = browser.findElement(By.linkText("Sign Out"));
		Signout_lnk.click();
		
		browser.close();
		
		
		
	}
		

}
