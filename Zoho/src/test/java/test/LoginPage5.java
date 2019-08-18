package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ZohoHome5;
import utils.ReadxlsFile1;
import utils.Screenshot;

public class LoginPage5 extends LoginPage4 {
	
	@Test(dataProvider="ro")
	public void login4(String x,String x1,String x2,String x3,String x4,String x5,String x6,String x7,String x8,String x9,String x10,String x21,String x11,String x12,String x13,String x14,String x15,String x16,String x17,String x18,String x19,String x20) throws InterruptedException, IOException {
		ZohoHome5 ak=new ZohoHome5(driver);
		
		ak.setsource();
		ak.setfname(x);
		ak.setlname(x1);
		
		//ak.setaccount("King");
		
		ak.setemail(x2);
		ak.settitle(x3);
		ak.setphone(x4);
		ak.setdepartment(x5);
		ak.setophone(x6);
		ak.sethphone(x7);
		ak.setmobile(x8);
		ak.setfax(x9);
		ak.setassistant(x10);
		//ak.setdob(x21);
		ak.setasst(x11);
		ak.setemailout();
		ak.setskype(x12);
		ak.setseemail(x13);
		ak.settwitter(x14);
		ak.setstreet(x15);
		ak.setcity(x16);
		ak.setstate(x17);
		ak.setzip(x18);
		ak.setcountry(x19);
		ak.setcopy();
		ak.setdiscription(x20);
		
		ak.setsave();
		
		Screenshot.takePicture(driver);
	}
	
	
	@DataProvider(name="ro")
public Object[][] zohocontact() throws IOException{
		
		String filename1="data1/saha1.xls";
		String sheetname1="sheet2";
		Object [][]tabArray1 = ReadxlsFile1.getCellData(filename1, sheetname1); 
		
		return tabArray1;
		
	}

}
