package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		/*
		 * Robot rb = new Robot(); rb.keyPress(KeyEvent.VK_WINDOWS);
		 * rb.keyPress(KeyEvent.VK_PRINTSCREEN); rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
		 * rb.keyRelease(KeyEvent.VK_WINDOWS);
		 */
		TakesScreenshot scr = ((TakesScreenshot) driver);
		
		File src = scr.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screen.png");
		
		FileUtils.copyFile(src, dest);
		
		
		//Screenshot
		/*
		 * TakesScreenshot scr = ((TakesScreenshot)driver); File source =
		 * scr.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("./screenshot.png"); FileUtils.copyFile(source, dest); driver.close();
		 */
		
		//driver.switchTo().alert().accept();
		
		

	}

}
