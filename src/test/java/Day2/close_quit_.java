package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class close_quit_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://in.rediff.com/");
		
		//browser.close();
		
		browser.quit();
		

	}

}
