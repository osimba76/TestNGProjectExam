package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryButtonPage {
  WebDriver driver;
  
  @FindBy(how = How.XPATH, using = "//Input[@value='Add category']") 
  WebElement ADD_CATEGORY_BUTTON;
  
  
  
  public void UserShouldBeAbleToClickAddButton() {
	  ADD_CATEGORY_BUTTON.click();
  }
}
