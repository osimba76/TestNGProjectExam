package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddTheCategoryPage {
    WebDriver driver;
    
       //Element library
    
    @FindBy(how = How.XPATH, using ="//Input[@name='categorydata']") 
    WebElement ADD_CATEGORY;
    
    public void NewCategoryAdded (String category) {
    	ADD_CATEGORY.sendKeys(category);
    }
    
    
}
