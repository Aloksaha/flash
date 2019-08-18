package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel8 extends ModelBase{

	public PageModel8(WebDriver x) {
		super(x);
		
	}
	
	public WebElement gethome() {
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		return a;
	}
	
	public WebElement getleads() {
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		return b;
	}
	
	public WebElement getcontacts() {
		WebElement c=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		return c;
	}
	
	public WebElement getaccounts() {
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		return b;
	}
	
}
