package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nonstatic_def {
	WebDriver browser;
	
	public  void launch()
	{
		browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.bing.com/");
		
	}
	
	public void EnterValues(String Search_item)
	{
		browser.findElement(By.id("sb_form_q")).sendKeys(Search_item);
		browser.findElement(By.id("sb_form_go")).click();
		
	}
	
	public String getResult()
	{
		String Result = browser.findElement(By.className("sb_count")).getText();
		//System.out.println(Result);
		
		String[] Result_arr = Result.split(" ");
		String Actual_Result = Result_arr[0];
		
		//System.out.println(Actual_Result);
		return Actual_Result;
		
		
	}
	
	public void close_browser()
	{
		browser.close();
	}

}
