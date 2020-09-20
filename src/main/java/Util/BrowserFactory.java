package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    static WebDriver driver;
    
    public static WebDriver launchBrowser() {
    	
    	//Setting Chrome as the default driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\simba\\eclipse-workspace\\Spring2020Selenium\\TestNGProjectExam\\driver\\chromedriver.exe");
    	
    	//Opening ChromeDriver
    	driver = new ChromeDriver();
    	
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	//Launching the site
    	driver.get(" http://techfios.com/test/101/");
    	return driver;
    	
    }
}
