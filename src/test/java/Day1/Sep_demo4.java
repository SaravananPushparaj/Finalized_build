package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sep_demo4 {
	
	public static void main(String[] args) {
		//expected result
		String Expected_Result="59,00,000";
		
		//launch
		WebDriver browser=new FirefoxDriver();
		
		//maximize
		browser.manage().window().maximize();
		
		//open url
		browser.get("http://www.bing.com/");
		
		//identify and enter value
		WebElement Search_txtbox=browser.findElement(By.id("sb_form_q"));
		Search_txtbox.sendKeys("Selenium");
		//identify and click on search
		WebElement Search_btn= browser.findElement(By.className("b_searchboxSubmit"));
		Search_btn.click();
		
		//identify the webelement and get the value
		WebElement Result=browser.findElement(By.className("sb_count"));
		String Result_txt = Result.getText();
		String[] Result_arr = Result_txt.split(" ");
		
		String Actual_Result = Result_arr[0];
		
		System.out.println("Expected Result   "+Expected_Result);
		System.out.println("Actual Result   "+Actual_Result);
		
		
		//validate
		if(Actual_Result.equals(Expected_Result))
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
