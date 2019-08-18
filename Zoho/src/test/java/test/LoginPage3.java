package test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
//,String x9,String x10
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ZohoHome3;
import utils.ReadxlsFile1;
import utils.Screenshot;

//

public class LoginPage3 extends LoginPage2{
	
	@Test(dataProvider="sa")
	public void login3(String x,String x1,String x2,String x3,String x4,String x5,String x6,String x7,String x8,String x9,String x10,String x14,String x15,String x16,String x17,String x18,String x19,String x20,String x21,String x22) throws InterruptedException, IOException {
		ZohoHome3 ak=new ZohoHome3(driver);
		//ak.set();
		ak.setcompany(x);
		ak.setfname(x1);
		ak.setlname(x2);
		ak.settitle(x3);
		ak.setemail(x4);
		ak.setphone(x5);
		ak.setfax(x6);
		ak.setmobile(x7);
		ak.setwebsite(x8);
		ak.setsource();
//		
//		ak.setstatus();
//
		ak.setindustry();
//
		ak.setemployees(x9);
		ak.setrevenue(x10);
//		ak.setrating();
		ak.setclick();  //emp
		ak.setskype(x14);
		ak.settwitter(x15);
		ak.setseemail(x16);
		ak.setstreet(x17);
		ak.setcity(x18);
		ak.setstate(x19);
		ak.setzip(x20);
		ak.setcountry(x21);
		ak.setdescription(x22);
		
		ak.setsave();
//		assert.assertEquals("sahaPLC", expected);
		
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		File target=new File("data/alok.jpg");
		FileUtils.copyFile(screen, target);
				
		
		
		
		Screenshot.takePicture(driver);
	}
	@DataProvider(name="sa")
	public Object[][] dp_zohoTest() throws IOException{
		
		String filename1="data1/saha1.xls";
		String sheetname1="sheet1";
		Object [][]tabArray1 = ReadxlsFile1.getCellData(filename1, sheetname1); 
		
		return tabArray1;
		
	}
}
