package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement secDropdown = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		Select s = new Select(secDropdown);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.deselectByIndex(1);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		

	}

}
