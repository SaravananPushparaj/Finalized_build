package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paramterize_tescase {
	
public static void main(String[] args) throws IOException {
		
		
		
		//Launch firefox and open the url
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.calcxml.com/calculators/mortgage-calculator?");
		//***********************************************
		
		BufferedReader Reader= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Amount ");
		String Amount = Reader.readLine();
		
		System.out.println("Enter the Interest rate");
		String Interest = Reader.readLine();
		
		System.out.println("Enter the months");
		String Months = Reader.readLine();
		
		System.out.println("Enter the Years");
		String Years = Reader.readLine();
		
		
		
		//********************************************************
		
		
		//identify the loan amount input the value
		WebElement loanamount_txtbox = browser.findElement(By.id("loanAmount"));
		loanamount_txtbox.clear();
		loanamount_txtbox.sendKeys(Amount);
		
		//identify the Interest rate and input the value
		WebElement Rate_txtbox = browser.findElement(By.id("interestRate"));
		Rate_txtbox.clear();
		Rate_txtbox.sendKeys(Interest);
		
		//identify the months and  input the value
		WebElement month_txtbox = browser.findElement(By.id("termMonths"));
		month_txtbox.clear();
		month_txtbox.sendKeys(Months);
		
		
		//identify submit button and click on the button
		WebElement Submit_btn = browser.findElement(By.className("pure-button-primary"));
		Submit_btn.click();
		
		//Get the output of app1
		WebElement Result = browser.findElement(By.className("resultText"));
		String Result_text = Result.getText();
		System.out.println(Result_text);
		
		String[] Result_arr = Result_text.split(" ");
		String App1_Result = Result_arr[5];
		System.out.println("App1 result is  " + App1_Result );
		
		//*********************************************************
		//2nd App
		
		//browser.get("http://www.mortgage-calculators.us/");
		browser.navigate();
		browser.get("http://www.mortgage-calculators.us/");
		
		
		WebElement loanamt2_txtbox = browser.findElement(By.name("AMOUNT"));
		loanamt2_txtbox.clear();
		loanamt2_txtbox.sendKeys(Amount);
		
		WebElement Rate2_txtbox = browser.findElement(By.name("RATE"));
		Rate2_txtbox.clear();
		Rate2_txtbox.sendKeys(Interest);
		
		WebElement length_lstbox = browser.findElement(By.name("YEARS"));
		length_lstbox.sendKeys(Years);
		
		WebElement Payment_lstbox = browser.findElement(By.name("FREQUENCY"));
		Payment_lstbox.sendKeys("Monthly");
		
		
		browser.findElement(By.name("cmdCalc")).click();
		
		WebElement Output = browser.findElement(By.name("PAYMENT"));
		String App2_Result = Output.getAttribute("value");
		
		System.out.println("App2 result is  " +App2_Result);
		
		
		//Validate App1 and App2
		
		if(App2_Result.equals(App1_Result))
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
