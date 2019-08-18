package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModelAccount extends ModelBase{

	public PageModelAccount(WebDriver x) {
		super(x);
		
	}
	public WebElement setaname2() {
		WebElement a=driver.findElement(By.xpath("//div[@id='mouseArea__ACCOUNTNAME']/child::*[2]/child::*"));
		return a;
	}
	
	public WebElement setphone2() {
		WebElement a1=driver.findElement(By.xpath("//div[@id='mouseArea__PHONE']/child::*[2]/child::*[2]"));
		return a1;
	}
	
	public WebElement setsite2() {
		WebElement a2=driver.findElement(By.xpath("//div[@id='mouseArea__ACCOUNTSITE']/child::*[2]/child::*"));
		return a2;
	}
	
	public WebElement setfax2() {
		WebElement a3=driver.findElement(By.xpath("//div[@id='mouseArea__FAX']/child::*[2]/child::*"));
		return a3;
	}
	
	public WebElement setwebsite2() {
		WebElement a4=driver.findElement(By.xpath("//div[@id='mouseArea__WEBSITE']/child::*[2]/child::*"));
		return a4;
	}
	
	public WebElement setanumber2() {
		WebElement a5=driver.findElement(By.xpath("//div[@id='mouseArea__ACCOUNTNUMBER']/child::*[2]/child::*"));
		return a5;
	}
	
	public WebElement setticker2() {
		WebElement a6=driver.findElement(By.xpath("//div[@id='mouseArea__TICKERSYMBOL']/child::*[2]/child::*"));
		return a6;
	}
	
	public WebElement setemployees2() {
		WebElement a7=driver.findElement(By.xpath("//div[@id='mouseArea__EMPLOYEES']/child::*[2]/child::*"));
		return a7;
	}
	
	public WebElement setrevenue2() {
		WebElement a8=driver.findElement(By.xpath("//div[@id='mouseArea__ANNUALREVENUE']/child::*[2]/child::*"));
		return a8;
	}
	
	public WebElement setstreet2() {
		WebElement a9=driver.findElement(By.xpath("//div[@id='mouseArea__BILLINGSTREET']/child::*[2]/child::*"));
		return a9;
	}
	
	public WebElement setcity2() {
		WebElement a10=driver.findElement(By.xpath("//div[@id='mouseArea__BILLINGCITY']/child::*[2]/child::*"));
		return a10;
	}
	
	public WebElement setstate2() {
		WebElement a11=driver.findElement(By.xpath("//div[@id='mouseArea__BILLINGSTATE']/child::*[2]/child::*"));
		return a11;
	}
	
	public WebElement setcode2() {
		WebElement a12=driver.findElement(By.xpath("//div[@id='mouseArea__BILLINGCODE']/child::*[2]/child::*"));
		return a12;
	}
	
	public WebElement setcountry2() {
		WebElement a13=driver.findElement(By.xpath("//div[@id='mouseArea__BILLINGCOUNTRY']/child::*[2]/child::*"));
		return a13;
	}
	
	public WebElement setdescription2() {
		WebElement a14=driver.findElement(By.xpath("//div[@id='mouseArea__DESCRIPTION']/child::*[2]/child::*"));
		return a14;
	}
	
	
	
	

}
