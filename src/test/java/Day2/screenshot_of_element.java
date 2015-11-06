package Day2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot_of_element {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.google.com");
		
		WebElement ele = browser.findElement(By.cssSelector("html body#gsr.hp.vasq div#viewport.ctr-p div#main.content span#body.ctr-p center div#lga div#hplogo a img"));
		Point point = ele.getLocation();
		int width = ele.getSize().getWidth();
		int height = ele.getSize().getHeight();
		 
		TakesScreenshot screenshot= (TakesScreenshot) browser;
		
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\October_element.png"));
		//***************for particular element
		BufferedImage Full_Image = ImageIO.read(screenshotAs);
		BufferedImage subimage = Full_Image.getSubimage(point.getX(), point.getY(), width, height);
		
		ImageIO.write(subimage, "png", screenshotAs);
		//*******************
		FileUtils.copyFile(screenshotAs, new File("D:\\October_element2.png"));
		
		
		
		
		
		
		

	}

}
