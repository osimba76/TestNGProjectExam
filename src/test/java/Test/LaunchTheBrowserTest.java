package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Util.BrowserFactory;

public class LaunchTheBrowserTest {

	WebDriver driver;
	
	@Test
	public void LaunchBrowser() {
		driver =  BrowserFactory.launchBrowser();
	}
	
}
