package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();		
		browser.get("http://www.mortgage-calculators.us/");
		
		WebElement loanamt_txtbox=browser.findElement(By.name("AMOUNT"));
		loanamt_txtbox.clear();
		loanamt_txtbox.sendKeys("10000");
		
		WebElement Rate_txtbox=browser.findElement(By.name("RATE"));
		Rate_txtbox.clear();
		Rate_txtbox.sendKeys("12");
		
		WebElement Length_lstbox=browser.findElement(By.name("YEARS"));
		Length_lstbox.sendKeys("5");
		
		WebElement Payment_lstbox=browser.findElement(By.name("FREQUENCY"));
		Payment_lstbox.sendKeys("Monthly");
		
		WebElement Calc_btn=browser.findElement(By.name("cmdCalc"));
		Calc_btn.click();
		
		WebElement EMI_Output=browser.findElement(By.name("PAYMENT"));
		String App1_Result = EMI_Output.getAttribute("value");
		
		System.out.println("App1 Result is  "+App1_Result);
		//*****************************************************************
		
		browser.get("http://www.calcxml.com/calculators/mortgage-calculator?");
		
		WebElement Loanamt2_txtbox = browser.findElement(By.id("loanAmount"));
		Loanamt2_txtbox.clear();
		Loanamt2_txtbox.sendKeys("10000");
		
		WebElement Interest2_txtbox = browser.findElement(By.id("interestRate"));
		Interest2_txtbox.clear();
		Interest2_txtbox.sendKeys("12");
		
		WebElement Months2_txtbox = browser.findElement(By.id("termMonths"));
		Months2_txtbox.clear();
		Months2_txtbox.sendKeys("60");
		
		
		WebElement Submit_btn = browser.findElement(By.className("pure-button-primary"));
		Submit_btn.click();
		
		
		WebElement Output2_txt = browser.findElement(By.className("resultText"));
		String Result_txt = Output2_txt.getText();
		//System.out.println(Result_txt);
		
		String[] Result_arr = Result_txt.split(" ");
		String App2_Result = Result_arr[5];
		
		System.out.println("App2 Result is  " +App2_Result);
		
		//Validate
		
		if(App2_Result.equals(App1_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//close
		browser.close();
		
		
		
		

	}

}
