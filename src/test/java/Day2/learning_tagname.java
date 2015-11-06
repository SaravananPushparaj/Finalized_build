package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learning_tagname {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader Reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Expected_Result ");
		String Expected_Result=Reader.readLine();
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.google.com");
		
		List<WebElement> all_links = browser.findElements(By.tagName("a"));
		System.out.println(all_links.size());
		
		//for each
		//for(datattype referenceobj: array)
		
		int flag=0;//it is match not found
		for(WebElement element:all_links)
		{
			//System.out.println(element.getText());
			
			if(element.getText().contains(Expected_Result))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Pass");
		}
		else if(flag==0)
		{
			System.out.println("Fail");
		}
		
		
	browser.close();
		

	}

}
