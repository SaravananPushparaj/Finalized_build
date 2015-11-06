package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sep_Demo3 {
	
	
	public static void main(String[] args) {
		
		//expected result
		String Expected_Result="222.44";
		
		//launch the browser
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();		
		
		//open the url
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
			
		//identify loan amount
		
		WebElement loanAmount_txtbox=browser.findElement(By.id("loanamount"));
		
		//System.out.println(loanAmount_txtbox);
		//Enter the value
		loanAmount_txtbox.sendKeys("10000");
		
		//identify the rate
		WebElement Rate_txtbox=browser.findElement(By.id("rate"));
		
		//enter the value
		Rate_txtbox.sendKeys("12");
		
		//identify the months
		WebElement months_txtbox= browser.findElement(By.id("pmonths"));
		
		
		//enter the value
		months_txtbox.sendKeys("60");
		//identify the calc button
		
		WebElement Calc_btn= browser.findElement(By.name("Button1"));
		
		//click on the button
		Calc_btn.click();		
		
		//identify EMI
		WebElement EMI_txtbox=browser.findElement(By.name("EMI"));
	
		//get the actual result
		String Actual_result = EMI_txtbox.getAttribute("value");
		
		System.out.println("Actual Result is  "+Actual_result);
		System.out.println("Expected Result  is  "+Expected_Result);
		
		
		//validate
		
		if(Actual_result.equals(Expected_Result))
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
