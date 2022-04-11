package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	@Given("Launch the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

	}
}
