package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModelAccount;

public class ZohoHomeAccount extends PageModelAccount{

	public ZohoHomeAccount(WebDriver x) {
		super(x);
		
	}
	public String getaname2() {
		
		WebElement a=setaname2();
		String b=a.getText();
		return b;
	}
	
public String getphone2() {
		
		WebElement a1=setphone2();
		String b1=a1.getText();
		return b1;
	}
public String getsite2() {
	
	WebElement a2=setsite2();
	String b2=a2.getText();
	return b2;
}
public String getfax2() {
	
	WebElement a3=setfax2();
	String b3=a3.getText();
	return b3;
}
public String getwebsite2() {
	
	WebElement a4=setwebsite2();
	String b4=a4.getText();
	return b4;
}
public String getanumber2() {
	
	WebElement a5=setanumber2();
	String b5=a5.getText();
	return b5;
}
public String getticker2() {
	
	WebElement a6=setticker2();
	String b6=a6.getText();
	return b6;
}
public String getemployees2() {
	
	WebElement a7=setemployees2();
	String b7=a7.getText();
	return b7;
}
public String getrevenue2() {
	
	WebElement a8=setrevenue2();
	String b8=a8.getText();
	return b8;
}
public String getstreet2() {
	
	WebElement a9=setstreet2();
	String b9=a9.getText();
	return b9;
}
public String getcity2() {
	
	WebElement a10=setcity2();
	String b10=a10.getText();
	return b10;
}
public String getstate2() {
	
	WebElement a11=setstate2();
	String b11=a11.getText();
	return b11;
}
public String getcode2() {
	
	WebElement a12=setcode2();
	String b12=a12.getText();
	return b12;
}
public String getcountry2() {
	
	WebElement a13=setcountry2();
	String b13=a13.getText();
	return b13;
}
public String getdescription2() {
	
	WebElement a14=setdescription2();
	String b14=a14.getText();
	return b14;
}

	
	
	
	
	
	
}
