package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public ChromeDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
