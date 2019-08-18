package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageModel7 extends ModelBase{

	
	public PageModel7(WebDriver x) {
		super(x);
		
	}
	public WebElement getaccount () {
		WebElement a=driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']"));
		return a;
	}
	public WebElement getphone () {
		WebElement a1=driver.findElement(By.xpath("//input[@id='Crm_Accounts_PHONE']"));
		return a1;
	}
	public WebElement getaccounts () {
		WebElement a2=driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTSITE']"));
		return a2;
	}
	public WebElement getfax () {
		WebElement a3=driver.findElement(By.xpath("//input[@id='Crm_Accounts_FAX']"));
		return a3;
	}
	public WebElement getwebside () {
		WebElement a4=driver.findElement(By.xpath("//input[@id='Crm_Accounts_WEBSITE']"));
		return a4;
	}
	public WebElement getanumber () {
		WebElement a5=driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNUMBER']"));
		return a5;
	}
	public WebElement getticker () {
		WebElement a6=driver.findElement(By.xpath("//input[@id='Crm_Accounts_TICKERSYMBOL']"));
		return a6;
	}
	public WebElement getemployees () {
		WebElement a7=driver.findElement(By.xpath("//input[@id='Crm_Accounts_EMPLOYEES']"));
		return a7;
	}
	public WebElement getrevenue () {
		WebElement a8=driver.findElement(By.xpath("//input[@id='Crm_Accounts_ANNUALREVENUE']"));
		return a8;
	}
	public WebElement getsic () {
		WebElement a9=driver.findElement(By.xpath("//input[@id='Crm_Accounts_SICCODE']"));
		return a9;
	}
	public WebElement getstreet () {
		WebElement a10=driver.findElement(By.xpath("//input[@id='Crm_Accounts_BILLINGSTREET']"));
		return a10;
	}
	public WebElement getcity () {
		WebElement a11=driver.findElement(By.xpath("//input[@id='Crm_Accounts_BILLINGCITY']"));
		return a11;
	}
	public WebElement getstate () {
		WebElement a12=driver.findElement(By.xpath("//input[@id='Crm_Accounts_BILLINGSTATE']"));
		return a12;
	}
	public WebElement getcode () {
		WebElement a13=driver.findElement(By.xpath("//input[@id='Crm_Accounts_BILLINGCODE']"));
		return a13;
	}
	public WebElement getcountry () {
		WebElement a14=driver.findElement(By.xpath("//input[@id='Crm_Accounts_BILLINGCOUNTRY']"));
		return a14;
	}
	public WebElement getcopyadd () {
		WebElement a15=driver.findElement(By.xpath("//input[@id='copyAddress']"));
		return a15;
	}
	public WebElement getcopy () {
		WebElement a16=driver.findElement(By.xpath("//div[@id='copy']//ul/child::*[1]"));
		return a16;
	}
	public WebElement getdescription () {
		WebElement a17=driver.findElement(By.xpath("//textarea[@id='Crm_Accounts_DESCRIPTION']"));
		return a17;
	}
	public WebElement getsave() throws InterruptedException {
		Thread.sleep(5000);
		WebElement t=driver.findElement(By.xpath("//input[@id='saveAccountsBtn']"));
		return t;
	}
	public WebElement getshow() throws InterruptedException {
		Thread.sleep(5000);
			
		WebElement t1=driver.findElement(By.xpath("//a[@id='showmore']"));
		return t1;
	}
}
