package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel2 extends ModelBase{

	public PageModel2(WebDriver x) {
		super(x);
		
	}
	

	public WebElement getrefresh() throws InterruptedException {
		driver.navigate().refresh();
		WebElement     a = driver.findElement(By.xpath("//button"));
				

			return a;
	}
	
	public WebElement getcrm() {
		
		WebElement b=driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']"));
		
		return b;
	}
	
	public WebElement getleads() {
		WebElement c=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		
		return c;
	}
	
	public WebElement getnew() {
		WebElement d=driver.findElement(By.xpath("//span[@id='createIcon']"));
		
		return d;
	}
	
	
	public WebElement getne() {
		WebElement d=driver.findElement(By.xpath("//a[@id='submenu_Leads']"));
		
		return d;
	}
	
	
	
	
	
}
