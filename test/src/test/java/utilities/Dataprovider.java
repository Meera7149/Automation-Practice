package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	private	Excelutilities excelutilities;
	
	@DataProvider(name="login")
	public Object[][] login() throws IOException{
	    
		excelutilities= new Excelutilities();
		excelutilities.excel_read("C:\\Users\\Nagulmeera\\git\\repository4\\test\\src\\test\\resources\\Testdata\\Logindata.xlsx");
		excelutilities.get_sheet("Sheet1");
		int rows=excelutilities.get_rows("Sheet1");
		Object[][] ob1=new Object[rows][2];
		for(int i=1;i<=rows;i++) {
		
			ob1[i-1][0]=excelutilities.get_celldata(i,0);
			ob1[i-1][1]=excelutilities.get_celldata(i,1);
			
			System.out.println(
		            "DataProvider Row " + i + " : " 
		            + ob1[i-1][0] + " , " + ob1[i-1][1]);
		
		}
		
		
		return ob1;

		
}
	}