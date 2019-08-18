package test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Page.ZohoHomeContact;
import utils.ReadxlsFile1;

public class Logincontact extends LoginPage5{
	

	@Test
	public void testcontact() throws IOException {
		
		ZohoHomeContact ag=new ZohoHomeContact(driver);
		
		String file="data1/saha1.xls";
		String sheet="Sheet2";
		
		
		String a=	ag.getname();
		String b=ReadxlsFile1.read(file, sheet, 1, 0);
		String c=ReadxlsFile1.read(file, sheet, 1, 1);
		String d=b+" "+c;
		assertEquals(a, d);
		
		String a1=	ag.getemail1();
		String b1=ReadxlsFile1.read(file, sheet, 1, 2);
		
		assertEquals(a1, b1);
		
		String a2=	ag.getphone1();
		String b2=ReadxlsFile1.read(file, sheet, 1, 4);
		//System.out.println(a2);
		//System.out.println(b2);
		assertEquals(a2, b2);
		
		String a3=	ag.gettitle1();
		String b3=ReadxlsFile1.read(file, sheet, 1, 3);
		
		assertEquals(a3, b3);
		
		String a4=	ag.getophone1();
		String b4=ReadxlsFile1.read(file, sheet, 1, 6);
		
		assertEquals(a4, b4);
		
		String a5=	ag.getdepartment1();
		String b5=ReadxlsFile1.read(file, sheet, 1, 5);
		
		assertEquals(a5, b5);
		
		String a6=	ag.getmobile1();
		String b6=ReadxlsFile1.read(file, sheet, 1, 8);
		
		assertEquals(a6, b6);
		
		String a7=	ag.gethphone1();
		String b7=ReadxlsFile1.read(file, sheet, 1, 7);
		
		assertEquals(a7, b7);
		
		String a8=	ag.getassistant1();
		String b8=ReadxlsFile1.read(file, sheet, 1, 10);
		
		assertEquals(a8, b8);
		
		String a9=	ag.getfax1();
		String b9=ReadxlsFile1.read(file, sheet, 1, 9);
		
		assertEquals(a9, b9);
		
		String a10=	ag.getaphone1();
		String b10=ReadxlsFile1.read(file, sheet, 1, 12);
		
	assertEquals(a10, b10);
		
		String a11=	ag.getskype1();
		String b11=ReadxlsFile1.read(file, sheet, 1, 13);
		
		assertEquals(a11, b11);
		
		
		String a12=	ag.getsemail1();
		String b12=ReadxlsFile1.read(file, sheet, 1, 14);
		
		assertEquals(a12, b12);
		
		String a13=	ag.gettwiter1();
		String b13=ReadxlsFile1.read(file, sheet, 1, 15);
		
		assertEquals(a13, b13);
		
		String a14=	ag.getstreet1();
		String b14=ReadxlsFile1.read(file, sheet, 1, 16);
		
		assertEquals(a14, b14);
		
		String a15=	ag.getcity1();
		String b15=ReadxlsFile1.read(file, sheet, 1, 17);
		
		assertEquals(a15, b15);
		
		String a16=	ag.getstate1();
		String b16=ReadxlsFile1.read(file, sheet, 1, 18);
		
		assertEquals(a16, b16);
		
		String a17=	ag.getzip1();
		String b17=ReadxlsFile1.read(file, sheet, 1, 19);
		
		assertEquals(a17, b17);
		
		String a18=	ag.getcountry1();
		String b18=ReadxlsFile1.read(file, sheet, 1, 20);
		
		assertEquals(a18, b18);
		
		String a19=	ag.getdescription1();
		String b19=ReadxlsFile1.read(file, sheet, 1, 21);
		
		assertEquals(a19, b19);
		
		
	}
	
	
	
	
	
	
}
