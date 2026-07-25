package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utilities.Extentreportsutility;
import utilities.Screenshotsutitlity;

public class Baseclass {
	public WebDriver driver;
	//public EdgeDriver driver2;
	
	@BeforeMethod
	public void setup2() {
			   	
	}
	@AfterMethod
	public void teardown() {
		Extentreportsutility.extent_flush();

		}
  
   @BeforeSuite
   public void before_suite() throws IOException {
	   Screenshotsutitlity.screenshot_delete();
	 Extentreportsutility.extentreport_clear();
	   
    }
    @AfterSuite
    public void after_suite() {
    
    		
     }
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser)
    {
        if(browser.equals("chrome"))
        {
        driver = new ChromeDriver();
        }
        else if(browser.equals("edge"))
        {
        	driver = new EdgeDriver();
        }
    }
     @AfterTest
     public void after_test() {
	
     }
     @AfterClass
     public void after_class() {
    	driver.quit();
     }
     
     @BeforeClass
     public void before_class() {
    	 
		   
     }
}
