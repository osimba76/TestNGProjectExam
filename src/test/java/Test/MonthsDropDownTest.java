package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.MonthsDropDownPage;
import Util.BrowserFactory;


@Test
public class MonthsDropDownTest {
  
	WebDriver driver;
	
	
	public MonthsDropDownTest(WebDriver driver) {
		
		this.driver=driver;
		
		driver=BrowserFactory.launchBrowser();
		
		MonthsDropDownPage ClickOnMonthsDropDown = PageFactory.initElements(driver, MonthsDropDownPage.class);
		ClickOnMonthsDropDown.ClickOnTheDropDownButton();
	}
	
}
