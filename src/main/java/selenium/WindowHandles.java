package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesorig = new ArrayList<String>(windowHandles);
		int size = windowHandlesorig.size();
		for (int i = 0; i < size; i++) {
			System.out.println(windowHandlesorig.get(i));
		}
		driver.switchTo().window(windowHandlesorig.get(1));
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
