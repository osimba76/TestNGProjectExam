package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateTheDuplicateCategoryPage {
  WebDriver driver;
  
  public ValidateTheDuplicateCategoryPage(WebDriver driver) {
	  this.driver = driver;
  }
  
   //Element to interact 
  @FindBy (how = How.XPATH,using = "//a[text()='Nevermind']") 
  WebElement NEVERMIND_OPTION;
  
   //Method to Interact
  public void ValidateDuplicateMessagePage() {
	  Assert.assertEquals(NEVERMIND_OPTION.getText(), "NSS-TODO List v 1.1\", \"Wrong page");
  }
  
}
