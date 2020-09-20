package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategoryButtonPage;
import Page.DuplicateACategoryPage;
import Util.BrowserFactory;

public class DuplicateACategoryTest {
   WebDriver driver;
   
   @Test
   public void UserShouldBeAbleToAddACategory() {
   
	   driver = BrowserFactory.launchBrowser();
	   
   DuplicateACategoryPage AddDuplicateCategory = PageFactory.initElements(driver, DuplicateACategoryPage.class);
   AddCategoryButtonPage  ClickOnAddCategoryButton = PageFactory.initElements(driver, AddCategoryButtonPage.class);
   
   AddDuplicateCategory.NewDuplicateCategory("Bujumbura");
   ClickOnAddCategoryButton.UserShouldBeAbleToClickAddButton();
   
   
}
   
}
