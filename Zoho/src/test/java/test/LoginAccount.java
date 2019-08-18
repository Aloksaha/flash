package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Page.ZohoHomeAccount;
import utils.ReadxlsFile1;

public class LoginAccount extends LoginPage7{
	
	@Test
	public void testaccount() throws IOException {
		
		ZohoHomeAccount qa=new ZohoHomeAccount(driver);
		String file="data1/saha1.xls";
		String sheet="sheet3";

		String a=	qa.getaname2();
		String b=ReadxlsFile1.read(file, sheet, 1, 0);
		
		assertEquals(a, b);
		
		

		String a1=	qa.getphone2();
		String b1=ReadxlsFile1.read(file, sheet, 1, 1);
		
		assertEquals(a1, b1);
		

		String a2=	qa.getsite2();
		String b2=ReadxlsFile1.read(file, sheet, 1, 2);
		
		assertEquals(a2, b2);
		

		String a3=	qa.getfax2();
		String b3=ReadxlsFile1.read(file, sheet, 1, 3);
		
		assertEquals(a3, b3);
		

		String a4=	qa.getwebsite2();
		String b4=ReadxlsFile1.read(file, sheet, 1, 4);
		
		assertEquals(a4, b4);
		

		String a5=	qa.getanumber2();
		String b5=ReadxlsFile1.read(file, sheet, 1, 5);
		
		assertEquals(a5, b5);
		

		String a6=	qa.getticker2();
		String b6=ReadxlsFile1.read(file, sheet, 1, 6);
		
		assertEquals(a6, b6);
		

		String a7=	qa.getemployees2();
		String b7=ReadxlsFile1.read(file, sheet, 1, 7);
		
		assertEquals(a7, b7);
		

//		String a8=	qa.getrevenue2();
//		String b8=ReadxlsFile1.read(file, sheet, 1, 8);
//		
//		assertEquals(a8, b8);
		
		String a8 = qa.getrevenue2();
		String a_8= a8.replaceAll("[^0-9 | ^\\.]", "").replaceAll(" ", "");
		//System.out.println(a_7);
		double a__8 = Double.valueOf(a_8);
		
		String b8=ReadxlsFile1.read(file, sheet, 1, 8);
		double b_8 = Double.valueOf(b8);
		assertEquals(a__8, b_8);
		

		String a9=	qa.getstreet2();
		String b9=ReadxlsFile1.read(file, sheet, 1, 10);
		
		assertEquals(a9, b9);
		

		String a10=	qa.getcity2();
		String b10=ReadxlsFile1.read(file, sheet, 1, 11);
		
		assertEquals(a10, b10);
		

		String a11=	qa.getstate2();
		String b11=ReadxlsFile1.read(file, sheet, 1, 12);
		
		assertEquals(a11, b11);
		

		String a12=	qa.getcode2();
		String b12=ReadxlsFile1.read(file, sheet, 1, 13);
		
		assertEquals(a12, b12);
		

		String a13=	qa.getcountry2();
		String b13=ReadxlsFile1.read(file, sheet, 1, 14);
		
		assertEquals(a13, b13);
		

		String a14=	qa.getdescription2();
		String b14=ReadxlsFile1.read(file, sheet, 1, 15);
		
		assertEquals(a14, b14);
		

		
		
		
		
		
	}

}
