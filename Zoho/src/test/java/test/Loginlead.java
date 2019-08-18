package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.testng.annotations.Test;

import Page.ZohoHomelead;

import utils.ReadxlsFile1;

public class Loginlead extends LoginPage3{
	
	
	@Test
	public void asserttest() throws IOException {
		
		ZohoHomelead aj=new ZohoHomelead(driver);
		String file="data1/saha1.xls";
		String sheet="Sheet1";
		
		
		String a=	aj.getcompany3();
		String b=ReadxlsFile1.read(file, sheet, 1, 0);
		
		assertEquals(a, b);
		
		String a1=aj.gettitle();
		String b1=ReadxlsFile1.read(file, sheet, 1, 3);
		assertEquals(a1,b1);
		
		String a2=aj.getflname();
		String b2=ReadxlsFile1.read(file, sheet, 1, 1);
		String c2=ReadxlsFile1.read(file, sheet, 1, 2);
		String c=b2+" "+c2;
		assertEquals(a2, c);
		
		String a3=aj.getphone();
		String b3=ReadxlsFile1.read(file, sheet, 1, 5);
		
		assertEquals(a3, b3);
		
		String a4=aj.getemail();
		String b4=ReadxlsFile1.read(file, sheet, 1, 4);
		
		assertEquals(a4, b4);
		
		String a5=aj.getmobile();
		String b5=ReadxlsFile1.read(file, sheet, 1, 7);
		
		assertEquals(a5, b5);
		
		String a6=aj.getfax();
		String b6=ReadxlsFile1.read(file, sheet, 1, 6);
		
		assertEquals(a6, b6);
		
		String a7 = aj.getrevenue();
		String a_7= a7.replaceAll("[^0-9 | ^\\.]", "").replaceAll(" ", "");
		//System.out.println(a_7);
		double a__7 = Double.valueOf(a_7);
		
		String b7=ReadxlsFile1.read(file, sheet, 1, 10);
		double b_7 = Double.valueOf(b7);
		assertEquals(a__7, b_7);
		
		String a8=aj.getwebsite();
		String b8=ReadxlsFile1.read(file, sheet, 1, 8);
		
		assertEquals(a8, b8);
		
		String a9=aj.getemplyees();
		String b9=ReadxlsFile1.read(file, sheet, 1, 9);
		
		assertEquals(a9, b9);
		
		String a10=aj.getskype();
		String b10=ReadxlsFile1.read(file, sheet, 1, 11);
		
		assertEquals(a10, b10);
		
		String a11=aj.gettwiter();
		String b11=ReadxlsFile1.read(file, sheet, 1, 12);
		
		assertEquals(a11, b11);
		
		String a12=aj.getseemail();
		String b12=ReadxlsFile1.read(file, sheet, 1, 13);
		
		assertEquals(a12, b12);
		
		String a13=aj.getstreet();
		String b13=ReadxlsFile1.read(file, sheet, 1, 14);
		
		assertEquals(a13, b13);
		
		String a14=aj.getcity();
		String b14=ReadxlsFile1.read(file, sheet, 1, 15);
		
		assertEquals(a14, b14);
		
		String a15=aj.getstate();
		String b15=ReadxlsFile1.read(file, sheet, 1, 16);
		
		assertEquals(a15, b15);
		
		String a16=aj.getzip();
		String b16=ReadxlsFile1.read(file, sheet, 1, 17);
		
		assertEquals(a16, b16);
		
		String a17=aj.getcountry();
		String b17=ReadxlsFile1.read(file, sheet, 1, 18);
		
		assertEquals(a17, b17);
		
		String a18=aj.getdescription();
		String b18=ReadxlsFile1.read(file, sheet, 1, 19);
		
		assertEquals(a18, b18);
		
	}
	

	

	
	
	
	
}
