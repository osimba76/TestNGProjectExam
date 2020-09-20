package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategoryButtonPage;
import Page.AddTheCategoryPage;
import Util.BrowserFactory;

public class AddTheCategoryTest {
  
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToAddTheCategory () {
		  driver = BrowserFactory.launchBrowser();
		  
		  AddTheCategoryPage addthecategory = PageFactory.initElements(driver, AddTheCategoryPage.class);
		  AddCategoryButtonPage addcategorybutton = PageFactory.initElements(driver, AddCategoryButtonPage.class);
		  addthecategory.NewCategoryAdded("Bujumbura");
		  addcategorybutton.UserShouldBeAbleToClickAddButton();
		  
	}
}
