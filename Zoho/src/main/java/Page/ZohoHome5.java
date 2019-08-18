package Page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.PageModel5;

public class ZohoHome5 extends PageModel5 {

	public ZohoHome5(WebDriver x) {
		super(x);
		
	}
	public void setsource() {
		
		WebElement a=getsource();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	a.click();
		js.executeScript("arguments[0].click();", a);

	WebElement aa=getsource1();
	aa.sendKeys("Cold Call");
	aa.sendKeys(Keys.ENTER);
	js.executeScript("window.scrollBy(0,900)");


	}
	public void setfname(String x1) {
		WebElement a1=getfname();
		a1.sendKeys(x1);
	}
	public void setlname(String x2) {
		WebElement a2=getlname();
		a2.sendKeys(x2);
	}
	public void setaccount(String xx) {
		WebElement aa=getaccountn();
		Select ss=new Select(aa);
		ss.selectByVisibleText(xx);
	}
	public void setemail(String x3) {
		WebElement a3=getemail();
		a3.sendKeys(x3);
	}
	public void settitle(String x4) {
		WebElement a4=gettitle();
		a4.sendKeys(x4);
	}
	public void setphone(String x5) {
		WebElement a5=getphone();
		a5.sendKeys(x5);
	}
	public void setdepartment(String x6) {
		WebElement a6=getdepartment();
		a6.sendKeys(x6);
	}
	public void setophone(String x7) {
		WebElement a7=getophone();
		a7.sendKeys(x7);
	}
	public void sethphone(String x8) {
		WebElement a8=gethphone();
		a8.sendKeys(x8);
	}
	public void setmobile(String x9) {
		WebElement a9=getmobile();
		a9.sendKeys(x9);
	}
	public void setfax(String x10) {
		WebElement a10=getfax();
		a10.sendKeys(x10);
	}
	public void setassistant(String x11) {
		WebElement a11=getassistant();
		a11.sendKeys(x11);
	}
	public void setasst(String x12) {
		WebElement a12=getasst();
		a12.sendKeys(x12);
	}
	public void setemailout() {
		WebElement a=getemailout();
		a.click();;
	}
	public void setskype(String x13) {
		WebElement a13=getskype();
		a13.sendKeys(x13);
	}
	public void setseemail(String x14) {
		WebElement a14=getseemail();
		a14.sendKeys(x14);
	}
	public void settwitter(String x15) {
		WebElement a15=gettwitter();
		a15.sendKeys(x15);
	}
	public void setstreet(String x16) {
		WebElement a16=getstreet();
		a16.clear();
		a16.sendKeys(x16);
	}
	public void setcity(String x17) {
		WebElement a17=getcity();
		a17.clear();
		a17.sendKeys(x17);
	}
	public void setstate(String x18) {
		WebElement a18=getstate();
		a18.clear();
		a18.sendKeys(x18);
	}
	public void setzip(String x19) {
		WebElement a19=getzip();
		a19.sendKeys(x19);
	}
	public void setcountry(String x20) {
		WebElement a20=getcountry();
		a20.sendKeys(x20);
	}
	public void setcopy() {
		WebElement b=getcopy();
		b.click();
		WebElement c=getcopyadd();
		c.click();
	}
	public void setdiscription(String d1) {
		WebElement d=getdricription();
		d.sendKeys(d1);
	}
	public void setsave() throws InterruptedException {
		WebElement e=getsave();
		Thread.sleep(4000);
		e.click();
	}
	public void setdob(String r) {
		
		WebElement f=getdob();
		f.sendKeys(r);
	}
	
	
}
