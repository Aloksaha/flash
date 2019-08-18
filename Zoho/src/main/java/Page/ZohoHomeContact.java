package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModelContact;

public class ZohoHomeContact extends PageModelContact{

	public ZohoHomeContact(WebDriver x) {
		super(x);
	}
	
	public String getname() {
		WebElement c=setname();
		String d=c.getText();
		return d;
	}

	public String getemail1() {
		WebElement a1=setemail();
		String b1=a1.getText();
		return b1;
	}

	public String getphone1() {
		WebElement a2=setphone();
		String b2=a2.getText();
		return b2;
	}

	public String gettitle1() {
		WebElement a3=settitle();
		String b3=a3.getText();
		return b3;
	}

	public String getophone1() {
		WebElement a4=setophone();
		String b4=a4.getText();
		return b4;
	}

	public String getdepartment1() {
		WebElement a5=setdepartment();
		String b5=a5.getText();
		return b5;
	}

	public String getmobile1() {
		WebElement a6=setmobile();
		String b6=a6.getText();
		return b6;
	}

	public String gethphone1() {
		WebElement a7=sethphone();
		String b7=a7.getText();
		return b7;
	}

	public String getassistant1() {
		WebElement a8=setassistant();
		String b8=a8.getText();
		return b8;
	}

	public String getfax1() {
		String b9;
		WebElement a9=setfax();
	 b9=a9.getText();
		return b9;
	}

	public String getaphone1() {
		WebElement a10=setaphone();
		String b10=a10.getText();
		return b10;
	}

	public String getskype1() {
		WebElement a11=setskype();
		String b11=a11.getText();
		return b11;
	}

	public String getsemail1() {
		WebElement a12=setsemail();
		String b12=a12.getText();
		return b12;
	}

	public String gettwiter1() {
		WebElement a13=settwiter();
		String b13=a13.getText();
		return b13;
	}

	public String getstreet1() {
		WebElement a14=setstreet();
		String b14=a14.getText();
		return b14;
	}

	public String getcity1() {
		WebElement a15=setcity();
		String b15=a15.getText();
		return b15;
	}

	public String getstate1() {
		WebElement a16=setstate();
		String b16=a16.getText();
		return b16;
	}

	public String getzip1() {
		WebElement a17=setzip();
		String b17=a17.getText();
		return b17;
	}

	public String getcountry1() {
		WebElement a18=setcountry();
		String b18=a18.getText();
		return b18;
	}

	public String getdescription1() {
		WebElement a19=setdescription();
		String b19=a19.getText();
		return b19;
	}

	


	
}
