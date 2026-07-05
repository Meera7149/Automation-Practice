package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;
import pages.RequestCreation;

public class Retail_ticket_issue {

	public static void main(String[] args) throws InvalidFormatException, IOException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        File file=new File("C:\\Users\\Nagulmeera\\git\\repository4\\test\\src\\test\\resources\\Testdata\\Test.xlsx");
	    XSSFWorkbook workbook=new XSSFWorkbook(file);
	    XSSFSheet sheet=workbook.getSheetAt(0);
	    //Reading URL
	    Row row=sheet.getRow(1);
	    Cell cell=row.getCell(1);
	    String URL=cell.getStringCellValue();
	    //Reading Username
	    Row row1=sheet.getRow(1);
	    Cell cell1=row1.getCell(2);
	    String username=cell1.getStringCellValue();
	  //Reading Password
	    Row row2=sheet.getRow(1);
	    Cell cell2=row2.getCell(3);
	    String password=cell2.getStringCellValue();
	    
	    driver.get(URL);
	    driver.manage().window().maximize();
	    Login login=new Login(driver);
	    login.username_enter(username);
	    login.password_enter(password);
	    login.signin_click();
	    login.ok_click();
	    RequestCreation RC=new RequestCreation(driver);
	    RC.retail_buttonclick();
	   
	}

}
