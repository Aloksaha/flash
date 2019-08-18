package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModellead;

public class ZohoHomelead extends PageModellead{

	public ZohoHomelead(WebDriver x) {
		super(x);
		
	}
	
	public String getcompany3() {
		
		WebElement a=getcompanyelement();
		String b=a.getText();
		return b;
	}
	public String gettitle() {
		String b1;
		WebElement a1=gettitlename();
		b1=a1.getText();
		return b1;
	}
	public String getflname() {
		String b2;
		WebElement a2=getname();
		b2=a2.getText();
		return b2;
	}
	
	public String getphone() {
		WebElement a3=getph();
		String b3=a3.getText();
		return b3;
	}
	public String getemail() {
		WebElement a4=setemail();
		String b4=a4.getText();
		return b4;
	}
	public String getmobile() {
		WebElement a5=setmobile();
		String b5=a5.getText();
		return b5;
	}

	public String getfax() {
		WebElement a6=setfax();
		String b6=a6.getText();
		return b6;
	}
	public String getrevenue() {
		WebElement a7=setrevenue();
		String b7=a7.getText();
		return b7;
	}
	public String getwebsite() {
		WebElement a8=setwebsite();
		String b8=a8.getText();
		return b8;
	}
	public String getemplyees() {
		WebElement a9=setemployees();
		String b9=a9.getText();
		return b9;
	}
	public String getskype() {
		WebElement a10=setskype();
		String b10=a10.getText();
		return b10;
	}
	public String gettwiter() {
		WebElement a11=settwiter();
		String b11=a11.getText();
		return b11;
	}
	public String getseemail() {
		WebElement a12=setseemail();
		String b12=a12.getText();
		return b12;
	}

	public String getstreet() {
		WebElement a13=setstreet();
		String b13=a13.getText();
		return b13;
	}
	
	public String getcity() {
		WebElement a14=setcity();
		String b14=a14.getText();
		return b14;
	}
	public String getstate() {
		WebElement a15=setstate();
		String b15=a15.getText();
		return b15;
	}
	public String getzip() {
		WebElement a16=setzip();
		String b16=a16.getText();
		return b16;
	}
	public String getcountry() {
		WebElement a17=setcountry();
		String b17=a17.getText();
		return b17;
	}
	public String getdescription() {
		WebElement a18=setdescription();
		String b18=a18.getText();
		return b18;
	}
	
	
	
	
	
	
	
	
}
