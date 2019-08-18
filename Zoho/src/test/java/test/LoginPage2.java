package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Page.ZohoHome2;
import utils.Screenshot;

public class LoginPage2 extends LoginPage1{
	
	
	@Test
	public void login2() throws InterruptedException, IOException  {
		ZohoHome2 ak=new ZohoHome2(driver);
		
		//ak.setre();
		ak.setcrm();
		ak.setleads();
		ak.setnew();
		ak.setne();
		

		Screenshot.takePicture(driver);
		
		
}

}