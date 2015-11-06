package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oct_Demo1 {
	
	public static void main(String[] args) {
		
		//launch the firefox
		//Interface reference obj= Object of Firefox
		WebDriver browser= new FirefoxDriver();
		//open the url
		browser.manage().window().maximize();
		
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		//Identify the loanamount txtbox
		WebElement loanAmount_txtbox=browser.findElement(By.id("loanamount"));
		//System.out.println(loanAmount_txtbox);	
		//Enter the values
		loanAmount_txtbox.sendKeys("10000");
		
		//Identify the Rate txtbox		
		WebElement Rate_txtbox=browser.findElement(By.id("rate"));			
		//Enter the values
		Rate_txtbox.sendKeys("12");
				
		//Identify the Period txtbox
		WebElement Period_txtbox= browser.findElement(By.id("pmonths"));
		Period_txtbox.sendKeys("60");
				
		//Identify the Calc btn
		WebElement Cal_btn=browser.findElement(By.id("Button1"));
		//click on the btn
		Cal_btn.click();		
		
		//identify the EMI
		WebElement EMI_Output=browser.findElement(By.id("EMI"));
		String Actual_Result = EMI_Output.getAttribute("value");
		//get the output
		System.out.println("Actual Result is  "+Actual_Result);
		
		
		browser.close();
		
		
		
		
		
	}

}
