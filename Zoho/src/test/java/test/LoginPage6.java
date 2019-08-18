package test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Page.ZohoHome6;

public class LoginPage6 extends LoginPage5{
	
	@Test
	public void testaccount() throws InterruptedException, IOException {
		ZohoHome6 ak=new ZohoHome6(driver);
//		ak.setre1();
//		ak.setcrm2();
		
		
		ak.setnew();
		ak.setaccount();
	}

}
