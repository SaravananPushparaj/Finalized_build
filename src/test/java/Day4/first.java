package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {
	
	public static void main(String[] args) throws IOException {
		int i;
		
		for(i=1;i<=2;i++)
		{
		//***************************************************
		BufferedReader Reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Amount");
		String Amount = Reader.readLine();
		
		System.out.println("Enter Interest");
		String Interest = Reader.readLine();
		
		System.out.println("Enter the Years");
		String Years = Reader.readLine();
		
		System.out.println("Enter months");
		String months = Reader.readLine();
		
		
		
		
		//****************************************************
		
		//launch firefox
		//interface reference objet= firefox
		WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();
		//open url
		browser.get("http://www.mortgage-calculators.us/");		
		
		//identify amount txtbox and enter the value
		WebElement loanamt_txtbox=browser.findElement(By.name("AMOUNT"));
		loanamt_txtbox.clear();
		loanamt_txtbox.sendKeys(Amount);
		
		//identify Rate txtbox and enter the value
		WebElement Interest_txtbox=browser.findElement(By.name("RATE"));
		Interest_txtbox.clear();
		Interest_txtbox.sendKeys(Interest);
		
		//identify length lstbox and select the value
		WebElement length_lstbox=browser.findElement(By.name("YEARS"));
		length_lstbox.sendKeys(Years);
		//identify Payment lstbox and select the value
		WebElement monthly_lstbox=browser.findElement(By.name("FREQUENCY"));
		monthly_lstbox.sendKeys("Monthly");
		
		//identify Calc btn and click on the btn
		WebElement Calc_btn=browser.findElement(By.name("cmdCalc"));
		Calc_btn.click();
		//identify mortage payment and get the output
		WebElement EMI_output=browser.findElement(By.name("PAYMENT"));
		System.out.println(EMI_output);
			
		//store the output
		String App1_Result = EMI_output.getAttribute("value");
		System.out.println("App1 Result is  "+App1_Result);
		//open the next app
		//2nd app
		browser.navigate().to("http://www.calcxml.com/calculators/mortgage-calculator?");
		
		WebElement loanamt2_txtbox=browser.findElement(By.id("loanAmount"));
		loanamt2_txtbox.clear();
		loanamt2_txtbox.sendKeys(Amount);
		
		
		WebElement Rate2_txtbox=browser.findElement(By.id("interestRate"));
		Rate2_txtbox.clear();
		Rate2_txtbox.sendKeys(Interest);
		
		WebElement months_txtbox=browser.findElement(By.id("termMonths"));
		months_txtbox.clear();
		months_txtbox.sendKeys(months);
		
		
		WebElement Submit_btn=browser.findElement(By.className("pure-button-primary"));
		Submit_btn.click();
		
		WebElement Result=browser.findElement(By.className("resultText"));
		String Result_text = Result.getText();
		String[] Result_arr = Result_text.split(" ");
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
		
		//close the browser
		browser.close();
		
		}
	}

}
