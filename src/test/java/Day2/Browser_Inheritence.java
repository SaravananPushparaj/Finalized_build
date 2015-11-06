package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Inheritence {
	
	WebDriver browser;
	
	public void Initialize_Browser()
	{
		 browser= new FirefoxDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	


}
