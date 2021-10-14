package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * //options.addArguments("incognito");
		 * options.addArguments("disable-infobars");
		 * 
		 * ChromeDriver driver = new ChromeDriver(options);
		 * driver.get("http://leafground.com/home.html");
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().refresh();
	
		

	}

}
