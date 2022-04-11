import java.util.List;

import org.openqa.selenium.WebElement;

public interface Browser {

	public List<WebElement> locateElements(String type, String value);
	public  void SwitchToAlert();
	
}

