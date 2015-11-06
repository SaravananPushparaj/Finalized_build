package lp;

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

public class screenshot3 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement ele = driver.findElement(By.id("hplogo"));   
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		
		BufferedImage fullimage = ImageIO.read(screenshotAs);
		
		Point point = ele.getLocation();
		
		int eleWidth = ele.getSize().getWidth();
		int eleheight = ele.getSize().getHeight();
		
		BufferedImage subimage = fullimage.getSubimage(point.getX(), point.getY(), eleWidth, eleheight);
		ImageIO.write(subimage, "png", screenshotAs);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\jb.png"));
		
		
	}

}
