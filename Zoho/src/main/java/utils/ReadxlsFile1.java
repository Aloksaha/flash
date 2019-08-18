 package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadxlsFile1 {
static Sheet excelsheet;
	
	public static Object[][] getCellData(String filename, String sheetname) throws IOException{
		Object[][]tabArray;
		
			FileInputStream ak=new FileInputStream(filename);
			Workbook ap=new HSSFWorkbook(ak);
			excelsheet=ap.getSheet(sheetname);
	int row=excelsheet.getPhysicalNumberOfRows();
	int col=excelsheet.getRow(0).getPhysicalNumberOfCells();
	
	tabArray=new Object[row-1][col];
	
	for(int raw=1;raw<row;raw++) {
		for(int cell=0;cell<col;cell++) {
		tabArray[raw-1][cell]=rc(raw,cell);	
		}
	}

	return tabArray;

	}

	
	public static String rc(int raw,int cell) {
		Cell col=excelsheet.getRow(raw).getCell(cell);
		String rr="";
			
		if(col.getCellType()==Cell.CELL_TYPE_STRING)
		{
			rr=col.getStringCellValue().trim();
		}
		
		else if (col.getCellType()==Cell.CELL_TYPE_NUMERIC) {
				int i = (int)col.getNumericCellValue();
				rr = String.valueOf(i);
			}
		return rr;		
	}
	
public static String read(String filename,String sheetname,int row,int cel) throws IOException {
		
		String rr="";
		FileInputStream ak=new FileInputStream(filename);
		Workbook ap=new HSSFWorkbook(ak);	
		
		excelsheet=ap.getSheet(sheetname);
		
		rr=rc(row,cel);
				
		
		return rr;
		
		
		
	}

}
