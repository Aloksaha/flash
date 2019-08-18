package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.ZohoHome8;
import utils.Screenshot;

public class LoginPage8 extends LoginPage7{
	
	@Test
	public void varifytest() throws IOException {
		ZohoHome8 af=new ZohoHome8(driver);
		af.sethome();
		
		af.setleads();
		
		//Screenshot.takePicture(driver);
		
		
		af.setcontacts();
		//Screenshot.takePicture(driver);
		
		
		af.setaccounts();
		Screenshot.takePicture(driver);
		//AssertJUnit.assertEquals(20, 20);
	}
	

}
