package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("s");
		Thread.sleep(2000);
		List<WebElement> values = driver.findElements(By.className("ui-menu-item-wrapper"));
		for (int i = 0; i < values.size(); i++) {
			String text = values.get(i).getText();
			System.out.println(text);
			if(text.contains("SOAP")) {
				values.get(i).click();
				break;
			}
		}
		
		
		
	}

}
