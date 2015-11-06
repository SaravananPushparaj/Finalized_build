package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class static_method_learning {
	static WebDriver browser;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//input the values
		//********************************************
		for(int i=1;i<=2;i++)
		{
		
		BufferedReader Reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Amount");
		String Amount = Reader.readLine();
		
		System.out.println("Enter the Interest");
		String Interest = Reader.readLine();
		
		System.out.println("Enter the Months");
		String Months = Reader.readLine();
		
		System.out.println("Enter Expected Result");
		String Expected_Result = Reader.readLine();
		
		
		//*************************************************
		//calling the methods
		launch();
		Entervalues(Amount,Interest,Months);
		String Actual_Result = EMI();
		System.out.println(Actual_Result);
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		close_browser();		
		
		}

	}
	
	//launch methhod
	public static void launch()
	{
		browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
	}
	
	public static void Entervalues(String Amount,String Interest,String Months)
	{
		browser.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table.width_1015 tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr td input#loanamount")).sendKeys(Amount);
		
		browser.findElement(By.cssSelector("input[id='rate'][type='text']")).sendKeys(Interest);
		browser.findElement(By.cssSelector("#pmonths")).sendKeys(Months);
		
		browser.findElement(By.cssSelector("input#Button1")).click();
		
	}
	
	public static String EMI()
	{
		String Output = browser.findElement(By.cssSelector("#EMI")).getAttribute("value");
		
		//System.out.println(Actual_Result);
		return Output;
		
		
		
	}
	
	public static void close_browser()
	{
		browser.close();
	}

}








