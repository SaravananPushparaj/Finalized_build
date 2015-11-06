package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sep_demo2 {
	
	
	public static void main(String[] args) {
		//expected result
		
		String Exp_Result="80,40,000";
		
				
		// launch and open url//maximize
		WebDriver browser=new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://www.bing.com/");		
		
		
		//Identify the search txtbox
		WebElement Search_txtbox= browser.findElement(By.id("sb_form_q"));		
		//Enter the value
		Search_txtbox.sendKeys("Selenium");
		
		//Identify the button
		WebElement Search_btn=browser.findElement(By.id("sb_form_go"));
				
		//click the button
		Search_btn.click();
		
		//get the result
		WebElement Result_txt=browser.findElement(By.className("sb_count"));		
		
		String Output = Result_txt.getText();
		
		System.out.println("Expected Result is  "+Exp_Result);
		//System.out.println("Output from App  "+Output);
		
		String[] Result_arr = Output.split(" ");
		String Actual_Result = Result_arr[0];
		System.out.println("Actual Result is  "+Actual_Result);
		//Validate
		if(Exp_Result.equals(Actual_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		//close the browser
		
		browser.quit();
		
		
	}

}
