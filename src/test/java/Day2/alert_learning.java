package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.indiaproperties.com/");
		
		browser.findElement(By.id("btnPropSearch")).click();
		
		Alert alert = browser.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		browser.switchTo().defaultContent();
		
		String title = browser.getTitle();
		System.out.println(title);

	}

}
