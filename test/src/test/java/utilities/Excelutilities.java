package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {

private XSSFWorkbook workbook;
private XSSFSheet sheet;

//To read excel file
public void excel_read(String excelpath) throws IOException {
FileInputStream fi=new FileInputStream(excelpath);
workbook=new XSSFWorkbook(fi);
	
}

//To get sheet

public void get_sheet(String Sheetname) {

 sheet=workbook.getSheet(Sheetname);
	
}
//Toget rows
public int get_rows(String Sheetname) {
	sheet=workbook.getSheet(Sheetname);
    int rowscount=sheet.getLastRowNum();
	return rowscount;
	}

//To get cell data
public String get_celldata(int rownumber,int columnnumber) {

Row row=sheet.getRow(rownumber);
Cell cell=row.getCell(columnnumber);
 return cell.getStringCellValue();

}
//To write data in cell
public void write_cell(int rownumber,int columnnumber,String value) {

	Row row2=sheet.getRow(rownumber);
	Cell cell=row2.createCell(columnnumber);
	cell.setCellValue(value);
	
}
//save the written data
public void save_exceldata(String excelpath) throws IOException {

	FileOutputStream fo=new FileOutputStream(excelpath);
	workbook.write(fo);
	fo.close();
}

//closing the excel

public void excel_close() throws IOException {

workbook.close();
	
}


}
