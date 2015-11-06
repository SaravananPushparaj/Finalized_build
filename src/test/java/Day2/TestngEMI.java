package Day2;

import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestngEMI {
	
	@Test(dataProvider="dp_EMI",dataProviderClass=Day2.DataproviderEMI.class)
	public void testEMI(String Amount, String Rate, String months, String Exp_Res) throws IOException
	{
		Utility_Class c1=new Utility_Class();
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get(c1.Reading_Properties("URL"));
		
		browser.findElement(By.id("loanamount")).sendKeys(Amount);
		browser.findElement(By.id("rate")).sendKeys(Rate);
		browser.findElement(By.id("pmonths")).sendKeys(months);
		
		browser.findElement(By.id("Button1")).click();
		
		String Actual_Res = browser.findElement(By.id("EMI")).getAttribute("value");
		
		browser.close();
		Assert.assertEquals(Exp_Res, Actual_Res);
			
			
		
	}

}
