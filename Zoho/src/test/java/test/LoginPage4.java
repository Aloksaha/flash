package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Page.ZohoHome4;

public class LoginPage4 extends LoginPage1{

	
	@Test 
	public void test() throws InterruptedException {
		ZohoHome4 ak=new ZohoHome4(driver);
		//ak.setre1();
		ak.setcrm2();
		
		
		ak.setnew();
		ak.setcontact();
	}
}
