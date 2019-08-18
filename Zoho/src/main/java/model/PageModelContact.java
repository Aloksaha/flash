package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModelContact extends PageModel5{

	public PageModelContact(WebDriver x) {
		super(x);
		
	}
	public WebElement setname() {
		WebElement a=driver.findElement(By.xpath("//div[@id='mouseArea__LASTNAME']/child::*[2]/child::*"));
		return a;
	}
	
	public WebElement setemail() {
		WebElement a1=driver.findElement(By.xpath("//div[@id='mouseArea__EMAIL']/child::*[2]/child::*"));
		return a1;
	}
	public WebElement setphone() {
		WebElement a2=driver.findElement(By.xpath("//div[@id='mouseArea__PHONE']/child::*[2]/child::*[2]"));
		return a2;
	}
	public WebElement settitle() {
		WebElement a3=driver.findElement(By.xpath("//div[@id='mouseArea__TITLE']/child::*[2]/child::*"));
		return a3;
	}
	public WebElement setophone() {
		WebElement a4=driver.findElement(By.xpath("//div[@id='mouseArea__OTHERPHONE']/child::*[2]/child::*[2]"));
		return a4;
	}
	public WebElement setdepartment() {
		WebElement a5=driver.findElement(By.xpath("//div[@id='mouseArea__DEPARTMENT']/child::*[2]/child::*"));
		return a5;
	}
	public WebElement setmobile() {
		WebElement a6=driver.findElement(By.xpath("//div[@id='mouseArea__MOBILE']/child::*[2]/child::*[2]"));
		return a6;
	}
	public WebElement sethphone() {
		WebElement a7=driver.findElement(By.xpath("//div[@id='mouseArea__HOMEPHONE']/child::*[2]/child::*[2]"));
		return a7;
	}
	public WebElement setassistant() {
		WebElement a8=driver.findElement(By.xpath("//div[@id='mouseArea__ASSISTANT']/child::*[2]/child::*"));
		return a8;
	}
	public WebElement setfax() {
		WebElement a9=driver.findElement(By.xpath("//div[@id='mouseArea__FAX']/child::*[2]/child::*"));
		return a9;
	}
	public WebElement setaphone() {
		WebElement a10=driver.findElement(By.xpath("//div[@id='mouseArea__ASSISTANTPHONE']/child::*[2]/child::*[2]"));
		return a10;
	}
	
	public WebElement setskype() {
		WebElement a11=driver.findElement(By.xpath("//a[contains(text(),'jasy@5432')]"));
		return a11;
	}
	
	public WebElement setsemail() {
		WebElement a12=driver.findElement(By.xpath("//a[@id='subvalue_ADDN_EMAIL']"));
		return a12;
	}
	public WebElement settwiter() {
		WebElement a13=driver.findElement(By.xpath("//a[@id='subvalue_TWITTER']"));
		return a13;
	}
	public WebElement setstreet() {
		WebElement a14=driver.findElement(By.xpath("//div[@id='mouseArea__MAILINGSTREET']/child::*[2]/child::*"));
		return a14;
	}
	public WebElement setcity() {
		WebElement a15=driver.findElement(By.xpath("//div[@id='mouseArea__MAILINGCITY']/child::*[2]/child::*"));
		return a15;
	}
	public WebElement setstate() {
		WebElement a16=driver.findElement(By.xpath("//div[@id='mouseArea__MAILINGSTATE']/child::*[2]/child::*"));
		return a16;
	}
	
	public WebElement setzip() {
		WebElement a17=driver.findElement(By.xpath("//div[@id='mouseArea__MAILINGZIP']/child::*[2]/child::*"));
		return a17;
	}
	public WebElement setcountry() {
		WebElement a18=driver.findElement(By.xpath("//div[@id='mouseArea__MAILINGCOUNTRY']/child::*[2]/child::*"));
		return a18;
	}
	public WebElement setdescription() {
		WebElement a19=driver.findElement(By.xpath("//div[@id='mouseArea__DESCRIPTION']/child::*[2]/child::*"));
		return a19;
	}
	
	
	
	

}
