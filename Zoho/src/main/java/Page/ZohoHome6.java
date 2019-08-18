package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModel6;

public class ZohoHome6 extends PageModel6{

	public ZohoHome6(WebDriver x) {
		super(x);
		
	}
public void setre1() throws InterruptedException {
		
		WebElement a=getrefresh2();
		Thread.sleep(4000);
		a.click();
	}
	public void setcrm2() {
		WebElement b=getcrm1();
		b.click();
	}
	public void setnew() {
		WebElement c=getnew();
		c.click();
	}
	public void setaccount() {
		WebElement d=getaccount();
		d.click();
	}
}
