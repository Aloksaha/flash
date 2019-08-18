package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel4 extends ModelBase {

	public PageModel4(WebDriver x) {
		super(x);
		
	}
	public WebElement getrefresh1() throws InterruptedException {
		driver.navigate().refresh();
		WebElement     d = driver.findElement(By.xpath("//button"));
				

			return d;
	}
public WebElement getcrm1() {
	
		WebElement b=driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']"));
		
		return b;
	}
	public WebElement getnew() {
		
		WebElement a=driver.findElement(By.xpath("//span[@id='createIcon']"));
		
		return a;
	}
	public WebElement getcontact() {
		WebElement b=driver.findElement(By.xpath("//a[@id='submenu_Contacts']"));
		
		return b;
	}

}
