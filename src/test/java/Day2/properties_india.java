package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class properties_india {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.propertiesindia.com/");
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frame_element = browser.findElement(By.cssSelector("iframe[src='search/about.php']"));
		System.out.println(frame_element);
		
		browser.switchTo().frame(frame_element);
		
		browser.findElement(By.cssSelector("input[type='radio'][value='S']")).click();
		browser.findElement(By.id("bar_budgetMin")).sendKeys("1000");
		browser.findElement(By.cssSelector("input[type='checkbox'][value='B']")).click();
		
		
	}
		
		
}
