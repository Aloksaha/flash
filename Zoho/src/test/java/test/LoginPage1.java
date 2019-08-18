package test;

import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ZohoHome1;
import model.PageModel1;
import utils.ReadxlsFile1;
import utils.Screenshot;

public class LoginPage1 extends LoginPage {
	
	
	@Test(dataProvider="alo")
	public void login1(String x,String x1) throws IOException {
		ZohoHome1 ak=new ZohoHome1(driver);
		
		ak.setemail(x);
		ak.setpass(x1);
		ak.setsingin();
		
		
		Screenshot.takePicture(driver);
		
	}

	@DataProvider(name="alo")
	public Object[][] dp_faceTest() throws IOException{
		
		String filename="data/login.xls";
		String sheetname="sheet2";
		Object [][]tabArray = ReadxlsFile1.getCellData(filename, sheetname); 
		
		return tabArray;
		
	}
}
