package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learning_absolutecss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		browser.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table.width_1015 tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr td input#loanamount")).sendKeys("10000");
		
		browser.findElement(By.cssSelector("input[id='rate'][type='text']")).sendKeys("12");
		browser.findElement(By.cssSelector("#pmonths")).sendKeys("60");
		
		browser.findElement(By.cssSelector("input#Button1")).click();
		
		String Actual_Result = browser.findElement(By.cssSelector("#EMI")).getAttribute("value");
		
		System.out.println(Actual_Result);
		
	}

}
