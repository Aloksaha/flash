package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import model.PageModel7;



public class ZohoHome7 extends PageModel7 {

	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public ZohoHome7(WebDriver x) {
		super(x);
		
	}
	
	         

	
	public void setaccount (String y) {
		WebElement b=getaccount();
		b.sendKeys(y);
	}
	
	public void setphone (String y1) {
		WebElement b1=getphone();
		b1.sendKeys(y1);
	}
	public void setaccounts (String y2) {
		WebElement b2=getaccounts();
		b2.sendKeys(y2);
	}
	public void setfax (String y3) {
		WebElement b3=getfax();
		b3.sendKeys(y3);
	}
	public void setwebside (String y4) {
		WebElement b4=getwebside();
		b4.sendKeys(y4);
	}
	public void setanumber (String y5) {
		WebElement b5=getanumber();
		b5.sendKeys(y5);
	}
	public void setticker (String y6) {
		WebElement b6=getticker();
		b6.sendKeys(y6);
	}
	public void setemployees (String y7) {
		WebElement b7=getemployees();
		b7.sendKeys(y7);
	}
	public void setrevenue (String y8) {
		WebElement b8=getrevenue();
		b8.sendKeys(y8);
	}
	public void setsic (String y9) {
		WebElement b9=getsic();
		b9.sendKeys(y9);
	}
	public void setstreet (String y10) {
		WebElement b10=getstreet();
		b10.sendKeys(y10);
	}
	public void setcity (String y11) {
		WebElement b11=getcity();
		b11.sendKeys(y11);
	}
	public void setstate (String y12) {
		WebElement b12=getstate();
		b12.sendKeys(y12);
	}
	public void setcode (String y13) {
		WebElement b13=getcode();
		b13.sendKeys(y13);
	}
	public void setcountry (String y14) {
		WebElement b14=getcountry();
		b14.sendKeys(y14);
	}
	public void setcopyadd () {
		WebElement b15=getcopyadd();
		b15.click();
	}
	public void setcopy () {
		WebElement b16=getcopy();
		b16.click();
	}
	public void setdescription (String y17) {
		WebElement b17=getdescription();
		b17.sendKeys(y17);
	}
	public void setsave () throws InterruptedException {
		WebElement b18=getsave();
		b18.click();
	}
	public void setshow () throws InterruptedException  {
		
		WebElement b19=getshow();
		js.executeScript("window.scrollBy(0,900)");

		b19.click();
	}
	
	
	
	

}
