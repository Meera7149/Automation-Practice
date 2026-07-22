package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshotsutitlity {
	
	public static String screenshot_take(WebDriver driver,String testname) throws IOException {
		SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		Date dt=new Date();
		String format=df.format(dt);
		String path="C:\\Users\\Nagulmeera\\git\\repository4\\test\\Screenshots\\screens\\"+testname+format+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File(path);
		FileUtils.copyFile(file, ff);
		return path;
	}
	
	public static void screenshot_delete() throws IOException {
	File file=new File("C:\\Users\\Nagulmeera\\git\\repository4\\test\\Screenshots\\screens\\");
	if(file.exists()) {
		FileUtils.cleanDirectory(file);
		System.out.println("Directory cleaned");
	}
	else {
		System.out.println("Folder not found");
	}
	//file.mkdirs();
	}

}
