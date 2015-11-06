package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo implements Search {
	
WebDriver browser;
	
	public void launch()
	{
		browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.search.yahoo.com");
		
	}
	
	public String SearchResult(String search_item)
	{
		browser.findElement(By.id("yschsp")).sendKeys(search_item);
		browser.findElement(By.className("sbb")).click();
		
		String Result_txt = browser.findElement(By.cssSelector(".compPagination > span:nth-child(7)")).getText();
		String[] Result_arr = Result_txt.split(" ");
		String Actual_Result = Result_arr[0];
		
		//System.out.println(Actual_Result);
		return Actual_Result;
		
	}
	
	public void close()
	{
		browser.close();
	}

}
