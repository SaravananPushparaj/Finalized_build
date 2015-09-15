package learning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing_EMI {
	
	@Test(dataProvider="dp_EMI",dataProviderClass=learning.DataProvider_For_EMI.class)
	
	public void Scenario_EMI(String Amount, String Interest, String Tenure, String Exp_Res) throws IOException
	
	{
		Utility_class c1= new Utility_class();
		
		WebDriver driver = new FirefoxDriver();
		driver.get(c1.Reading_Properties("URL"));
		
		driver.findElement(By.id("loanamount")).sendKeys(Amount);
		driver.findElement(By.id("rate")).sendKeys(Interest);
		driver.findElement(By.id("pmonths")).sendKeys(Tenure);
		
		driver.findElement(By.id("Button1")).click();
		
		String Actual_Result = driver.findElement(By.id("EMI")).getAttribute("value");
		
		Assert.assertEquals(Actual_Result, Exp_Res);
		
		driver.close();
		
	}
	

}
