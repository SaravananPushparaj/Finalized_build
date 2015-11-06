package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	
	public static void main(String[] args) {
		
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		browser.manage().window().maximize();
		browser.get("https://www.apollohospitals.com/locations");
		browser.findElement(By.linkText("Bangalore")).click();
		
		WebDriverWait wait = new WebDriverWait(browser,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bangalore")));
		browser.findElement(By.linkText("Bangalore")).click();
		
		
		
	}

}
