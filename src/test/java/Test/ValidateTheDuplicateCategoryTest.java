package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategoryButtonPage;
import Page.DuplicateACategoryPage;
import Page.ValidateTheDuplicateCategoryPage;
import Util.BrowserFactory;

public class ValidateTheDuplicateCategoryTest {
  WebDriver driver;
  
  @Test
  public void ValidateTheDuplicateCategoryMessage() {
	  
	  driver = BrowserFactory.launchBrowser();
			  
	DuplicateACategoryPage DuplicatePage = PageFactory.initElements(driver, DuplicateACategoryPage.class);
	ValidateTheDuplicateCategoryPage ValidateTheMessage = PageFactory.initElements(driver, ValidateTheDuplicateCategoryPage.class);
	AddCategoryButtonPage ClickOnCategoryButton = PageFactory.initElements(driver, AddCategoryButtonPage.class);
	
	DuplicatePage.NewDuplicateCategory("Bujumbura");
	ValidateTheMessage.ValidateDuplicateMessagePage();
	ClickOnCategoryButton.UserShouldBeAbleToClickAddButton();
	
	
  }
}
