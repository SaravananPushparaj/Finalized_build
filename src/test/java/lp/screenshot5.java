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

public class screenshot5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("hplogo"));
		
		Point point = ele.getLocation();
		
		int width = ele.getSize().getWidth();
		int height=ele.getSize().getHeight();
		
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		
		BufferedImage fullImage = ImageIO.read(screenshotAs);
		
		BufferedImage subimage = fullImage.getSubimage(point.getX(), point.getY(), width, height);
		
		ImageIO.write(subimage, "jpeg", screenshotAs);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\ty1.jpeg"));

	}

}
