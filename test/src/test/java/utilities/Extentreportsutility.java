package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportsutility {
	public static ExtentReports er;
	public static ExtentTest et;
	
	public static void extent_reports(String reportname,String username) {
	ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\Nagulmeera\\git\\repository4\\test\\Reports\\"+reportname+username+".html");
	er=new ExtentReports();
	er.attachReporter(esr);
    et=er.createTest("Test started");
}
	public static void extent_flush() {
		er.flush();
	}
	public static void extentreport_clear() throws IOException {
		
		File ff=new File("C:\\Users\\Nagulmeera\\git\\repository4\\test\\Reports");
		FileUtils.cleanDirectory(ff);
	}
}