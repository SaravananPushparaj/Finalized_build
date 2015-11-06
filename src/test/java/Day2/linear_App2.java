package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linear_App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.homeloanshub.com/mortgage-calculator/");
		
		String Tenure="5";
		double xl_final=Double.parseDouble(Tenure)*12;
		
		browser.findElement(By.name("principal")).sendKeys("10000");
		browser.findElement(By.name("interest")).sendKeys("12");
		browser.findElement(By.name("tenure")).sendKeys(Tenure);
		
		browser.findElement(By.cssSelector("input[class='btn1'][value='Calculate']")).click();
		
		List<WebElement> wt_list = browser.findElements(By.xpath("//*[@id='emiresults']/table/tbody/tr"));
		int rowcount = wt_list.size();
		System.out.println(rowcount);
		
		for(int j=2;j<=rowcount;j++)
		{
			WebElement wt_months_element = browser.findElement(By.xpath("//*[@id='emiresults']/table/tbody/tr["+j+"]/td[1]"));
			String wt_months_val = wt_months_element.getText();
			double wt_months_val_final=Double.parseDouble(wt_months_val);
			
			if(wt_months_val_final==xl_final)			
			{
				WebElement wt_month_Emi = browser.findElement(By.xpath("//*[@id='emiresults']/table/tbody/tr["+j+"]/td[2]"));
				String wt_EMI_val = wt_month_Emi.getText();
				
				System.out.println(wt_EMI_val);
			}
			
			
		}
		
		browser.findElement(By.cssSelector("input[class='btn1'][value='Reset']")).click();
		
		
		browser.close();
		

	}

}
