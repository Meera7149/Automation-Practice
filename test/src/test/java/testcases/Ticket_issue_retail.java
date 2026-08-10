package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;
import utilities.Dataprovider;
import utilities.Excelutilities;
import utilities.Extentreportsutility;
import utilities.MyListener;
import utilities.RetryAnalyzer;
import utilities.Screenshotsutitlity;
@Listeners(MyListener.class)
public class Ticket_issue_retail extends Baseclass {
	public int rowcount=1;
	public int columncount=3;
  
  @Test(priority=1,dataProvider="login",dataProviderClass=Dataprovider.class,retryAnalyzer=RetryAnalyzer.class)
  public void test(String username,String password) throws InterruptedException, IOException {
	  System.out.println(username);
	 // WebDriverManager.edgedriver().setup();
	  driver.get("http://100.100.60.116:8090/srx/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  //driver.get("http://100.100.60.116:8090/srx");
	  Login log=new Login(driver);
	
	  log.username_enter(username);
	  
	  log.password_enter(password);
	  log.signin_click();
	  System.out.println("done");
	  
	  //log.ok_click();
	  Thread.sleep(5000);
	  Reporter.getCurrentTestResult().setAttribute("username", username);
	  //Extentreportsutility.extent_flush();
	  Assert.assertTrue(true);
	  int rows = Excelutilities.get_rows("Sheet1");
	  System.out.println("Rows = " + rows);
	  System.out.println(username);
	  
	  
	  
	  
	  
	Excelutilities eu=new Excelutilities();
	eu.excel_read("C:\\Users\\Nagulmeera\\git\\repository4\\test\\src\\test\\resources\\Testdata\\Logindata.xlsx");
	eu.get_sheet("Sheet1");
    eu.write_cell(rowcount, columncount, "Passed");
    eu.save_exceldata("C:\\Users\\Nagulmeera\\git\\repository4\\test\\src\\test\\resources\\Testdata\\Logindata.xlsx");
   
    rowcount++;	 
	  
    
	  
  }
  
  
}
