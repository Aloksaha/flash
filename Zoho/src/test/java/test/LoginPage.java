package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Page.ZohoHome;


import utils.Screenshot;









public class LoginPage extends TestBase {
	
	@Test
	public void login() throws IOException, InterruptedException {
		
		ZohoHome ak=new ZohoHome(driver);
		
		ak.setlogin();
		
		
		Screenshot.takePicture(driver);
	}
	
	

	
	
}

