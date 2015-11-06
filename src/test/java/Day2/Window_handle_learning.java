package Day2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_handle_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		
		Set<String> winid = browser.getWindowHandles();
		int size = winid.size();
		System.out.println("Total number of windows "+size);
		
		for(String element:winid)
		{
			System.out.println(element);
		}
		
		System.out.println("*************************************");
		
		browser.get("http://in.rediff.com/");
		Set<String> winid2 = browser.getWindowHandles();
		int size2 = winid2.size();
		System.out.println(size2);
		
		for(String element:winid2)
		{
			System.out.println(element);
		}

	}

}
