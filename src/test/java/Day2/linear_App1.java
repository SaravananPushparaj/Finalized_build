package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linear_App1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.calcxml.com/calculators/mortgage-calculator?");
		
		WebElement loanamount_txtbox = browser.findElement(By.id("loanAmount"));
		loanamount_txtbox.clear();
		loanamount_txtbox.sendKeys("10000");
		
		WebElement Interest_txtbox = browser.findElement(By.id("interestRate"));
		Interest_txtbox.clear();
		Interest_txtbox.sendKeys("12");
		
		WebElement months_txtbox = browser.findElement(By.id("termMonths"));
		months_txtbox.clear();
		//String dataype from excel
		String Tenure="5";
		double Tenure_months=Double.parseDouble(Tenure)*12;     
        
		//convert double to string
		months_txtbox.sendKeys(String.valueOf(Tenure_months).replace(".0", ""));
		
		
		WebElement Submit_btn = browser.findElement(By.className("pure-button-primary"));
		Submit_btn.click();
		
		Thread.sleep(3000);
		
		String Result_txt = browser.findElement(By.className("resultText")).getText();
		String[] Result_arr = Result_txt.split(" ");
		String Actual_Result = Result_arr[5];
		
		System.out.println(Actual_Result);
		
		browser.close();
		
		

	}

}
