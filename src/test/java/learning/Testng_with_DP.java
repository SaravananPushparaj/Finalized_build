package learning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_with_DP {
	
	@Test(dataProvider="dp_EMI",dataProviderClass=learning.DataProvider_EMI.class)
	public static void EMI_Test(String Amount, String Interest, String Tenure, String Exp_Res) throws InterruptedException, IOException
	{
		Utility_class1 c1= new Utility_class1();
		WebDriver browser= new FirefoxDriver();
		browser.get(c1.Reading_properties("URL"));
		browser.manage().window().maximize();
		
		WebElement amount_txtbox = browser.findElement(By.id("loanamount"));
		amount_txtbox.clear();
		amount_txtbox.sendKeys(Amount);
		
		
		WebElement Rate_txtbox = browser.findElement(By.id("rate"));
		Rate_txtbox.clear();
		Rate_txtbox.sendKeys(Interest);
		
		
		WebElement months_txtbox = browser.findElement(By.id("pmonths"));
		months_txtbox.clear();
		months_txtbox.sendKeys(Tenure);
		
		browser.findElement(By.id("Button1")).click();
		
		Thread.sleep(3000);
		
		WebElement EMI_txtbox = browser.findElement(By.id("EMI"));
		String Actual_result = EMI_txtbox.getAttribute("value");
		
		Assert.assertEquals(Actual_result, Exp_Res);
		
		browser.close();
		
		
		
	}
	

}
