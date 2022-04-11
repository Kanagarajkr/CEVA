import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LearnAssertion {
	@Test
	public void testAssertion() {
		String expected = "Hey killer";
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://leaftaps.com/opentaps/");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		String Actual = "Hey Raj";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(expected, Actual,"Its failed Raj");
		System.out.println("Test");
		sf.assertAll();
		

	}

}
