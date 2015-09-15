package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_with_Provider {
	
	@Test(dataProvider="dp_EMI_data",dataProviderClass=Framework.DataProvider_EMI.class)
	
	public void EMI_data_Test(String Amount, String Interest,String Tenure,String Exp_Result) throws InterruptedException
	{
		
		WebDriver browser= new FirefoxDriver();
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		browser.manage().window().maximize();
		
		WebElement Amount_txtbox = browser.findElement(By.id("loanamount"));
		Amount_txtbox.clear();
		Amount_txtbox.sendKeys(Amount);
		
		WebElement Rate_txtbox = browser.findElement(By.id("rate"));
		Rate_txtbox.clear();
		Rate_txtbox.sendKeys(Interest);
		
		
		WebElement months_txtbox = browser.findElement(By.id("pmonths"));
		months_txtbox.clear();
		months_txtbox.sendKeys(Tenure);
		
		
		WebElement Cal_btn = browser.findElement(By.id("Button1"));
		Cal_btn.click();
		
		Thread.sleep(3000);
		
		WebElement EMI_output = browser.findElement(By.id("EMI"));
		String Actual_Result = EMI_output.getAttribute("value");
		
		Assert.assertEquals(Actual_Result,Exp_Result);
		
		browser.close();
		
		
		
		
	}
	

}
