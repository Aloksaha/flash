package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import model.PageModel3;

public class ZohoHome3 extends PageModel3 {
	JavascriptExecutor js = (JavascriptExecutor)driver;

	public ZohoHome3(WebDriver driver) {
		super(driver);
		
	}
	public void  set() throws InterruptedException {
		WebElement l=get();
		
		//l.click();
		js.executeScript("arguments[0].click();", l);

	}
	public void setcompany(String x) {
		WebElement a=getcompany();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;

		//js.executeScript("arguments[0].click();", a);
		js1.executeScript("arguments[0].value='"+x+"';" , a);
		//a.sendKeys(x);
	}
	public void setfname(String x1) {
		WebElement a1=getfname();
		js.executeScript("arguments[0].value='"+x1+"';" , a1);

		//a1.sendKeys(x1);
	}
	public void setlname(String x2) {
		WebElement a2=getlname();
		if(a2!=null)
		js.executeScript("arguments[0].value='"+x2+"';" , a2);

		//a2.sendKeys(x2);
	}
	public void settitle(String x3) {
		WebElement a3=gettitle();
		js.executeScript("arguments[0].value='"+x3+"';" , a3);

		//a3.sendKeys(x3);
	}
	public void setemail(String x4) {
		WebElement a4=getemail();
		js.executeScript("arguments[0].value='"+x4+"';" , a4);

		//a4.sendKeys(x4);
	}
	public void setphone(String x5) {
		WebElement a5=getphone();
		js.executeScript("arguments[0].value='"+x5+"';" , a5);

		//a5.sendKeys(x5);
	}
	public void setfax(String x6) {
		WebElement a6=getfax();
		js.executeScript("arguments[0].value='"+x6+"';" , a6);

		//a6.sendKeys(x6);
	}
	public void setmobile(String x7) {
		WebElement a7=getmobile();
		js.executeScript("arguments[0].value='"+x7+"';" , a7);

		//a7.sendKeys(x7);
	}
	public void setwebsite(String x8) throws InterruptedException {
	//	Thread.sleep(4000);
		WebElement a8=getwebsite();
		js.executeScript("arguments[0].value='"+x8+"';" , a8);

		//a8.sendKeys(x8);
	}
	public void setsource() throws InterruptedException {

		WebElement a9=getsource();
		//a9.click();
		js.executeScript("arguments[0].click();", a9);

	WebElement a91=getsource1();
	a91.sendKeys("Cold Call");
	a91.sendKeys(Keys.ENTER);
	js.executeScript("window.scrollBy(0,900)");


	}
	public void setstatus() throws InterruptedException {
		Thread.sleep(4000);

		WebElement a100=getstatus();
		js.executeScript("arguments[0].click();", a100);

		
		WebElement a101=getstatus1();
		js.executeScript("arguments[0].click();", a101);
	
	}
	public void setindustry() throws InterruptedException {
		Thread.sleep(4000);
		WebElement a11=getindustry();
		js.executeScript("arguments[0].click();", a11);
	
	
		WebElement a111=getindustry1();
		a111.sendKeys("Government/Military");
		a111.sendKeys(Keys.ENTER);
		
	}
	public void setemployees(String x12) throws InterruptedException {
		WebElement a12=getemployees();
		js.executeScript("arguments[0].value='"+x12+"';" , a12);

		//a12.sendKeys(x12);
	}
	public void setrevenue(String x13)  {
		WebElement a13=getrevenue();
		js.executeScript("arguments[0].value='"+x13+"';" , a13);

		//a13.sendKeys(x13);
	}
	public void setrating() {
		WebElement a14=getindustry();
		js.executeScript("arguments[0].click();", a14);

	//a14.click();
	}
	public void setrating1() {
		WebElement a141=getindustry1();
		js.executeScript("arguments[0].click();", a141);

		//a141.click();
	}

	public void setclick() throws InterruptedException {
				
		WebElement a14=getclick();
		js.executeScript("arguments[0].click();", a14);
		
		//a14.click();
		
		
	}
	public void setskype(String x15) {
		WebElement a15=getskype();
		js.executeScript("arguments[0].value='"+x15+"';" , a15);

		//a15.sendKeys(x15);
	}
	public void settwitter(String x16) {
		WebElement a16=gettwitter();
		js.executeScript("arguments[0].value='"+x16+"';" , a16);

		//a16.sendKeys(x16);
	}
	public void setseemail(String x17) {
		WebElement a17=getseemail();
		js.executeScript("arguments[0].value='"+x17+"';" , a17);

		//a17.sendKeys(x17);
	}
	public void setsave() throws InterruptedException {
		WebElement a18=getsave();
		js.executeScript("arguments[0].click();", a18);

		//a18.click();
	}
	public void setstreet(String x19)  {
		WebElement a19=getstreet();
		js.executeScript("arguments[0].value='"+x19+"';" , a19);
	}
	public void setcity(String x20)  {
		WebElement a20=getcity();
		js.executeScript("arguments[0].value='"+x20+"';" , a20);
	}
	public void setstate(String x21)  {
		WebElement a21=getstate();
		js.executeScript("arguments[0].value='"+x21+"';" , a21);
	}
	public void setzip(String x22)  {
		WebElement a22=getzip();
		js.executeScript("arguments[0].value='"+x22+"';" , a22);
	}
	public void setcountry(String x23)  {
		WebElement a23=getcountry();
		js.executeScript("arguments[0].value='"+x23+"';" , a23);
	}
	public void setdescription(String x24)  {
		WebElement a24=getdescription();
		js.executeScript("arguments[0].value='"+x24+"';" , a24);
	}
	
}
