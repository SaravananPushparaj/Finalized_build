package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google implements Search {
	WebDriver browser;
	
	public void launch()
	{
		browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.google.com");
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public String SearchResult(String search_item) 
	{
		browser.findElement(By.id("lst-ib")).sendKeys(search_item);
		browser.findElement(By.className("lsb")).click();
		
		
		
		String Result_txt = browser.findElement(By.cssSelector("#resultStats")).getText();
		String[] Result_arr = Result_txt.split(" ");
		String Actual_Result = Result_arr[1];
		
		//System.out.println(Actual_Result);
		return Actual_Result;
		
		
	}
	
	
	public void close()
	{
		browser.close();
	}
	
	public void Hi()
	{
		System.out.println("Hi");
	}
	

}
