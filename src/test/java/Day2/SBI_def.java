package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_def {
	
	WebDriver browser;
	
	public void launch()
	{
		browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
			
	}
	
	public void EnterValues(String Amount, String Rate, String months)
	{
		//absolute
				browser.findElement(By.xpath("html/body/div[1]/div[4]/div[2]/div[2]/table/tbody/tr/td[2]/div/div[2]/div/div/div/div[1]/div/form/table/tbody/tr[2]/td[1]/p[1]/input")).sendKeys(Amount);
				
				//Relative
				browser.findElement(By.xpath("//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[3]/input")).sendKeys(Rate);
				
				//manual construct
				browser.findElement(By.xpath("//input[@class='textbox'][@name='uTime']")).sendKeys(months);
				
				browser.findElement(By.xpath("//input[@type='Button'][@value='Calculate']")).click();
		
	}
	
	public String getresult()
	{
		String Actual_Result = browser.findElement(By.xpath("//input[@class='textbox'][@name='uEmi']")).getAttribute("value");
		//System.out.println(Actual_Result);
		return Actual_Result;
		
	}
	
	public void browser_close()
	{
		browser.close();
	}

}
