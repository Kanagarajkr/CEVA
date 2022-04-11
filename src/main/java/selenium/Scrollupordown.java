package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollupordown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By.xpath("//img[@alt='contextClick']"));
		//Scroll using pixels
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		
		//scroll using webelement
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//scroll until bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	}

}
