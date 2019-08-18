package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageModel extends ModelBase{

	public PageModel(WebDriver x) {
		super(x);
		
	}

	public WebElement getlogin() throws InterruptedException {
		Actions ak=new Actions(driver);
		//Thread.sleep(4000);
		WebElement a=driver.findElement(By.xpath("//a[@class='zh-login']"));
		ak.moveToElement(a);		
		ak.build().perform();
		return a;	
	}
	
	
	
	
	
	
}
