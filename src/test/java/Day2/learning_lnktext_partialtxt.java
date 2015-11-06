package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learning_lnktext_partialtxt {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=2;i++)
		{
		BufferedReader Reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Expected Result");
		String Expected_Result = Reader.readLine();
		
		System.out.println("Enter the Uname");
		String Uname = Reader.readLine();
		
		System.out.println("Enter the Pwd");
		String Pwd = Reader.readLine();
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://books.rediff.com/");
		
		browser.findElement(By.linkText("Sign In")).click();
		
		Thread.sleep(3000);
		browser.findElement(By.name("logid")).sendKeys(Uname);
		browser.findElement(By.name("pswd")).sendKeys(Pwd);
		
		browser.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td.sb2 table tbody tr td.sb1 input")).click();
		
		String Actual_Result = browser.findElement(By.className("proper")).getText();
		System.out.println("Actual Result is "+ Actual_Result);
		
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		browser.findElement(By.partialLinkText("Out")).click();
		
		browser.close();
		}

	}

}
