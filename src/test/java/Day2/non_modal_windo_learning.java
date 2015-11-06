package Day2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class non_modal_windo_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		
		String Parent_window = browser.getWindowHandle();
		System.out.println(Parent_window);
		String Child_window="";
		
		browser.get("http://in.rediff.com/");
		
		Set<String> wind_id = browser.getWindowHandles();
		int size = wind_id.size();
		System.out.println("Total number of windows" +size);
		
		for(String element:wind_id)
		{
			if(Parent_window.equals(element)==false)
			{
				Child_window=element;
			}
			
			
		}
		System.out.println("*****************************");
		System.out.println(Parent_window);
		System.out.println(Child_window);
		
		//child window switch
		browser.switchTo().window(Child_window);
		String Child_title = browser.getTitle();
		System.out.println(Child_title);
		browser.close();
		
		//switch to parent window
		
		browser.switchTo().window(Parent_window);
		String Parent_title = browser.getTitle();
		System.out.println(Parent_title);
		browser.close();
		
		
		
		

	}

}
