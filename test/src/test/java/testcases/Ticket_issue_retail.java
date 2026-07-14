package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;
import utilities.Dataprovider;
import utilities.Excelutilities;

public class Ticket_issue_retail extends Baseclass {
	public int rowcount=1;
	public int columncount=3;
	
  @Test(dataProvider="login",dataProviderClass=Dataprovider.class)
  public void f(String username,String password) throws InterruptedException, IOException {
  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("http://100.100.60.116:8090/srx");
	  Login log=new Login(driver);
	  log.username_enter(username);
	  log.password_enter(password);
	  log.signin_click();
	  //log.ok_click();
	  Thread.sleep(5000);
		
	Excelutilities eu=new Excelutilities(); 
    eu.write_cell(rowcount, columncount, "Passed");
    eu.save_exceldata("C:\\Users\\Nagulmeera\\git\\repository4\\test\\Testdata\\Logindata.xlsx");
    rowcount++;	 
	  
	 
	  
  }
  
}
