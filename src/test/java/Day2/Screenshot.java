package Day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.flipkart.com/");
		
		TakesScreenshot screenshot= (TakesScreenshot) browser;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File("D:\\october_batch2.png"));

	}

}
