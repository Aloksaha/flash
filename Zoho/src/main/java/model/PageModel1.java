package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel1  extends ModelBase{

	public PageModel1(WebDriver x) {
		super(x);
		
	}
	public static WebElement getemail() {
		WebElement b=driver.findElement(By.xpath("//input[@id='lid']"));
		return b;
	}
	public WebElement getpass() {
		WebElement c=driver.findElement(By.xpath("//input[@id='pwd']"));
		return c;
	}
	public WebElement signin() {
		WebElement d=driver.findElement(By.xpath("//div[@id='signin_submit']"));
		return d;
	}

}
