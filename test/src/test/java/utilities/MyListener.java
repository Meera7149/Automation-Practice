package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.Baseclass;
import testcases.Ticket_issue_retail;

public class MyListener implements ITestListener {
	
@Override
public void onTestFailure(ITestResult result) {
	WebDriver driver=((Baseclass)result.getInstance()).driver;
	
	String path="";
	try {
		path = Screenshotsutitlity.screenshot_take(driver,result.getMethod().getMethodName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String usernamee = (String) result.getAttribute("username");
	 // System.out.println(usernamee);
	  Extentreportsutility.extent_reports("Logintest",usernamee);
	  Extentreportsutility.et.fail("Test Failed");
	  Extentreportsutility.et.addScreenCaptureFromPath(path);
}
@Override
public void onTestSuccess(ITestResult result) {
	String usernamee = (String) result.getAttribute("username");
	 // System.out.println(usernamee);
	  Extentreportsutility.extent_reports("Logintest",usernamee);
	  
	Extentreportsutility.et.pass("Test Passed");
	
}
}
