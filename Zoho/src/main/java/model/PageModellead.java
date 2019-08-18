package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModellead extends ModelBase{

	public PageModellead(WebDriver x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getcompanyelement() {
		WebElement a=driver.findElement(By.xpath("//div[@id='mouseArea__COMPANY']/child::*[2]/child::*"));
		return a;
	}
	
	public WebElement getname() {
		WebElement a2=driver.findElement(By.xpath("//div[@id='mouseArea__LASTNAME']/child::*[2]/child::*"));
		return a2;
	}
	
	public WebElement gettitlename() {
		WebElement a1=driver.findElement(By.xpath("//div[@id='mouseArea__DESIGNATION']/child::*[2]/child::*"));
		return a1;
	}
	public WebElement getph() {
		WebElement a3=driver.findElement(By.xpath("//div[@id='mouseArea__PHONE']/child::*[2]/child::*[2]"));
		return a3;
	}

	
	public WebElement setemail() {
		WebElement a4=driver.findElements(By.xpath("//a[@id='subvalue_EMAIL']")).get(1);
		return a4;
	}
	
	public WebElement setmobile() {
		WebElement a5=driver.findElement(By.xpath("//div[@id='mouseArea__MOBILE']/child::*[2]/child::*[2]"));
		return a5;
	}
	public WebElement setfax() {
		WebElement a6=driver.findElement(By.xpath("//div[@id='mouseArea__FAX']/child::*[2]/child::*"));
		return a6;
	}
	public WebElement setrevenue() {
		WebElement a7=driver.findElement(By.xpath("//div[@id='mouseArea__ANNUALREVENUE']/child::*[2]/child::*"));
		return a7;
	}
	public WebElement setwebsite() {
		WebElement a8=driver.findElement(By.xpath("//a[@id='subvalue_WEBSITE']"));
		return a8;
	}
	public WebElement setemployees() {
		WebElement a9=driver.findElement(By.xpath("//div[@id='mouseArea__EMPCT']/child::*[2]/child::*"));
		return a9;
	}
	public WebElement setskype() {
		WebElement a10=driver.findElement(By.xpath("//a[@id='subvalue_SKYPEIDENTITY']"));
		return a10;
	}
	public WebElement settwiter() {
		WebElement a11=driver.findElement(By.xpath("//a[@id='subvalue_TWITTER']"));
		return a11;
	}
	
	public WebElement setseemail() {
		WebElement a12=driver.findElement(By.xpath("//a[@id='subvalue_ADDN_EMAIL']"));
		return a12;
	}
	
	public WebElement setstreet() {
		WebElement a13=driver.findElement(By.xpath("//div[@id='mouseArea__LANE']/child::*[2]/child::*"));
		return a13;
	}
	
	public WebElement setcity() {
		WebElement a14=driver.findElement(By.xpath("//div[@id='mouseArea__CITY']/child::*[2]/child::*"));
		return a14;
	}
	public WebElement setstate() {
		WebElement a15=driver.findElement(By.xpath("//div[@id='mouseArea__STATE']/child::*[2]/child::*"));
		return a15;
	}
	public WebElement setzip() {
		WebElement a16=driver.findElement(By.xpath("//div[@id='mouseArea__CODE']/child::*[2]/child::*"));
		return a16;
	}
	public WebElement setcountry() {
		WebElement a17=driver.findElement(By.xpath("//div[@id='mouseArea__COUNTRY']/child::*[2]/child::*"));
		return a17;
	}
	
	public WebElement setdescription() {
		WebElement a18=driver.findElement(By.xpath("//pre[@id='subvalue_DESCRIPTION']"));
		return a18;
	}
	
	
	
	
}
