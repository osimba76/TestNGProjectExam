package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthsDropDownPage {
  WebDriver driver;
  
  public MonthsDropDownPage(WebDriver driver) {
	  this.driver = driver;
  }
  
  //Element to interact
  @FindBy (how = How.XPATH, using = "//select[@name='due_month']") 
  WebElement MONTHS_DROPDOWN_BUTTON;
  
  //Method To Interact With The Element
  public void ClickOnTheDropDownButton() {
	  MONTHS_DROPDOWN_BUTTON.click();
  }
  
}
