package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datadriven {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver browser= new FirefoxDriver();
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		browser.manage().window().maximize();
		
		Xls_Reader datatable=new Xls_Reader("D:\\EMI_Data1.xlsx");
		int rowCount = datatable.getRowCount("Sheet1");
		
		for(int i=2; i<=rowCount;i++)
		{
			
			String Amount = datatable.getCellData("Sheet1", "Amount", i);
			String Interest = datatable.getCellData("Sheet1", "Interest", i);
			String Tenure = datatable.getCellData("Sheet1", "Tenure", i);
			String Exp_Result = datatable.getCellData("Sheet1", "Exp_Result", i);
			
			
			WebElement amount_txtbox = browser.findElement(By.id("loanamount"));
			amount_txtbox.clear();
			amount_txtbox.sendKeys(Amount);
			
			
			WebElement Rate_txtbox = browser.findElement(By.id("rate"));
			Rate_txtbox.clear();
			Rate_txtbox.sendKeys(Interest);
			
			
			WebElement months_txtbox = browser.findElement(By.id("pmonths"));
			months_txtbox.clear();
			months_txtbox.sendKeys(Tenure);
			
			browser.findElement(By.id("Button1")).click();
			
			Thread.sleep(3000);
			
			WebElement EMI_txtbox = browser.findElement(By.id("EMI"));
			String Actual_result = EMI_txtbox.getAttribute("value");
			
			datatable.setCellData("Sheet1", "Actual_Result", i, Actual_result);
			
			if(Exp_Result.equals(Actual_result))
			{
				datatable.setCellData("Sheet1", "Status", i, "Pass");
			}
			else
			{
				datatable.setCellData("Sheet1", "Status", i, "Fail");
			}
			
		}
		
		browser.close();
		
	}
	

}
