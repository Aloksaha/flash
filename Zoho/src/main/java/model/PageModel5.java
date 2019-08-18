package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel5 extends ModelBase{

	public PageModel5(WebDriver x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public WebElement getsource() {
		//Thread.sleep(5000);
		
		WebElement j = driver.findElement(By.xpath("//*[@id='Crm_Contacts_LEADSOURCE']"));
		return j;
	}
	public WebElement getsource1() {
		//Thread.sleep(4000);
		WebElement j1 = driver.findElement(By.xpath("//input[@type='search']"));
		return j1;
	}

		
	public WebElement getfname() {
		WebElement a=driver.findElement(By.xpath("//input[@id='Crm_Contacts_FIRSTNAME']"));
		return a;
	}
	public WebElement getlname() {
		WebElement a1=driver.findElement(By.xpath("//input[@id='Crm_Contacts_LASTNAME']"));
		return a1;
	}
	public WebElement getaccountn() {
		WebElement ba=driver.findElement(By.xpath("//input[@id='Crm_Contacts_ACCOUNTID']"));
		return ba;
	}
//	public WebElement getaccountn1() {
//		WebElement ba1=driver.findElement(By.xpath(""));
//		return ba1;
//	}
	public WebElement getemail() {
		WebElement a2=driver.findElement(By.xpath("//input[@id='Crm_Contacts_EMAIL']"));
		return a2;
	}
	public WebElement gettitle() {
		WebElement a3=driver.findElement(By.xpath("//input[@id='Crm_Contacts_TITLE']"));
		return a3;
	}
	public WebElement getphone() {
		WebElement a4=driver.findElement(By.xpath("//input[@id='Crm_Contacts_PHONE']"));
		return a4;
	}
	public WebElement getdepartment() {
		WebElement a5=driver.findElement(By.xpath("//input[@id='Crm_Contacts_DEPARTMENT']"));
		return a5;
	}
	public WebElement getophone() {
		WebElement a6=driver.findElement(By.xpath("//input[@id='Crm_Contacts_OTHERPHONE']"));
		return a6;
	}
	public WebElement gethphone() {
		WebElement a7=driver.findElement(By.xpath("//input[@id='Crm_Contacts_HOMEPHONE']"));
		return a7;
	}
	public WebElement getmobile() {
		WebElement a8=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MOBILE']"));
		return a8;
	}
	public WebElement getfax() {
		WebElement a9=driver.findElement(By.xpath("//input[@id='Crm_Contacts_FAX']"));
		return a9;
	}
	public WebElement getassistant() {
		WebElement a10=driver.findElement(By.xpath("//input[@id='Crm_Contacts_ASSISTANT']"));
		return a10;
	}
	public WebElement getasst() {
		WebElement a11=driver.findElement(By.xpath("//input[@id='Crm_Contacts_ASSISTANTPHONE']"));
		return a11;
	}
	public WebElement getemailout() {
		WebElement a12=driver.findElement(By.xpath("//input[@id='Crm_Contacts_EMAILOPTOUT']"));
		return a12;
	}
	public WebElement getskype() {
		WebElement a13=driver.findElement(By.xpath("//input[@id='Crm_Contacts_SKYPEIDENTITY']"));
		return a13;
	}
	public WebElement getseemail() {
		WebElement a14=driver.findElement(By.xpath("//input[@id='Crm_Contacts_ADDN_EMAIL']"));
		return a14;
	}
	public WebElement gettwitter() {
		WebElement a15=driver.findElement(By.xpath("//input[@id='Crm_Contacts_TWITTER']"));
		return a15;
	}
	public WebElement getstreet() {
		WebElement a16=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MAILINGSTREET']"));
		return a16;
	}
	public WebElement getcity() {
		WebElement a17=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MAILINGCITY']"));
		return a17;
	}
	public WebElement getstate() {
		WebElement a18=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MAILINGSTATE']"));
		return a18;
	}
	public WebElement getzip() {
		WebElement a19=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MAILINGZIP']"));
		return a19;
	}
	public WebElement getcountry() {
		WebElement a20=driver.findElement(By.xpath("//input[@id='Crm_Contacts_MAILINGCOUNTRY']"));
		return a20;
	}
	public WebElement getcopy() {
		WebElement a21=driver.findElement(By.xpath("//input[@id='copyAddress']"));
		return a21;
	}
	public WebElement getcopyadd() {
		WebElement a22=driver.findElement(By.xpath("//div[@id='copy']//ul/child::*[1]"));
		return a22;
	}
	public WebElement getdricription() {
		WebElement a23=driver.findElement(By.xpath("//textarea[@id='Crm_Contacts_DESCRIPTION']"));
		return a23;
	}
	public WebElement getsave() throws InterruptedException {
		//Thread.sleep(5000);
		WebElement t=driver.findElement(By.xpath("//input[@id='saveContactsBtn']"));
		return t;
	}
	public WebElement getdob() {
		WebElement s=driver.findElement(By.xpath("//input[@id='Crm_Contacts_BIRTHDAY']"));
		return s;
	}
	
	
	
}
