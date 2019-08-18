package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ZohoHome7;
import utils.ReadxlsFile1;
import utils.Screenshot;

public class LoginPage7 extends LoginPage6 {
	
	
	@Test(dataProvider="saha")
	public void testaccount(String x,String x1,String x2,String x3,String x4,String x5,String x6,String x7,String x8,String x9,String x10,String x11,String x12,String x13,String x14,String x15) throws InterruptedException, IOException {
		
		ZohoHome7 ad=new ZohoHome7(driver);
		ad.setaccount(x);
		ad.setphone(x1);
		ad.setaccounts(x2);
		ad.setfax(x3);
		ad.setwebside(x4);
		ad.setanumber(x5);
		ad.setticker(x6);
		ad.setemployees(x7);
		ad.setrevenue(x8);
		ad.setcode(x9);
		ad.setstreet(x10);
		ad.setcity(x11);
		ad.setstate(x12);
		ad.setcode(x13);
		ad.setcountry(x14);
		ad.setcopyadd();
		ad.setcopy();
		ad.setdescription(x15);
		ad.setsave();
		//ad.setshow();
		
		Screenshot.takePicture(driver);
		
	}
	
	@DataProvider(name="saha")
	public Object[][] zohoaccount() throws IOException{
			
			String filename1="data1/saha1.xls";
			String sheetname1="sheet3";
			Object [][]tabArray1 = ReadxlsFile1.getCellData(filename1, sheetname1); 
			
			return tabArray1;
			
		}

}
