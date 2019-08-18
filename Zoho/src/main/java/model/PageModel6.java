package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel6 extends ModelBase {

	public PageModel6(WebDriver x) {
		super(x);
		
	}
	public WebElement getrefresh2() throws InterruptedException {
		driver.navigate().refresh();
		WebElement     a= driver.findElement(By.xpath("//button"));
				

			return a;
	}
public WebElement getcrm1() {
	
		WebElement b=driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']"));
		
		return b;
	}
	public WebElement getnew() {
		
		WebElement c=driver.findElement(By.xpath("//span[@id='createIcon']"));
		
		return c;
	}
	public WebElement getaccount() {
		WebElement d=driver.findElement(By.xpath("//a[@id='submenu_Accounts']"));
		return d;
	}
}
