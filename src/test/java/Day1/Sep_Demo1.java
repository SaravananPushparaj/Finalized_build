package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sep_Demo1 {
	
	
	public static void main(String[] args) {
		
		//expected result
		
		String Expected_result="222.44";
		
		//Launch the browser
		//interface refrence object  Object
		WebDriver browser= new FirefoxDriver();
		
		//maximize
		browser.manage().window().maximize();
		
		
		//open the url
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		
		
		//identify the webelement of loan amount
		
		WebElement loanamount_txtbox=browser.findElement(By.id("loanamount"));
		
		//Enter the value
		loanamount_txtbox.sendKeys("10000");
		
		//identify the webelement of Interest rate
		WebElement Interest_txtbox=browser.findElement(By.id("rate"));
				
		//Enter the value
		Interest_txtbox.sendKeys("12");
		
		//identify the webelement of Period
		WebElement period_txtbox=browser.findElement(By.name("pmonths"));
		//Enter the value
		period_txtbox.sendKeys("60");	
		
		//identify the webelement of Calculate btn
		WebElement Calculate_btn=browser.findElement(By.id("Button1"));
				
		//click on the btn
		Calculate_btn.click();		
		
		//identify EMI
		WebElement EMI_txtbox= browser.findElement(By.id("EMI"));
			
		//get the ouput
		String Actual_Result = EMI_txtbox.getAttribute("value");
		
		
		System.out.println("Expected Result is  "+Expected_result);
		System.out.println("Actual Result is   "+Actual_Result);
		
		//Validate 
		
		if(Expected_result.equals(Actual_Result))
		{
			
			System.out.println("Pass");
			
		}
		
		else
			
		{
			System.out.println("Fail");
		}
		
		
		//close the browser
		
		browser.close();
		
		
		
		
		
		
		
	}
	
	
	

}
